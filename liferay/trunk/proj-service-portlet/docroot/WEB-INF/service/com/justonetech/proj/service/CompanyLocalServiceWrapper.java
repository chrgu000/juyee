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

package com.justonetech.proj.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CompanyLocalService}.
 *
 * @author fanqi
 * @see CompanyLocalService
 * @generated
 */
public class CompanyLocalServiceWrapper implements CompanyLocalService,
	ServiceWrapper<CompanyLocalService> {
	public CompanyLocalServiceWrapper(CompanyLocalService companyLocalService) {
		_companyLocalService = companyLocalService;
	}

	/**
	* Adds the company to the database. Also notifies the appropriate model listeners.
	*
	* @param company the company
	* @return the company that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.justonetech.proj.model.Company addCompany(
		com.justonetech.proj.model.Company company)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _companyLocalService.addCompany(company);
	}

	/**
	* Creates a new company with the primary key. Does not add the company to the database.
	*
	* @param companyId the primary key for the new company
	* @return the new company
	*/
	@Override
	public com.justonetech.proj.model.Company createCompany(long companyId) {
		return _companyLocalService.createCompany(companyId);
	}

	/**
	* Deletes the company with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param companyId the primary key of the company
	* @return the company that was removed
	* @throws PortalException if a company with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.justonetech.proj.model.Company deleteCompany(long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _companyLocalService.deleteCompany(companyId);
	}

	/**
	* Deletes the company from the database. Also notifies the appropriate model listeners.
	*
	* @param company the company
	* @return the company that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.justonetech.proj.model.Company deleteCompany(
		com.justonetech.proj.model.Company company)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _companyLocalService.deleteCompany(company);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _companyLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _companyLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.justonetech.proj.model.impl.CompanyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _companyLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.justonetech.proj.model.impl.CompanyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _companyLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _companyLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _companyLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.justonetech.proj.model.Company fetchCompany(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _companyLocalService.fetchCompany(companyId);
	}

	/**
	* Returns the company with the primary key.
	*
	* @param companyId the primary key of the company
	* @return the company
	* @throws PortalException if a company with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.justonetech.proj.model.Company getCompany(long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _companyLocalService.getCompany(companyId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _companyLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the companies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.justonetech.proj.model.impl.CompanyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of companies
	* @param end the upper bound of the range of companies (not inclusive)
	* @return the range of companies
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.justonetech.proj.model.Company> getCompanies(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _companyLocalService.getCompanies(start, end);
	}

	/**
	* Returns the number of companies.
	*
	* @return the number of companies
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getCompaniesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _companyLocalService.getCompaniesCount();
	}

	/**
	* Updates the company in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param company the company
	* @return the company that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.justonetech.proj.model.Company updateCompany(
		com.justonetech.proj.model.Company company)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _companyLocalService.updateCompany(company);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _companyLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_companyLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _companyLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public CompanyLocalService getWrappedCompanyLocalService() {
		return _companyLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedCompanyLocalService(
		CompanyLocalService companyLocalService) {
		_companyLocalService = companyLocalService;
	}

	@Override
	public CompanyLocalService getWrappedService() {
		return _companyLocalService;
	}

	@Override
	public void setWrappedService(CompanyLocalService companyLocalService) {
		_companyLocalService = companyLocalService;
	}

	private CompanyLocalService _companyLocalService;
}