/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.justonetech.proj.service.base;

import com.justonetech.proj.model.Project;
import com.justonetech.proj.service.ProjectService;
import com.justonetech.proj.service.persistence.BiddingPersistence;
import com.justonetech.proj.service.persistence.CompanyPersistence;
import com.justonetech.proj.service.persistence.ProjectPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the project remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.justonetech.proj.service.impl.ProjectServiceImpl}.
 * </p>
 *
 * @author fanqi
 * @see com.justonetech.proj.service.impl.ProjectServiceImpl
 * @see com.justonetech.proj.service.ProjectServiceUtil
 * @generated
 */
public abstract class ProjectServiceBaseImpl extends BaseServiceImpl
	implements ProjectService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.justonetech.proj.service.ProjectServiceUtil} to access the project remote service.
	 */

	/**
	 * Returns the bidding local service.
	 *
	 * @return the bidding local service
	 */
	public com.justonetech.proj.service.BiddingLocalService getBiddingLocalService() {
		return biddingLocalService;
	}

	/**
	 * Sets the bidding local service.
	 *
	 * @param biddingLocalService the bidding local service
	 */
	public void setBiddingLocalService(
		com.justonetech.proj.service.BiddingLocalService biddingLocalService) {
		this.biddingLocalService = biddingLocalService;
	}

	/**
	 * Returns the bidding remote service.
	 *
	 * @return the bidding remote service
	 */
	public com.justonetech.proj.service.BiddingService getBiddingService() {
		return biddingService;
	}

	/**
	 * Sets the bidding remote service.
	 *
	 * @param biddingService the bidding remote service
	 */
	public void setBiddingService(
		com.justonetech.proj.service.BiddingService biddingService) {
		this.biddingService = biddingService;
	}

	/**
	 * Returns the bidding persistence.
	 *
	 * @return the bidding persistence
	 */
	public BiddingPersistence getBiddingPersistence() {
		return biddingPersistence;
	}

	/**
	 * Sets the bidding persistence.
	 *
	 * @param biddingPersistence the bidding persistence
	 */
	public void setBiddingPersistence(BiddingPersistence biddingPersistence) {
		this.biddingPersistence = biddingPersistence;
	}

	/**
	 * Returns the company local service.
	 *
	 * @return the company local service
	 */
	public com.justonetech.proj.service.CompanyLocalService getCompanyLocalService() {
		return companyLocalService;
	}

	/**
	 * Sets the company local service.
	 *
	 * @param companyLocalService the company local service
	 */
	public void setCompanyLocalService(
		com.justonetech.proj.service.CompanyLocalService companyLocalService) {
		this.companyLocalService = companyLocalService;
	}

	/**
	 * Returns the company remote service.
	 *
	 * @return the company remote service
	 */
	public com.justonetech.proj.service.CompanyService getCompanyService() {
		return companyService;
	}

	/**
	 * Sets the company remote service.
	 *
	 * @param companyService the company remote service
	 */
	public void setCompanyService(
		com.justonetech.proj.service.CompanyService companyService) {
		this.companyService = companyService;
	}

	/**
	 * Returns the company persistence.
	 *
	 * @return the company persistence
	 */
	public CompanyPersistence getCompanyPersistence() {
		return companyPersistence;
	}

	/**
	 * Sets the company persistence.
	 *
	 * @param companyPersistence the company persistence
	 */
	public void setCompanyPersistence(CompanyPersistence companyPersistence) {
		this.companyPersistence = companyPersistence;
	}

	/**
	 * Returns the project local service.
	 *
	 * @return the project local service
	 */
	public com.justonetech.proj.service.ProjectLocalService getProjectLocalService() {
		return projectLocalService;
	}

	/**
	 * Sets the project local service.
	 *
	 * @param projectLocalService the project local service
	 */
	public void setProjectLocalService(
		com.justonetech.proj.service.ProjectLocalService projectLocalService) {
		this.projectLocalService = projectLocalService;
	}

	/**
	 * Returns the project remote service.
	 *
	 * @return the project remote service
	 */
	public com.justonetech.proj.service.ProjectService getProjectService() {
		return projectService;
	}

	/**
	 * Sets the project remote service.
	 *
	 * @param projectService the project remote service
	 */
	public void setProjectService(
		com.justonetech.proj.service.ProjectService projectService) {
		this.projectService = projectService;
	}

	/**
	 * Returns the project persistence.
	 *
	 * @return the project persistence
	 */
	public ProjectPersistence getProjectPersistence() {
		return projectPersistence;
	}

	/**
	 * Sets the project persistence.
	 *
	 * @param projectPersistence the project persistence
	 */
	public void setProjectPersistence(ProjectPersistence projectPersistence) {
		this.projectPersistence = projectPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();
	}

	public void destroy() {
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return Project.class;
	}

	protected String getModelClassName() {
		return Project.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = projectPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.justonetech.proj.service.BiddingLocalService.class)
	protected com.justonetech.proj.service.BiddingLocalService biddingLocalService;
	@BeanReference(type = com.justonetech.proj.service.BiddingService.class)
	protected com.justonetech.proj.service.BiddingService biddingService;
	@BeanReference(type = BiddingPersistence.class)
	protected BiddingPersistence biddingPersistence;
	@BeanReference(type = com.justonetech.proj.service.CompanyLocalService.class)
	protected com.justonetech.proj.service.CompanyLocalService companyLocalService;
	@BeanReference(type = com.justonetech.proj.service.CompanyService.class)
	protected com.justonetech.proj.service.CompanyService companyService;
	@BeanReference(type = CompanyPersistence.class)
	protected CompanyPersistence companyPersistence;
	@BeanReference(type = com.justonetech.proj.service.ProjectLocalService.class)
	protected com.justonetech.proj.service.ProjectLocalService projectLocalService;
	@BeanReference(type = com.justonetech.proj.service.ProjectService.class)
	protected com.justonetech.proj.service.ProjectService projectService;
	@BeanReference(type = ProjectPersistence.class)
	protected ProjectPersistence projectPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private ProjectServiceClpInvoker _clpInvoker = new ProjectServiceClpInvoker();
}