	function $(ElementId){
		return document.getElementById(ElementId);
		}
	function userFocus(){
		var usrmsg=$("usrmsg");
		$("usr").style.cssText ="border:1px solid #3F89EC";
		usrmsg.className="tip";
		usrmsg.innerHTML="设置后不可更改<br>中英文均可，最长14个英文或7个汉字";
	}
	function telFocus(){
		var telmsg=$("telmsg");
		$("tel").style.cssText ="border:1px solid #3F89EC";
		telmsg.className="tip";
		telmsg.innerHTML="请输入中国大陆手机号,其他用户不可见";
	}
	function pwdFocus(){
		var pwdmsg=$("pwdmsg");
		$("pwd").style.cssText ="border:1px solid #3F89EC";
		pwdmsg.innerHTML="<ul ><li> <span class='pwd_icon'>○</span><span class='pwd_tip'>长度为6~14个字符</span> </li> "+ 
		" <li> <span class='pwd_icon'>○</span><span class='pwd_tip'>支持数字、大小写字母和标点符号</span> </li> "+ 
		"<li> <span class='pwd_icon'>○</span><span class='pwd_tip'>不允许有空格</span> </li></ul>";
	}
	function userBlur(){
		var userName=$("usr");
		var usrmsg=$("usrmsg");
		var reg=/^[0-9A-Za-z\u4e00-\u9fa5]{1,14}$/;
		userName.style.cssText ="border:1px solid #ddd";
		usrmsg.className="error";
		if(userName.value!=''){
			if(!isUsr()){
				userName.style.cssText ="border:1px solid red";
				usrmsg.innerHTML="<span class='error_icon'></span> <span class='error_span'>用户名不能超过7个汉字或14个字符</span>";
				return false;
			}
		}else{
			usrmsg.innerHTML="";
			return false;
		}
		usrmsg.innerHTML="<span class='ok_icon'></span>";
		return true;	
	}
	 var isUsr = function(){  
		return /^[0-9A-Za-z\u4e00-\u9fa5]{1,14}$/.test($("usr").value);      
	}
	function telBlur(){
		var telmsg=$("telmsg");
		var tel=$('tel');
		tel.style.cssText ="border:1px solid #ddd";
		telmsg.className="error";
		if(tel.value!=''){
			if(!isTel()){
				tel.style.cssText ="border:1px solid red";
				telmsg.innerHTML="<span class='error_icon'></span> <span class='error_span'>手机号码格式不正确</span>";
				return false;
			}
		}else{
			telmsg.innerHTML="";
			return false;
		}
		telmsg.innerHTML="<span class='ok_icon'></span>";
		return true;
	}
    var isTel = function(){  
        return /^(0|86|17951)?(13[0-9]|15[012356789]|17[0135678]|18[0-9]|14[579])[0-9]{8}$/.test($("tel").value);  
    } 
	function pwdKeyup(){
		var pwdmsg=$("pwdmsg");
		var pwd = $("pwd");
		var html = "<ul>";
		pwd.style.cssText ="border:1px solid #ddd";
		if(checkLength()){
			html +="<li> <span class='pwdok'></span><span class='okcolor'>长度为6~14个字符</span> </li>";
		}else{
			pwd.style.cssText ="border:1px solid red";
			html +="<li> <span class='pwdno'></span><span class='nocolor'>长度为6~14个字符</span> </li>";
		}
		if(checkChar()){
			html +="<li> <span class='pwdok'></span><span class='okcolor'>支持数字、大小写字母和标点符号</span> </li>";
		}else{
			pwd.style.cssText ="border:1px solid red";
			html +="<li> <span class='pwdno'></span><span class='nocolor'>支持数字、大小写字母和标点符号</span> </li>";
		}
		if(!checkSpace()){
			html +="<li> <span class='pwdok'></span><span class='okcolor'>不允许有空格</span> </li>";
		}else{
			pwd.style.cssText ="border:1px solid red";
			html +="<li> <span class='pwdno'></span><span class='nocolor'>不允许有空格</span> </li>";
		}
		html += "</ul>";
		pwdmsg.innerHTML=html;
	}
	function pwdBlur(){
		var pwdmsg=$("pwdmsg");
		var pwd = $("pwd");
		var reg1=/[0-9a-zA-Z|\.]/;
		var reg2=/\s/g;
		var html = "<ul>";
		pwd.style.cssText ="border:1px solid #ddd";
		if(pwd.value!= ''){
			if(checkLength()){
				html +="<li> <span class='pwdok'></span><span class='okcolor'>长度为6~14个字符</span> </li>";
			}else{
				pwd.style.cssText ="border:1px solid red";
				html +="<li> <span class='pwdno'></span><span class='nocolor'>长度为6~14个字符</span> </li>";
			}
			if(checkChar()){
				html +="<li> <span class='pwdok'></span><span class='okcolor'>支持数字、大小写字母和标点符号</span> </li>";
			}else{
				pwd.style.cssText ="border:1px solid red";
				html +="<li> <span class='pwdno'></span><span class='nocolor'>支持数字、大小写字母和标点符号</span> </li>";
			}
			if(!checkSpace()){
				html +="<li> <span class='pwdok'></span><span class='okcolor'>不允许有空格</span> </li>";
			}else{
				pwd.style.cssText ="border:1px solid red";
				html +="<li> <span class='pwdno'></span><span class='nocolor'>不允许有空格</span> </li>";
			}
			if(pwd.value.length >= 6 && pwd.value.length <=14 &&reg1.test(pwd.value) && reg2.test(pwd.value)== false){
				pwdmsg.innerHTML="<div class='error'><span class='ok_icon'></span></div>";
				return true;
			}else{
				html += "</ul>";
				pwdmsg.innerHTML=html;
				return false;
			}
		}else{
			pwdmsg.innerHTML="";
			return false;
		}
	}
    var checkLength = function(){  
        return $("pwd").value.length >= 6 && $("pwd").value.length <=14;  
    }  
      
    var checkChar = function(){  
        return /[0-9a-zA-Z|\.]/.test($("pwd").value);  
    }  
      
    var checkSpace = function(){  
        return /\s/g.test($("pwd").value);  
    }
	function checkForm(){
		var flagUser=userBlur();
		var falgTel=telBlur();
		var falgPwd=pwdBlur();
		if(flagUser==true && falgTel==true && falgPwd==true && checkYzm()==true && checkAgree() == true){
			alert("注册成功！！");
			return true;
		}else{
			if(!isUsr()){
				$("usr").style.cssText ="border:1px solid red";
				$("usrmsg").innerHTML="<span class='error_icon'></span> <span class='error_span'>请您填写用户名</span>";
			}
			if(!isTel()){
				$("tel").style.cssText ="border:1px solid red";
				$("telmsg").innerHTML="<span class='error_icon'></span> <span class='error_span'>请您填写手机号</span>";
			}
			if(!checkLength() || !checkChar() || checkSpace()){
				$("pwdmsg").className="error";
				$("pwd").style.cssText ="border:1px solid red";
				$("pwdmsg").innerHTML="<span class='error_icon'></span> <span class='error_span'>请输入密码</span>";
			}
			if($("pwd1").value == '' || !checkPwd1()){
				$("pwd1msg").className="error";
				$("pwd1").style.cssText ="border:1px solid red";
				$("pwd1msg").innerHTML="<span class='error_icon'></span> <span class='error_span'>请再次输入密码</span>";	  
			}
			if(!checkAgree()){
				$("agreemsg").className="error";
				$("agreemsg").innerHTML="<div class='error agreeErr'> <span class='error_icon'></span> <span class='error_span'>您还未接受百度用户协议</span></div> " 
			}
			return false;
		}
	}
	function pwd1Blur(){ 
		if($("pwd1").value != ''){
			if(!checkPwd1()){
				$("pwd1msg").className="error";
				$("pwd1").style.cssText ="border:1px solid red";
				$("pwd1msg").innerHTML="<span class='error_icon'></span> <span class='error_span'>两次输入的密码不一致</span>";	  
			}
		return false;
		}else{
			return true;
		}
    }  
	var checkPwd1 = function(){  
        return $("pwd1").value == $("pwd").value;  
    }  
	
          
	var checkAgree = function(){ 
		if($("agree").checked ==true){
			$("agreemsg").innerHTML="";	
			return true;  
		}else{
			return false;
		}
	}