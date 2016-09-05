<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/common/init.jsp"%>
<c:set var="contextPath"
	value="${request.contextPath}/portlet/permit-approval" />
<liferay-ui:panel-container accordion="false" extended="true">
	<liferay-ui:panel title="查询条件" collapsible="true">
		查询字段：业务编号、报建编号、项目名称、项目类型、建设单位、状态
	</liferay-ui:panel>
	<liferay-ui:panel title="施工许可列表" collapsible="false">
		列：绿色、业务编号、报建编号、项目名称、项目类型、建设单位、状态、操作
		<portlet:renderURL var="viewPermitURL">
			<portlet:param name="mvcPath" value="${contextPath}/view-permit.jsp"/>
		</portlet:renderURL>
		<aui:button href="${viewPermitURL }"></aui:button>
	</liferay-ui:panel>
</liferay-ui:panel-container>