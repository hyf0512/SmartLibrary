package com.smartlibrary.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartlibrary.dao.SchoolDao;
import com.smartlibrary.domain.School;
import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.AlibabaAliqinFcSmsNumSendRequest;
import com.taobao.api.response.AlibabaAliqinFcSmsNumSendResponse;

@Service
public class testUserPostService {
	//private static final Logger logger = Logger.getLogger(testUserService.class);
	private static final Logger logger = Logger.getLogger(testUserPostService.class);
	@Autowired
	private SchoolDao testuserdao;
	public void getschool1() throws Exception{
		logger.info("测试开始");
		String url="http://gw.api.taobao.com/router/rest";//联创信息
		String appkey="24604315";
		String secret="5ec353157b857b0189d80bee79619496";
		TaobaoClient client = new DefaultTaobaoClient(url, appkey, secret);
		AlibabaAliqinFcSmsNumSendRequest req = new AlibabaAliqinFcSmsNumSendRequest();
		req.setExtend("123456");
		req.setSmsType("normal");
		req.setSmsFreeSignName("联创信息");
		req.setSmsParamString("{\"code\":\"869529\"}");		
		req.setRecNum("15757115265");
		req.setSmsTemplateCode("SMS_90335010");
		AlibabaAliqinFcSmsNumSendResponse rsp = client.execute(req);
		System.out.println(rsp.getBody());
		logger.info("测试结束");
		
	}
	
}
