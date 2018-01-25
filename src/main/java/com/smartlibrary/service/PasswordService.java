package com.smartlibrary.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.smartlibrary.dao.RegisterDao;
import com.smartlibrary.dao.UserDao;
import com.smartlibrary.domain.User;
import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.AlibabaAliqinFcSmsNumSendRequest;
import com.taobao.api.response.AlibabaAliqinFcSmsNumSendResponse;

@Service
public class PasswordService {
	@Autowired
	private RegisterDao registerdao;
	public Map<String,String> SendMsg(String phone) throws Exception{
		Map<String,String> sendresult = new HashMap<String, String>();
		if(registerdao.ifuserexist(phone)==null){
			sendresult.put("result", "0");
			sendresult.put("err_msg", "该号码所对应的帐号不存在");
		}
		else{
			String yzm=String.valueOf((int)((Math.random()*9+1)*100000));
			String SmsParamString="{\"code\":\""+yzm+"\"}";
			String url="http://gw.api.taobao.com/router/rest";//联创信息
			String appkey="24604315";
			String secret="5ec353157b857b0189d80bee79619496";
			TaobaoClient client = new DefaultTaobaoClient(url, appkey, secret);
			AlibabaAliqinFcSmsNumSendRequest req = new AlibabaAliqinFcSmsNumSendRequest();
			req.setExtend("123456");
			req.setSmsType("normal");
			req.setSmsFreeSignName("联创信息");
			req.setSmsParamString(SmsParamString);
			req.setRecNum(phone);
			req.setSmsTemplateCode("SMS_90335010");
			AlibabaAliqinFcSmsNumSendResponse rsp = client.execute(req);
			JSONObject result = JSONObject.parseObject(rsp.getBody());
			result = result.getJSONObject("alibaba_aliqin_fc_sms_num_send_response").getJSONObject("result");
			if(result.getString("err_code").equals("0")){
				sendresult.put("result", "1");
				sendresult.put("err_msg", "发送成功");
				sendresult.put("code", yzm);
			}
			else{
				sendresult.put("result", "0");
				sendresult.put("err_msg", result.getString("msg"));
			}
			System.out.println(result);
		}
		return sendresult;
	}
	public Map<String,String> editpassword(User user){
		Map<String,String> result = new HashMap<String, String>();
		if(registerdao.ifuserexist(user.getAccount())==null){
			result.put("result", "0");
			result.put("err_msg", "该帐号不存在");
		}
		else{
			try{
				registerdao.editpassword(user);
				result.put("result", "1");
				result.put("err_msg", "重置密码成功");
			}
			catch(Exception e){
				result.put("result", "0");
				result.put("err_msg", "重置错误");
			}
		}
		return result;
	}
	public Map<String,String> updatepassword(User user){
		Map<String,String> result = new HashMap<String, String>();
		if(registerdao.ifuserexist(user.getAccount())==null){
			result.put("result", "0");
			result.put("err_msg", "该帐号不存在");
		}
		else{
			if(registerdao.getpassword(user.getAccount()).equals(user.getOldpassword())){
				try{
					registerdao.updatepassword(user);
					result.put("result", "1");
					result.put("err_msg", "修改成功");
				}
				catch(Exception e){
					result.put("result", "0");
					result.put("err_msg", "修改失败");
				}
			}
			else{
				result.put("result", "0");
				result.put("err_msg", "原密码不正确");
			}
		}
		return result;
	}
}
