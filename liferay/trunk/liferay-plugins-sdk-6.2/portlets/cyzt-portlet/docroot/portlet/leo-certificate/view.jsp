<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/common/init.jsp"%>
<portlet:defineObjects />
<c:set var="contextPath" value="${request.contextPath}/portlet" />
<portlet:renderURL var="searchURL">
	<portlet:param name="mvcPath" value="${contextPath }/apply-permit.jsp" />
</portlet:renderURL>
<liferay-ui:panel-container accordion="false" extended="true">
	<liferay-ui:panel title="查询条件" collapsible="true">
		<aui:form name="fm" id="fm" method="get" action="${searchURL}">
			<aui:input name="p_p_id" type="hidden" useNamespace="false"
				value="${portletDisplay.id }"></aui:input>
			<aui:input type="hidden" name="delta" value="${delta}"></aui:input>
			<table style="width: 100%;" class="table table-bordered">
				<tr class="body">
					<td style="width: 10%; text-align: right">专业类型</td>
					<td style="width: 40%;" class="content"><aui:input type="text"
							name="zylx" label="" cssClass="span12" /></td>
					<td style="width: 15%; text-align: right">姓名</td>
					<td style="width: 35%;" class="content"><aui:input type="text"
							name="xm" label="" cssClass="span12" /></td>
				</tr>

				<tr class="body">
					<td style="width: 10%; text-align: right">证件编号</td>
					<td class="content"><aui:input type="text"
							name="certificateId" label="" cssClass="span12" /></td>
					<td style="width: 15%; text-align: right">有效期</td>
					<td style="width: 35%;" class="content"><input type="text"
						class="Wdate span12" id="yxq" name="<portlet:namespace/>yxq"
						value=""
						onfocus="WdatePicker({maxDate:'#F{$dp.$D(\'yxq\')}',lang:'zh-cn',dateFmt:'yyyy-MM-dd'})" /></td>
				</tr>
				<tr style="height: 40px;" class="body">
					<td colspan="4" style="text-align: center" class="content"><aui:button
							type="submit" value="查询">
							<portlet:renderURL var="addLEOCertificateURL">
								<portlet:param name="mvcPath"
									value="${contextPath}/leo-certificate/edit-leo-certificate.jsp" />
							</portlet:renderURL>
						</aui:button> <aui:button href="${addLEOCertificateURL}" value="新增"></aui:button></td>
				</tr>
			</table>
		</aui:form>
	</liferay-ui:panel>

	<liferay-ui:panel title="执法人员证件列表" collapsible="false">

		<liferay-ui:search-container emptyResultsMessage="没有执法人员证件数据。">
			<liferay-ui:search-container-results results="${leoCertificates}"
				total="${leoCertificatesCount}">
			</liferay-ui:search-container-results>
			<liferay-ui:search-container-row
				className="com.justonetech.cyzt.leo.model.LEOCertificate"
				keyProperty="certificateId" modelVar="leoCertificate">


				<liferay-ui:search-container-column-text name="姓名"
					value="${leoCertificate.xm}" />
				<liferay-ui:search-container-column-text name="专业类型"
					value="${leoCertificate.zylx}" />
				<liferay-ui:search-container-column-text name="证件编号"
					value="${leoCertificate.certificateId}" />
				<liferay-ui:search-container-column-text name="发证日期">
					<fmt:formatDate value='${leoCertificate.fzrq}' pattern='yyyy-MM-dd' />
				</liferay-ui:search-container-column-text>
				<liferay-ui:search-container-column-text name="有效期">
					<fmt:formatDate value='${leoCertificate.yxq}' pattern='yyyy-MM-dd' />
				</liferay-ui:search-container-column-text>
				<liferay-ui:search-container-column-text name="操作">
					<portlet:renderURL var="viewLEOCertificateURL">
						<portlet:param name="mvcPath"
							value="${contextPath}/leo-certificate/view-leo-certificate.jsp" />
						<portlet:param name="certificateId"
							value="${leoCertificate.certificateId}" />
					</portlet:renderURL>
					<portlet:renderURL var="editLEOCertificateURL">
						<portlet:param name="mvcPath"
							value="${contextPath}/leo-certificate/edit-leo-certificate.jsp" />
						<portlet:param name="certificateId"
							value="${leoCertificate.certificateId}" />
					</portlet:renderURL>
					<portlet:actionURL var="deleteLEOCertificateURL" name="deleteLEOCertificate">
						<portlet:param name="certificateId"
							value="${leoCertificate.certificateId}" />
					</portlet:actionURL>
					<liferay-ui:icon-menu>
						<liferay-ui:icon image="view" label="查看"
							url="${viewLEOCertificateURL}" />
						<liferay-ui:icon image="edit" label="编辑"
							url="${editLEOCertificateURL}" />
						<liferay-ui:icon image="delete" label="删除"
							url="${deleteLEOCertificateURL}" />
					</liferay-ui:icon-menu>
				</liferay-ui:search-container-column-text>
			</liferay-ui:search-container-row>
			<liferay-ui:search-iterator />
		</liferay-ui:search-container>
	</liferay-ui:panel>
</liferay-ui:panel-container>