//刷新验证码
     function changeImg()
     {
         document.getElementById("validateCodeImg").src="CheckCodeServlet.do?"+Math.random();
     }
     
     
     
     function submit()
     {
    	 var uname = document.getElementById("username").value;
    	 var upwd = document.getElementById("userpassword").value;
    	 var validateCode = document.getElementById("validateCode").value;
    	 var nologin = document.getElementById("nologin").value;
    	 document.getElementById("login").disabled="true";
    	 document.getElementById("register").disabled="true";
    	 var xmlhttp = new XMLHttpRequest();
    	 xmlhttp.onreadystatechange = function()
    	 {
    		 if(xmlhttp.readyState == 4 && xmlhttp.status == 200)
    		{
    			 document.getElementById("login").disabled="flase";
    			document.getElementById("register").disabled="flase";
//				document.getElementById("span").innerHTML = xmlhttp.responseText;
    			if(xmlhttp.responseText=="1"||xmlhttp.responseText=="2")
    			{
    				document.getElementById("username").value = "";
    				document.getElementById("userpassword").value = "";
    				document.getElementById("validateCode").value = "";
    				document.getElementById("nologin").value = "yes";
    				if(xmlhttp.responseText=="1")
    				{
    					document.getElementById("span").innerHTML = "用户名或者密码错误！";
    				}
    				else
    				{
    					document.getElementById("span").innerHTML = "验证码错误！";
    				}
    			}
    			location.reload();
			}
    	 }
    	 xmlhttp.open("POST","LoginController.do?uname="+uname+"&upwd="+upwd+"&validateCode="+validateCode+"&nologin="+nologin,"true");
    	 xmlhttp.setRequestHeader("Content-type","application/x-www-form-urlencoded");
    	 xmlhttp.send();
     }
     
     function checkFill()
     {
    	 var uname = document.getElementById("username").value;
    	 var upwd = document.getElementById("userpassword").value;
    	 var validateCode = document.getElementById("validateCode").value;
    	 
    	 if(uname=="")
    	{
    		 document.getElementById("us").innerHTML="请填写用户名!";
    		 document.getElementById("us").style.color="red";
    	}
    	 else
    	{
    		 document.getElementById("us").innerHTML="yes!";
    		 document.getElementById("us").style.color="green";
    	}
    	 
    	 if(upwd=="")
     	{
     		 document.getElementById("ps").innerHTML="请填写密码!";
     		 document.getElementById("ps").style.color="red";
     	}
     	 else
     	{
     		 document.getElementById("ps").innerHTML="yes!";
     		 document.getElementById("ps").style.color="green";
     	}
    	 
    	 if(validateCode=="")
     	{
     		 document.getElementById("vs").innerHTML="请填写验证码!";
     		 document.getElementById("vs").style.color="red";
     	}
     	 else
     	{
     		 document.getElementById("vs").innerHTML="yes!";
     		 document.getElementById("vs").style.color="green";
     	}
     }
     
     