function register()
     {
    	 var uname = document.getElementById("username1").value;
    	 var upwd = document.getElementById("userpassword1").value;
//    	 document.getElementById("login").disabled="true";
    	 var xmlhttp = new XMLHttpRequest();
    	 xmlhttp.onreadystatechange = function()
    	 {
    		 if(xmlhttp.readyState == 4 && xmlhttp.status == 200)
    		{
				document.getElementById("span").innerHTML = xmlhttp.responseText;
//    			location.reload(); 刷新页面
			}
    	 }
    	 xmlhttp.open("POST","UserRegisterServlet.do?uname="+uname+"&upwd="+upwd,"true");
    	 xmlhttp.setRequestHeader("Content-type","application/x-www-form-urlencoded");
    	 xmlhttp.send();
     }