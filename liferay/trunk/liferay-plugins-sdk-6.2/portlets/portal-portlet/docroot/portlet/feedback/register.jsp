<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/common/init.jsp"%>
<portlet:renderURL var="viewURL" />
<portlet:actionURL var="registerURL" name="register">
	<portlet:param name="permitId" value="${permitId}" />
</portlet:actionURL>
<style type="text/css">
div.main {
	border-left: 1px solid #ddd;
	border-bottom: 1px solid #ddd;
	border-right: 1px solid #ddd;
	box-shadow: 2px 2px 2px #e8e8e8;
	border-radius: 5px;
}

div.head {
	background-color: #00a2ee;
	height: 10px;
}

div.body {
	border-bottom: 1px solid #ddd;
}

table.thead tr td.head {
	color: #0073d4;
	font-size: 18px;
	line-height: 30px;
}

table.thead tr td span {
	margin-left: 15px;
	display: inline-block;
	vertical-align: middle;
	font-family: "Microsoft YaHei UI";
}

table.thead tr td a {
	display: inline-block;
	width: 160px;
	height: 30px;
	line-height: 30px;
	text-align: center;
	color: #fff;
	border-radius: 5px;
	text-decoration: none;
	background-color: #ff954f;
	margin-left: 56px
}

table.thead tr td input {
	width: 200px;
	height: 25px;
	border-radius: 5px;
}

table.thead tr td select {
	width: 200px;
	height: 30px;
	border-radius: 5px
}

.xh {
	color: #ff954f;;
}

.register_input {
	margin: 10px auto 0px !important;
	border-radius: 5px !important;
}

.register_table{
	margin: 0px auto;
}
</style>
<div class="main">
	<div class="head"></div>
	<div class="body">
		<table class="thead">
			<tr>
				<td colspan="2" class="head"><span style="width: 5px; height: 20px; background-color: #ffa200; display: inline-block"></span><span>新用户注册</span>
				</td>
			</tr>
		</table>
	</div>
	<div>
		<aui:form action="${registerURL}" name="fm" method="post" >
			<table class="register_table">
				<tr>
					<td class="text-right"><span class="xh">*</span>用户名</td>
					<td class="text-left"><aui:input name="yhm" label="">
							<aui:validator name="required" />
							<aui:validator name="alphanum" />
							<aui:validator name="maxLength">18</aui:validator>
							<aui:validator name="minLength">4</aui:validator>
						</aui:input></td>
				</tr>
				<tr>
					<td class="text-right"><span class="xh">*</span>密码</td>
					<td class="text-left"><aui:input name="mm" label="" type="password">
							<aui:validator name="required" />
						</aui:input></td>
				</tr>
				<tr>
					<td class="text-right"><span class="xh">*</span>确认密码</td>
					<td class="text-left"><aui:input name="qrmm" label="" type="password">
							<aui:validator name="equalTo">'#<portlet:namespace />mm'</aui:validator>
						</aui:input></td>
				</tr>
				<tr>
					<td class="text-right"><span class="xh">*</span>身份证号</td>
					<td class="text-left"><aui:input name="sfzh" label="">
							<aui:validator name="required" />
						</aui:input></td>
				</tr>
				<tr>
					<td class="text-right"><span class="xh">*</span>姓名</td>
					<td class="text-left"><aui:input name="xm" label="">
							<aui:validator name="required" />
						</aui:input></td>
				</tr>
				<tr>
					<td class="text-right"><span class="xh">*</span>联系电话</td>
					<td class="text-left"><aui:input name="lxdh" label="">
							<aui:validator name="digits" />
							<aui:validator name="required" />
						</aui:input></td>
				</tr>
				<tr>
					<td class="text-right"><span class="xh">*</span>邮箱地址</td>
					<td class="text-left"><aui:input name="yxdz" label="">
							<aui:validator name="email" />
							<aui:validator name="required" />
						</aui:input></td>
				</tr>
				<tr>
					<td class="text-right">联系地址</td>
					<td class="text-left"><aui:input name="lxdz" label="">
							<aui:validator name="maxLength">40</aui:validator>
						</aui:input></td>
				</tr>
			</table>
			<div class="text-center">
				<div class="btn-group">
					<aui:button-row>
						<aui:button name="submit" type="submit" value="提交" cssClass="btn btn-primary" />
					</aui:button-row>
				</div>
				<div class="btn-group">
					<aui:button name="close" value="取消" cssClass="btn" href="${viewURL}" />
				</div>
			</div>
		</aui:form>
	</div>
</div>