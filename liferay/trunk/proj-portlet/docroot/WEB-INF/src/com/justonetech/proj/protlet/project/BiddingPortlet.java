package com.justonetech.proj.protlet.project;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.justonetech.proj.model.Bidding;
import com.justonetech.proj.model.Company;
import com.justonetech.proj.model.Project;
import com.justonetech.proj.service.BiddingLocalServiceUtil;
import com.justonetech.proj.service.CompanyLocalServiceUtil;
import com.justonetech.proj.service.ProjectLocalServiceUtil;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class BiddingPortlet
 */
public class BiddingPortlet extends MVCPortlet {

	private static Log log = LogFactoryUtil.getLog(BiddingPortlet.class);
	private static String timeFormatPattern = PropsUtil.get("default.date.format.pattern");

	/**
	 * 项目列表
	 */
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
		String keywords = ParamUtil.getString(renderRequest, "keywords");
		int delta = GetterUtil.getInteger(PropsUtil.get(PropsKeys.SEARCH_CONTAINER_PAGE_DEFAULT_DELTA));
		int pageSize = ParamUtil.getInteger(renderRequest, "delta", delta);
		int pageNumber = ParamUtil.getInteger(renderRequest, "cur", 1);
		int start = pageSize * (pageNumber - 1);
		int end = pageSize * pageNumber;
		List<Project> projects = null;
		int projectsCount = 0;
		try {
			projects = ProjectLocalServiceUtil.getProjects(-1, -1);
			projectsCount = ProjectLocalServiceUtil.getProjectsCount();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// try {
		// projects = ProjectLocalServiceUtil.
		// } catch (SystemException e) {
		// log.error("findByUserNam(" + userName + "," + start + "," + end +
		// ")错误：" + e.getMessage());
		// }
		// int projectCount = 0;
		// try {
		// projectCount = ProjectLocalServiceUtil.getProjectsCount()(userName);
		// } catch (SystemException e) {
		// log.error("countByUserNam(" + userName + ")错误：" + e.getMessage());
		// }
		renderRequest.setAttribute("projects", projects);
		renderRequest.setAttribute("projectCount", projectsCount);
		// renderRequest.setAttribute("projectCount", projectCount);
		super.doView(renderRequest, renderResponse);
	}
	
	/**
	 * 标段列表
	 */
	public void doViewBiddings(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException {
		String keywords = ParamUtil.getString(actionRequest, "keywords");
		long projectId = ParamUtil.getLong(actionRequest, "projectId");
		int delta = GetterUtil.getInteger(PropsUtil.get(PropsKeys.SEARCH_CONTAINER_PAGE_DEFAULT_DELTA));
		int pageSize = ParamUtil.getInteger(actionRequest, "delta", delta);
		int pageNumber = ParamUtil.getInteger(actionRequest, "cur", 1);
		int start = pageSize * (pageNumber - 1);
		int end = pageSize * pageNumber;
		List<Bidding> biddings = null;
		int biddingsCount = 0;
		try {
			biddings = BiddingLocalServiceUtil.findByProjectId(projectId);
			biddingsCount = BiddingLocalServiceUtil.getBiddingsCount();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		actionRequest.setAttribute("biddings", biddings);
		actionRequest.setAttribute("projectId", projectId);
		actionRequest.setAttribute("biddingsCount", biddingsCount);
	}

	/**
	 * 项目保存
	 * 
	 * @param request
	 * @param response
	 * @throws PortalException
	 * @throws SystemException
	 * @throws ParseException
	 */
	public void saveBidding(ActionRequest request, ActionResponse response) throws PortalException, SystemException,
			ParseException {
		long projectId = ParamUtil.getLong(request, "projectId");
		long biddingId = ParamUtil.getLong(request, "biddingId");
		Integer sortNo = ParamUtil.getInteger(request, "sortNo");
		String bidName = ParamUtil.getString(request, "bidName");
		Date startDate = ParamUtil.getDate(request, "startDate", new SimpleDateFormat(timeFormatPattern));
		String[] involveCountys = ParamUtil.getParameterValues(request, "involveCountyCheckbox");
		String buildMileage = ParamUtil.getString(request, "buildMileage");
		String projLinkman = ParamUtil.getString(request, "projLinkman");
		String linkTel = ParamUtil.getString(request, "linkTel");

		Bidding bidding = null;
		if (Validator.isNotNull(biddingId)) {
			bidding = BiddingLocalServiceUtil.getBidding(biddingId);
		} else {
			bidding = BiddingLocalServiceUtil.createBidding(CounterLocalServiceUtil.increment());
		}
		String involveCountyIds = "";
		if (null != involveCountys && involveCountys.length > 0) {
			for (String involveString : involveCountys) {
				involveCountyIds += "," + involveString;
			}
		}
		bidding.setProjectId(projectId);
		bidding.setSortNo(sortNo);
		bidding.setBidName(bidName);
		bidding.setStartDate(startDate);
		bidding.setInvolveCounty(involveCountyIds);
		bidding.setBuildMileage(buildMileage);
		bidding.setProjLinkman(projLinkman);
		bidding.setLinkTel(linkTel);
		
		
		BiddingLocalServiceUtil.updateBidding(bidding);
		long[] companyIds = ParamUtil.getLongValues(request, "companyId");
		long[] typeIds = ParamUtil.getLongValues(request, "typeId");
		String[] unitNames = ParamUtil.getParameterValues(request, "unitName");
		String[] linkmans = ParamUtil.getParameterValues(request, "linkman");
		String[] linkmanTels = ParamUtil.getParameterValues(request, "linkmanTel");
		for (int i = 0; i < unitNames.length; i++) {
			Company company;
			if (Validator.isNotNull(companyIds[i])) {
				company = CompanyLocalServiceUtil.getCompany(companyIds[i]);
			} else {
				company = CompanyLocalServiceUtil.createCompany(CounterLocalServiceUtil.increment());
			}

			company.setUnitName(unitNames[i]);
			company.setType(typeIds[i]);
			company.setLinkman(linkmans[i]);
			company.setLinkmanTel(linkmanTels[i]);
			company.setBiddingId(biddingId);
			CompanyLocalServiceUtil.updateCompany(company);
		}

	}

	/**
	 * 项目删除
	 * 
	 * @param request
	 * @param response
	 * @throws SystemException
	 * @throws PortalException
	 */
	public void deleteBiddings(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException,
			PortletException, NumberFormatException, PortalException, SystemException {
		String biddingIds = ParamUtil.getString(actionRequest, "biddingIds");
		long projectId = ParamUtil.getLong(actionRequest, "projectId");
		String[] biddingsId = biddingIds.split(",");
		for (String biddingId : biddingsId) {
			List<Company> companies = CompanyLocalServiceUtil.findByBiddingId(Long.parseLong(biddingId));
			if (null != companies && companies.size() > 0) {
				for (Company company : companies) {
					CompanyLocalServiceUtil.deleteCompany(company);
				}
			}

			BiddingLocalServiceUtil.deleteBidding(Long.parseLong(biddingId));
		}
		actionRequest.setAttribute("projectId", projectId);
		actionResponse.setRenderParameter("mvcPath", "/portlet/bidding/viewBidding.jsp");
	}

}