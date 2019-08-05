function $(id) {
	return document.getElementById(id);
}
var regs = {
	userNameReg: /^(([\u4e00-\u9fa5])|[a-zA-Z0-9-_]){4,20}$/,
	pwdReg: /^.{6,20}$/,
	numReg: /\d/,
	strReg: /[a-zA-Z]/,
	tsReg: /[^\u4e00-\u9fa5a-zA-Z0-9]/
}
window.onload = function() {
	var userName = $("userName");
	var pwd = $("pwd");
	var pwd2 = $("pwd2");
	var email = $("email");
	var mobile = $("mobile");
	var ck = $("ck");
	var btn = $("btn");
		btn.onclick = function() {
		var box = ck.parentNode;
		var tip = box.nextElementSibling;
		var span = tip.lastElementChild;
		if(userNameBlur ()&& userNameKeyup()&& userNameFocus() && pwdBlur() && pwdKeyup()&& pwdFocus()
			&& checkPwdBlur() && checkPwdKeyup()&& checkPwdFocus()&& agrClick()) {
			alert("注册成功！！");
		} else {
			userNameBlur ();
			pwdBlur();
			checkPwdBlur();
			agrClick();
		}
	}
}
	
	function userNameFocus(){
		var value = userName.value;
		var box = $("userBox");
		var tip = $("userTip");
		var span = $("userSpan");
		if(value==""){
			box.className = "box";
			tip.className = "tip default";
			span.innerHTML = "支持汉字、字母、数字、“-”、“_”的组合，4-20个字符";
			return false;	
		}
	}
	function userNameKeyup(){
		var value = userName.value;
		var box = $("userBox");
		var tip = $("userTip");
		var span = $("userSpan");
		if(!regs.userNameReg.test(value)) {
			box.className = "box error";
			tip.className = "tip error";
			span.innerHTML = "格式错误，支持汉字、字母、数字、“-”、“_”的组合，4-20个字符";
			return false;	
		}else {
			box.className = "box right";
			tip.className = "tip hide";
			return true;
		}
	}
	function userNameBlur(){
		var value = userName.value;
		var box = $("userBox");
		var tip = $("userTip");
		var span = $("userSpan");
		if(value=="") {
			box.className = "box error";
			tip.className = "tip error";
			span.innerHTML = "用户名不能为空";
			return false;
		} else if(regs.userNameReg.test(value)) {
			box.className = "box right";
			tip.className = "tip hide";
			return true;
		} else {
			box.className = "box error";
			tip.className = "tip error";
			span.innerHTML = "格式错误，支持汉字、字母、数字、“-”、“_”的组合，4-20个字符";
		}
	}
		
	function pwdFocus(){
		var value = pwd.value;
		var box = $("pwdBox");
		var tip = $("pwdTip");
		var span = $("pwdSpan");
		if(value=="") {
			box.className = "box";
			tip.className = "tip default";
			span.innerHTML = "建议使用字母、数字和符号两种以上的组合，6-20个字符";
			return false;	
		}
	}
	function pwdKeyup(){
		var value = pwd.value;
		var box = $("pwdBox");
		var tip = $("pwdTip");
		var span = $("pwdSpan");
		if(!regs.pwdReg.test(value)) {
			box.className = "box error";
			tip.className = "tip error";
			span.innerHTML = "格式错误，支持汉字、字母、数字、“-”、“_”的组合，4-20个字符";
			return false;	
		}else if(regs.pwdReg.test(value)) {
			box.className = "box right";
			var level = getPwdLevel(value);
			switch(level) {
				case 1:
					tip.className = "tip ruo";
					break;
				case 2:
					tip.className = "tip zhong";
					break;
				case 3:
					tip.className = "tip qiang";
					break;
			}
			span.innerHTML = "建议使用字母、数字和符号两种以上的组合，6-20个字符";
			return true;
		} else {
			box.className = "box error";
			tip.className = "tip error";
			span.innerHTML = "密码长度应在6-20个字符之间";
			return false;
		}
	}
	function pwdBlur(){
		var value = pwd.value;
		var box = $("pwdBox");
		var tip = $("pwdTip");
		var span = $("pwdSpan");
		if(value=="") {
			box.className = "box error";
			tip.className = "tip error";
			span.innerHTML = "密码不能为空";
			return false;
		} else if(regs.pwdReg.test(value)) {
			box.className = "box right";
			var level = getPwdLevel(value);
			switch(level) {
				case 1:
					tip.className = "tip ruo";
					break;
				case 2:
					tip.className = "tip zhong";
					break;
				case 3:
					tip.className = "tip qiang";
					break;
			}
			return true;
		} else {
			box.className = "box error";
			tip.className = "tip error";
			span.innerHTML = "密码长度应在6-20个字符之间";
			return false;
		}
	}
	function checkPwdFocus(){
		var value = pwd2.value;
		var box = $("pwd2Box");
		var tip = $("pwd2Tip");
		var span = $("pwd2Span");
		if(value=="") {
			box.className = "box";
			tip.className = "tip default";
			span.innerHTML = "请再次输入密码";
			return false;	
		}
	}
	function checkPwdKeyup(){
		var value1 = pwd.value;
		var value = pwd2.value;
		var box = $("pwd2Box");
		var tip = $("pwd2Tip");
		var span = $("pwd2Span");
		if(value1 == value) {
			box.className = "box right";
			tip.className = "tip hide";
			return true;
		} else {
			box.className = "box error";
			tip.className = "tip error";
			span.innerHTML = "两次密码不一致";
			return false;
		}
	}
	function checkPwdBlur(){
		var value1 = pwd.value;
		var value = pwd2.value;
		var box = $("pwd2Box");
		var tip = $("pwd2Tip");
		var span = $("pwd2Span");
		if(value == "") {
			box.className = "box error";
			tip.className = "tip error";
			span.innerHTML = "请再次输入密码";
			return false;
		} else if(value1 == value) {
			box.className = "box right";
			tip.className = "tip hide";
			return true;
		} else {
			box.className = "box error";
			tip.className = "tip error";
			span.innerHTML = "两次密码不一致";
			return false;
		}
	}
	function agrClick(){
		var box = $("ckBox");
		var tip = $("ckTip");
		var span = $("ckSpan");
		if(ck.checked) {
			tip.className = "tip hide";
			return true;
		}else {
			tip.className = "tip error";
			span.innerHTML = "请同意协议";
			return false;
		}
	} 
	function getPwdLevel(pwd) {
		var level = 0;
		var numReg=true, strReg=true, tsReg=true;
		for(var i=0; i<pwd.length; i++) {
			if(numReg&&regs.numReg.test(pwd[i])) {
				level++;
				numReg = false;
				continue;
			}
			if(strReg&&regs.strReg.test(pwd[i])) {
				level++;
				strReg = false;
				continue;
			}
			if(tsReg&&regs.tsReg.test(pwd[i])) {
				level++;
				tsReg = false;
			}
		}
		return level;
	}