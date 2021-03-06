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

package com.justonetech.proj.service.impl;

import java.util.List;

import com.justonetech.proj.model.Company;
import com.justonetech.proj.service.base.CompanyLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the company local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.justonetech.proj.service.CompanyLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author fanqi
 * @see com.justonetech.proj.service.base.CompanyLocalServiceBaseImpl
 * @see com.justonetech.proj.service.CompanyLocalServiceUtil
 */
public class CompanyLocalServiceImpl extends CompanyLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.justonetech.proj.service.CompanyLocalServiceUtil} to access the company local service.
	 */
	
	public List<Company> findByProjectId(long projectId) throws SystemException {
		return companyPersistence.findByProjectId(projectId);
	}

	public int countByProjectId(long projectId) throws SystemException {

		return companyPersistence.countByProjectId(projectId);
	}

	public List<Company> findByBiddingId(long biddingId) throws SystemException {
		return companyPersistence.findByBiddingId(biddingId);
	}

	public int countByBiddingId(long biddingId) throws SystemException {

		return companyPersistence.countByBiddingId(biddingId);
	}
}