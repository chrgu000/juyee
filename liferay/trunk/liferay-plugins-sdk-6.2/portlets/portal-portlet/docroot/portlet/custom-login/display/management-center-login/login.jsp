<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/common/init.jsp"%>
<style>
body {
	background-image: url('/documents/20181/26528/bg2.jpg/790f7e40-1897-4255-bd46-9a2a73e8bb5f?t=1471230827000');
	background-repeat: no-repeat;
	background-clip: content-box;
	background-size: 100% 100%;
}

.title {
	position: absolute;
	background: url('/documents/20181/26528/title.png/a241be9f-cd0a-4693-9872-2dc45cdde235?t=1471247909387') no-repeat;
	background-size: cover;
}

.login {
	box-shadow: 2px 2px 3px #888888;
	background-color: white;
	position: absolute;
	border: 1px solid #cccccc;
	border-radius: 5px;
	filter: alpha(opacity = 95);
	opacity: .95;
	font-family: Microsoft Yahei;
}

.login_div_user {
	position: relative;
	width: 78%;
	height: 12%;
	left: 10%;
	margin: 6% 0;
}

.login_div_password {
	position: relative;
	width: 78%;
	height: 12%;
	left: 10%;
	margin: 6% 0 3% 0;
}

.login_div_btn {
	position: relative;
	width: 78%;
	height: 12%;
	left: 10%;
	margin: 1% 0 0 0;
}

.login_tag {
	position: relative;
	left: 10%;
	margin: 8% 0;
	height: 10%;
	width: 78%;
	background: url('/documents/20181/26528/titlez.png/c0971fda-277f-4c99-8905-274a20706c89?t=1471247910203') no-repeat;
	background-size: 100% 100%;
}

.login_input_user {
	width: 93% !important;
	height: 80% !important;
	border-radius: 3px !important;
	border: 1px solid #cccccc;
	background-image: url('/documents/20181/26528/yhm.png/4f58e524-167e-4cb6-b442-49001d60a5c7?t=1471247910604');
	background-repeat: no-repeat;
	background-position: left;
	text-indent: 25px;
}

.login_input_password {
	background-image: url('/documents/20181/26528/mm.png/87bb62c9-2731-4aba-9e76-e01036916d91?t=1471247908696');
	background-repeat: no-repeat;
	background-position: left;
	text-indent: 25px;
	border-radius: 3px !important;
	border: 1px solid #cccccc;
	width: 93% !important;
	height: 80% !important;
}

.login_login_btn {
	width: 100% !important;
	height: 100% !important;
	border-radius: 3px;
	border: none;
	background-color: #0081dc;
	color: white;
}

.loginMessage {
	position: relative;
	left: 10%;
	visibility: hidden;
	height: 20px;
	color: red;
	width: 78%;
	font-size: 12px;
	font-family: Microsoft YaHei;
	border: none;
}

#p_p_id_customlogin_WAR_portalportlet_ .portlet-borderless-container{
	background-color: transparent !important;
}


</style>

<portlet:resourceURL var="loginUrl" id="Management-Center-login" />

<form action="${themeDisplay.getURLCurrent()}?p_p_id=58&amp;p_p_lifecycle=1&amp;p_p_state=normal&amp;p_p_mode=view&amp;p_p_col_id=column-1&amp;p_p_col_pos=2&amp;p_p_col_count=3&amp;_58_struts_action=%2Flogin%2Flogin" class="form sign-in-form " id="_58_fm" method="post" name="_58_fm" autocomplete="off">
	<input name="_58_formDate" type="hidden" value="1470964064174"> <input class="field" id="_58_saveLastPath" name="_58_saveLastPath" type="hidden" value="false"> <input class="field" id="_58_redirect" name="_58_redirect" type="hidden" value="${redirectPage}"> <input class="field" id="_58_doActionAfterLogin" name="_58_doActionAfterLogin" type="hidden" value="false">
	<div id=login_div>
		<div class="title" id="title"></div>
		<div class="login" id="login">
			<div class="login_tag"></div>

			<div class="login_div_user">
				<input name="_58_login" id="_58_login" value="请输入用户名" style="color: #cccccc;" class="login_input_user" type="text" onfocus="userFocus(this)" onblur="userBlur(this)">
			</div>

			<div class="login_div_password">
				<input name="_58_password" id="_58_password" value="请输入密码" style="color: #cccccc;" class="login_input_password" type="text" onfocus="passwordFocus(this)" onblur="passwordBlur(this)">
			</div>

			<!-- 			<div> <label  for="_58_rememberMeCheckbox"> <input id="_58_rememberMe" name="_58_rememberMe" type="hidden" value="false"> <input  id="_58_rememberMeCheckbox" name="_58_rememberMeCheckbox" onclick="Liferay.Util.updateCheckboxValue(this); " type="checkbox" value="false"> 记住我 </label> </div>
 -->
			<div id="loginMessage" class="loginMessage"></div>

			<div class="login_div_btn">
				<input type="button" class="login_login_btn" onclick="validateForm()" value="登录">
			</div>
		</div>
	</div>
