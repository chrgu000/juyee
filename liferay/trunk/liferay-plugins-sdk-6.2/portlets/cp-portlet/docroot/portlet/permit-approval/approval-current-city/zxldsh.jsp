<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/common/init.jsp"%>
<%@ include file="../init.jsp"%>
	<div class="text-center">
		<div class="btn-group">
				<aui:button-row>
		<%
		Long permitIdInit=ParamUtil.getLong(request,"permitId");
		String randomId = StringPool.BLANK;
		randomId = StringUtil.randomId();
		Permit permit=PermitLocalServiceUtil.getPermit(permitIdInit);
		String strBackUrl = "http://" + request.getServerName() //服务器地址  
        + ":"   
        + request.getServerPort() ;          //端口号  
				String[] assetTypes = new String[1];
		    	assetTypes[0]="com.justonetech.cp.permit.model.Permit";
	    	OrderByComparator orderByComparator=null;
		    	List<WorkflowTask> results1=null;
		    	User me=PortalUtil.getUser(request);
		    	if(null!=me){
		    		try {
		    			//遍历工作流任务
		    		results1= WorkflowTaskManagerUtil.search(me.getCompanyId(), me.getUserId(), null, assetTypes, null, null, -1, -1, orderByComparator);
				} catch (WorkflowException e3) {
					// TODO Auto-generated catch block
					e3.printStackTrace();
				}
		    	long workflowTaskId=0L;
		    	long people=0L;
		    	String url="";
		    	List<String> transitionNames = null;//遍历工作流任务
		    	String token="";//授权随机代码
		    	if(null!=permit){
		    		if(results1.size()>0){
		    		//工作流任务
		    	for(WorkflowTask task:results1){
		    		if(null!=task){
		    			if(KaleoTaskInstanceTokenLocalServiceUtil.getKaleoTaskInstanceToken(task.getWorkflowTaskId()).getClassPK()==permit.getPermitId()){
		    				workflowTaskId=task.getWorkflowTaskId();
							people=task.getAssigneeUserId();
					}
		    		}
		    	}
		    		}
		    		token=com.liferay.portal.security.auth.AuthTokenUtil.getToken(request);
		        if(workflowTaskId==0){
		        	transitionNames=new ArrayList<String>();
		        }else{
		    	transitionNames=WorkflowTaskManagerUtil.getNextTransitionNames(me.getCompanyId(), me.getUserId(), workflowTaskId);
		    	}
		    	}
		    			for(int i=transitionNames.size()-1;i>=0;i--){
		    				String transitionName=transitionNames.get(i);
					String message = "proceed";
					if (Validator.isNotNull(transitionName)) {
						message = HtmlUtil.escape(transitionName);
					}
				url=strBackUrl+"/group/control_panel/manage/-/my_workflow_tasks/view/"+workflowTaskId+"?p_auth="+token+"&p_p_lifecycle=1&doAsGroupId="+PortalUtil.getUser(request).getGroupId()+"&refererPlid=25177&controlPanelCategory=my&_153_cmd=save&_153_assigneeUserId="+people+"&_153_redirect="+strBackUrl+themeDisplay.getURLCurrent()+"&_153_struts_action=/my_workflow_tasks/edit_workflow_task&_153_transitionName="+message;
				%>
				<div class="hide" id="<%= randomId %>updateComments">
	<aui:input cols="55" name="_153_comment" id="_153_comment" label="审核意见" useNamespace="false" rows="10" type="textarea" />
</div>
		<c:if test='<%=message.equals("通过") %>'>
		<liferay-ui:icon
				cssClass='<%= "workflow-task-" + randomId + " task-change-status-link" %>'
				id='<%= randomId + HtmlUtil.escapeAttribute(transitionName) + "taskChangeStatusLink" %>'
				image="shtg"
				message="<%= message %>"
				method="get"
				url="<%= url %>"
				onClick="shtg()"
			/>
			</c:if>
			<c:if test='<%=message.equals("不通过") %>'>
		<liferay-ui:icon
				cssClass='<%= "workflow-task-" + randomId + " task-change-status-link" %>'
				id='<%= randomId + HtmlUtil.escapeAttribute(transitionName) + "taskChangeStatusLink" %>'
				image="shth"
				message="<%= message %>"
				method="get"
				url="<%= url %>"
				onClick="shth()"
			/>
			</c:if>
			<aui:script use="liferay-workflow-tasks">
var onTaskClickFn = A.rbind('onTaskClick', Liferay.WorkflowTasks,'<%= randomId %>',true);
Liferay.delegateClick('<portlet:namespace /><%= randomId + HtmlUtil.escapeJS(transitionName) %>taskChangeStatusLink', onTaskClickFn);
</aui:script>
				<%
		    		}
		    	}
		%>
		<div class="btn-group">
			<aui:button name="close" value="关闭" cssClass="btn" href="${viewURL}" />
		</div>
			</aui:button-row>
	</div>
	<script type="text/javascript">
function shtg(){
	$("#_153_comment").val("同意上报。");
}
function shth(){
	$("#_153_comment").val("");
}
</script>