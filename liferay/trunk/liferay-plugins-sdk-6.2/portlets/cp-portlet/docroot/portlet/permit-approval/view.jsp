<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/common/init.jsp"%>
<%@ include file="init.jsp"%>
<style type="text/css">
tr.body td.content {
	background-color: white;
}
</style>
<liferay-ui:header title="施工许可审核" />
<%
	String ywbh = ParamUtil.getString(request, "ywbh");
	String bjbh = ParamUtil.getString(request, "bjbh");
	String xmmc = ParamUtil.getString(request, "xmmc");
	String xmlx = ParamUtil.getString(request, "xmlx");
	String jsdw = ParamUtil.getString(request, "jsdw");
	String state = ParamUtil.getString(request, "state","sy");
	request.setAttribute("ywbh", ywbh);
	request.setAttribute("bjbh", bjbh);
	request.setAttribute("xmmc", xmmc);
	request.setAttribute("xmlx", xmlx);
	request.setAttribute("jsdw", jsdw);
	request.setAttribute("state", state);
	Long xmlxLong = null;
	if (xmlx != "") {
		xmlxLong = Long.parseLong(xmlx);
	}
	 String[] sss = PropsUtil.get("ss").split(",");//市属
	String[] qss = PropsUtil.get("qs").split(",");//区属
	Dictionary xmlxDic = DictionaryLocalServiceUtil.findByCode("xmlx");
	List<Dictionary> xmlxDics = DictionaryLocalServiceUtil.findByParentId(xmlxDic.getDictionaryId(), -1, -1);
	int defaultDelta = GetterUtil.getInteger(PropsUtil.get(PropsKeys.SEARCH_CONTAINER_PAGE_DEFAULT_DELTA));
	int delta = ParamUtil.getInteger(renderRequest, "delta", defaultDelta);
	int cur = ParamUtil.getInteger(renderRequest, "cur", 1);
	int start = delta * (cur - 1);
	int end = delta * cur;
	 User user_ = UserServiceUtil.getCurrentUser();
	List<Role> roles = user_.getRoles();
	String gs = "";//根据角色来判断是市属还是区属
	for(Role role:roles){
		String roleId = role.getRoleId()+"";
		for(String ss:sss){
			if(roleId.equals(ss)){
				gs="市属";
			}
		}
		for(String qs:qss){
			if(roleId.equals(qs)){
				gs="区属";
			}
		}
	} 
	List<Permit> permits = PermitLocalServiceUtil.getPermits(ywbh, bjbh, xmmc, xmlxLong, jsdw, state, gs, start, end);
	int permitsCount = PermitLocalServiceUtil.getPermitsCount(ywbh, bjbh, xmmc, xmlxLong, jsdw, state, gs);
	request.setAttribute("permits", permits);
	request.setAttribute("permitsCount", permitsCount);
	request.setAttribute("xmlxDics", xmlxDics);
	request.setAttribute("delta", delta);
	request.setAttribute("cur", cur);
%>
<portlet:renderURL var="searchURL">
	<liferay-portlet:param name="ywbh" value="${ywbh }" />
	<liferay-portlet:param name="bjbh" value="${bjbh }" />
	<liferay-portlet:param name="xmmc" value="${xmmc }" />
	<liferay-portlet:param name="xmlx" value="${xmlx }" />
	<liferay-portlet:param name="jsdw" value="${jsdw }" />
	<liferay-portlet:param name="delta" value="${delta }" />