</form>

<script>
	$(document).ready(
			function() {
				document.onkeydown=keyDownSearch; 
				var login_body = document.getElementsByTagName("body");
				login_body[0].style.width = $(window).width() + "px";
				login_body[0].style.height = $(window).height() + "px";
				login_body[0].style.backgroundSize = $(window).width() + "px"
						+ " " + $(window).height() + "px";
				$("#login_div").width("100%");
				$("#login_div").height(($(window).height()*0.65) + "px");
				var loginDivHeight = $("#login_div").height();
				var loginDivWidth = $("#login_div").width();
				$("#title").attr("style","height:" + loginDivHeight*0.10 + "px;width:" + loginDivWidth*0.30 + "px;top:" + loginDivHeight*0.25 + "px;left:" + loginDivWidth*0.35 + "px" );
				$("#login").attr("style","height:" + loginDivHeight*0.50 + "px;width:" + loginDivWidth*0.26 + "px;top:" + loginDivHeight*0.35 + "px;left:" + loginDivWidth*0.37 + "px" );
				
				$(window).resize(
						function() {
							login_body[0].style.width = $(window).width()
									+ "px";
							login_body[0].style.height = $(window).height()
									+ "px";
							login_body[0].style.backgroundSize = $(window)
									.width()
									+ "px" + " " + $(window).height() + "px";
							$("#login_div").height(($(window).height()*0.65) + "px");
							loginDivHeight = $("#login_div").height();
							loginDivWidth = $("#login_div").width();
							$("#title").attr("style","height:" + loginDivHeight*0.10 + "px;width:" + loginDivWidth*0.30 + "px;top:" + loginDivHeight*0.25 + "px;left:" + loginDivWidth*0.35 + "px" );
							$("#login").attr("style","height:" + loginDivHeight*0.50 + "px;width:" + loginDivWidth*0.26 + "px;top:" + loginDivHeight*0.35 + "px;left:" + loginDivWidth*0.37 + "px" );
							
						});
			});
	
	function keyDownSearch(e) {    
	    // 兼容FF和IE和Opera    
	    var theEvent = e || window.event;    
	    var code = theEvent.keyCode || theEvent.which || theEvent.charCode;    
	    if (code == 13) { 
	    	 setTimeout(function(){
	    		 validateForm();
	         },0);
	         e.preventDefault ? e.preventDefault() : (e.returnValue = false);

	    }    
	} 
	
	function userFocus(ele){if(ele.value=='请输入用户名'){ele.value='';ele.style.color='#666666';}
		document.getElementById("loginMessage").style.visibility="hidden";}
	function userBlur(ele){if(ele.value==''){ele.value='请输入用户名';ele.style.color='#cccccc';}}
	function passwordFocus(ele){if(ele.value=='请输入密码'){ele.value='';ele.style.color='#666666'; ele.type='password'};
		document.getElementById("loginMessage").style.visibility="hidden";}
	function passwordBlur(ele){if(ele.value==''){ele.value='请输入密码';ele.style.color='#cccccc';ele.type='text'}}

	function validateForm(){
			$.ajax({
				type:"post",
				url:"<%=loginUrl%>",
			data : {
				'<portlet:namespace/>_58_login' : $('#_58_login').val(),
				'<portlet:namespace/>_58_password' : $('#_58_password').val()
			},
			error : function(err) {
				alert("提交失败!");
			},
			success : function(data) {
				var strJson = eval("(" + data + ")");
				if (strJson.loginState == true) {
					document.getElementById("_58_fm").submit();
				} else {
					$("#loginMessage").text(strJson.responseContent);
					document.getElementById("loginMessage").style.visibility = "visible";
				}

			}
		});
	}
</script>