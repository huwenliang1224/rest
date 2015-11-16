<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<head>
<title>Spring3 RESTful</title>
<script type="text/javascript" src="/js/jquery-1.11.3.min.js"></script>
<script type="text/javascript">

	function do_delete() {
		$.ajax({  
	        type : 'delete',  
	        contentType : 'application/json',  
	        url : 'http://localhost:8080/restSample1/simple/1',  
	        processData : false,  
	        dataType : 'json',  
	        data : "",  
	        success : function(data) {  
	            alert(data.type);  
	        },  
	        error : function(e) {  
	            alert(e);  
	        }  
	    });
	}
</script>
</head>
<body>

	<input id="btn1" type="button" value="delete" onclick="do_delete();">

</body>
</html>
