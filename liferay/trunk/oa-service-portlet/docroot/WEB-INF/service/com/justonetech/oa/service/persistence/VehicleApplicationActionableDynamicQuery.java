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

package com.justonetech.oa.service.persistence;

import com.justonetech.oa.model.VehicleApplication;
import com.justonetech.oa.service.VehicleApplicationLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author justonetech
 * @generated
 */
public abstract class VehicleApplicationActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public VehicleApplicationActionableDynamicQuery() throws SystemException {
		setBaseLocalService(VehicleApplicationLocalServiceUtil.getService());
		setClass(VehicleApplication.class);

		setClassLoader(com.justonetech.oa.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("vehicleApplicationId");
	}
}