</portlet:renderURL>
<c:set var="contextPath" value="${request.contextPath}/portlet/permit-approval" />
<liferay-ui:panel-container accordion="false" extended="true">
	<liferay-ui:panel title="查询条件" collapsible="true">
		<aui:form name="fm" id="fm" method="get" action="${searchURL}">
			<aui:input name="p_p_id" type="hidden" useNamespace="false" value="${portletDisplay.id }"></aui:input>
			<aui:input type="hidden" name="delta" value="${delta}"></aui:input>
			<table style="width: 100%;" class="table table-bordered">
				<tr class="body">
					<td style="width: 10%; text-align: right">业务编号</td>
					<td style="width: 40%;" class="content"><aui:input type="text" name="ywbh" id="bjbh" label="" cssClass="span12" /></td>
					<td style="width: 15%; text-align: right">报建编号</td>
					<td style="width: 35%;" class="content"><aui:input type="text" name="bjbh" label="" cssClass="span12" /></td>
				</tr>

				<tr class="body">
					<td style="width: 10%; text-align: right">项目名称</td>
					<td class="content"><aui:input type="text" name="xmmc" label="" cssClass="span12" /></td>
					<td style="width: 15%; text-align: right">项目类型</td>
					<td style="width: 35%;" class="content"><aui:select name="xmlx" cssClass="span12" label="" showEmptyOption="true">
							<c:forEach items="${xmlxDics}" var="xmlx">
								<aui:option value="${xmlx.dictionaryId}">${xmlx.name}</aui:option>
							</c:forEach>
						</aui:select></td>
				</tr>
				<tr class="body">
					<td style="width: 10%; text-align: right">建设单位</td>
					<td colspan="3" class="content"><aui:input type="text" name="jsdw" label="" cssClass="span12" /></td>
				</tr>
				<tr style="height: 40px;" class="body">
					<td colspan="4" style="text-align: center" class="content"><aui:button type="submit" value="提交查询"></aui:button></td>
				</tr>
			</table>
		</aui:form>
	</liferay-ui:panel>
	<%
		int sortNo = 0;
			String stateLabel = "所有,未提交,已提交";
			String stateValue = "sy,wtj,ytj";
	%>
	<liferay-portlet:renderURL varImpl="iteratorURL" plid="${plid}" portletName="${portletDisplay.id }">
		<liferay-portlet:param name="ywbh" value="${ywbh }" />
		<liferay-portlet:param name="bjbh" value="${bjbh }" />
		<liferay-portlet:param name="xmmc" value="${xmmc }" />
		<liferay-portlet:param name="xmlx" value="${xmlx }" />
		<liferay-portlet:param name="jsdw" value="${jsdw }" />
		<liferay-portlet:param name="state" value="${state }" />
		<liferay-portlet:param name="delta" value="${delta }" />
		<liferay-portlet:param name="cur" value="${cur }" />
	</liferay-portlet:renderURL>
	<liferay-ui:panel title="施工许可列表" collapsible="false">
		<liferay-ui:tabs names="<%=stateLabel%>" param="state" tabsValues="<%=stateValue%>" url="<%=searchURL%>" type="pills">
		</liferay-ui:tabs>
		<liferay-ui:search-container emptyResultsMessage="没有施工许可数据。" iteratorURL="<%=iteratorURL%>">
			<liferay-ui:search-container-results results="${permits}" total="${permitsCount}">
			</liferay-ui:search-container-results>
			<liferay-ui:search-container-row className="com.justonetech.cp.permit.model.Permit" keyProperty="permitId" modelVar="permit">
				<%
					Long permitId = permit.getPermitId();
									ProjectProfile projectProfile = ProjectProfileLocalServiceUtil.getProjectProfile(permitId);
									request.setAttribute("projectProfile", projectProfile);
									Project project = ProjectLocalServiceUtil.getProject(permit.getBjbh());
									String status = "";
									if (project.getLxjb().equals("区县级机关或区县级单位")) {
										status = CountyPermitStatus.getColorNameByCode(permit.getStatus());
									} else {
										status = CityPermitStatus.getColorNameByCode(permit.getStatus());
									}
				%>
				<liferay-ui:search-container-column-text name="序号" value="<%=String.valueOf(++sortNo)%>" />
				<liferay-ui:search-container-column-text name="绿色" value="${projectProfile.xmxz==29769?'':'★'}" />
				<liferay-ui:search-container-column-text name="项目类型" value="<%=DictionaryLocalServiceUtil.getDictionary(projectProfile.getXmlx()).getName()%>" />
				<liferay-ui:search-container-column-text property="ywbh" name="业务编号" />
				<liferay-ui:search-container-column-text property="bjbh" name="报建编号" />
				<liferay-ui:search-container-column-text name="项目名称" value="${projectProfile.gcmc}" />
				<liferay-ui:search-container-column-text name="建设单位" value="${projectProfile.jsdwmc}" />
				<liferay-ui:search-container-column-text name="状态" value="<%=status%>" />
				<liferay-ui:search-container-column-text name="操作">
					<portlet:renderURL var="viewPermitURL">
						<portlet:param name="mvcPath" value="${contextPath}/view-permit.jsp" />
						<portlet:param name="permitId" value="${permit.permitId}" />
					</portlet:renderURL>
					<portlet:renderURL var="approvalPermitURL">
						<portlet:param name="mvcPath" value="${contextPath}/approval-permit.jsp" />
						<portlet:param name="permitId" value="${permit.permitId}" />
					</portlet:renderURL>
					<liferay-ui:icon-menu>
						<liferay-ui:icon image="view" label="查看" url="${viewPermitURL}" />
						<liferay-ui:icon image="checked" url="${approvalPermitURL}" />
					</liferay-ui:icon-menu>
				</liferay-ui:search-container-column-text>
			</liferay-ui:search-container-row>
			<liferay-ui:search-iterator />
		</liferay-ui:search-container>
	</liferay-ui:panel>
</liferay-ui:panel-container>