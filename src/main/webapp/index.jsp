<html>
<script type="text/javascript" src="js/jquery-min.js"></script>
<script type="text/javascript">
	$(function(){
		var school_id=1;
		var name="浙江工业大学";
		
		$.ajax({
	 		type:"post",
	 		contentType: 'application/json',
	 		url:"version1",
	 		data:JSON.stringify({
					school_id:school_id,
					name:name}),
	 		async:false,
	 		dataType: 'json',
			success: function(data, textStatus, jqXHR){
				console.log(data);
			}
		});
	});
</script>
<body>
<h2>Hello World!</h2>
</body>
</html>
