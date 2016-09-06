<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/common/init.jsp"%>
<%@ include file="init.jsp"%>

<liferay-ui:tabs names="工程概况,参建单位,单位工程,申请材料" refresh="false">
	<liferay-ui:section>
		工程概况
	</liferay-ui:section>
	<liferay-ui:section>
		参建单位
	</liferay-ui:section>
	<liferay-ui:section>
		单位工程
	</liferay-ui:section>
	<liferay-ui:section>
		申请材料
	</liferay-ui:section>
</liferay-ui:tabs>
<br>
<aui:button-row>
	<portlet:renderURL var="printsjpzURL" windowState="pop_up">
		<portlet:param name="mvcPath"
			value="${contextPath}/print-sjpz.jsp" />
	</portlet:renderURL>
	<portlet:renderURL var="printsltzsURL" windowState="pop_up">
		<portlet:param name="mvcPath"
			value="${contextPath}/print-sltzs.jsp" />
	</portlet:renderURL>
	<portlet:renderURL var="printbysljdsURL" windowState="pop_up">
		<portlet:param name="mvcPath"
			value="${contextPath}/print-bysljds.jsp" />
	</portlet:renderURL>
	<portlet:renderURL var="printbzclURL" windowState="pop_up">
		<portlet:param name="mvcPath"
			value="${contextPath}/print-bzcl.jsp" />
	</portlet:renderURL>
	<portlet:renderURL var="printjsscbURL" windowState="pop_up">
		<portlet:param name="mvcPath"
			value="${contextPath}/print-jsscb.jsp" />
	</portlet:renderURL>
	<portlet:renderURL var="printsgxklszsURL" windowState="pop_up">
		<portlet:param name="mvcPath"
			value="${contextPath}/print-sgxklszs.jsp" />
	</portlet:renderURL>
	<aui:button value="收件凭证" onClick="${printsjpzURL}" useDialog="true"/>
	<aui:button value="受理通知书" onClick="${printsltzsURL}" useDialog="true"/>
	<aui:button value="不予受理决定书" onClick="${printbysljdsURL}" useDialog="true"/>
	<aui:button value="补正材料" onClick="${printbzclURL}" useDialog="true"/>
	<aui:button value="技术审查表" onClick="${printjsscbURL}" useDialog="true"/>
	<aui:button value="施工许可(绿色)" onClick="${printsgxklszsURL}" useDialog="true"/>
	<aui:button value="施工许可" onClick="" useDialog="true"/>
</aui:button-row>



