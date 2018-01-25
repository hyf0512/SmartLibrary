var init = function () {
	var width = window.screen.width;
	var height = window.screen.height;
    var unitWidth = width / 12;
    var unitHeight = height / 12;
	// $('.book-img').css({
	// 	"left": unitWidth / 4,
    //     "top": unitWidth / 4,
    //     "width": unitWidth * 2,
    //     "height": unitWidth * 6
	// });
    // $('#img').css({
    //     "width": unitWidth * 2,
    //     "height": unitWidth * 3
    // });
    $('.book-detail').css({
        "width": unitWidth * 11,
        "height": unitHeight * 5.5,
        "maxHeight": "250px"
    });
    $('.item-title').css({
        "width": unitWidth * 3
    });
    $('.item-content').css({
        "width": unitWidth * 8
    });
    $('.collectionInfo').css({
        "width": unitWidth * 11
    });
    $('.collection').css({
        "width": unitWidth * 11
    });

    var param = new Object();
    param = getParam();
    //判断url中是否传了数据
    if (param["book_name"] == null || param["book_name"] == "") {
        $('#book_name').text("暂无");
    } else {
        if(param["book_name"].length > 30){
            param["book_name"] = param["book_name"].substr(0, 30) + "...";
        }
        $('#book_name').text(param["book_name"]);
    }
    if (param["status"] == null || param["status"] == "") {
        $('#status').text("暂无");
    } else if(param["status"] == "1"){
        $('#status').text("纸质书");
    } else if(param["status"] == "0"){
        $('#status').text("电子书");
    } else $('#status').text(param["status"]);

    if (param["author"] == null || param["author"] == "") {
        $('#author').text("暂无");
    } else {
        if(param["author"].length > 15){
            param["author"] = param["author"].substr(0, 15) + "...";
        }
        $('#author').text(param["author"]);
    }

    if (param["ISBN"] == null || param["ISBN"] == "") {
        $('#ISBN').text("暂无");
    } else $('#ISBN').text(param["ISBN"]);

    if (param["CLCNumber"] == null || param["CLCNumber"] == "") {
        $('#CLCNumber').text("暂无");
    } else $('#CLCNumber').text(param["CLCNumber"]);

    if (param["type"] == null || param["type"] == "") {
        $('#type').text("暂无");
    } else $('#type').text(param["type"]);

    if (param["publisher"] == null || param["publisher"] == "") {
        $('#publisher').text("暂无");
    } else $('#publisher').text(param["publisher"]);

    if (param["publishDate"] == null || param["publishDate"] == "") {
        $('#publishDate').text("暂无");
    } else $('#publishDate').text(param["publishDate"] + "年");

    if (param["borrow_num"] == null || param["borrow_num"] == "") {
        $('#borrow_num').text("暂无");
    } else $('#borrow_num').text(param["borrow_num"] + "人");

    if (param["call_num"] == null || param["call_num"] == "") {
        $('#call_num').text("暂无");
    } else $('#call_num').text(param["call_num"]);

    if (param["bar_code"] == null || param["bar_code"] == "") {
        $('#bar_code').text("暂无");
    } else $('#bar_code').text(param["bar_code"]);

    if (param["location"] == null || param["location"] == "") {
        $('#location').text("暂无");
    } else $('#location').text(param["location"]);

    if (param["store"] == null || param["store"] == "") {
        $('#store').text("暂无");
    } else $('#store').text(param["store"] + "本");
};
$(document).ready(init);

//链接格式
//http://localhost:3000/library?param1=value1&param2=value2....
function getParam() {   
   var url = location.search; //获取url中"?"符后的字串   
   var theRequest = new Object();   
   if (url.indexOf("?") != -1) {   
      var str = url.substr(1);   
      strs = str.split("&");   
      for(var i = 0; i < strs.length; i ++) {   
         theRequest[strs[i].split("=")[0]]=decodeURI(strs[i].split("=")[1]);   
      }   
   }   
   return theRequest;   
}   