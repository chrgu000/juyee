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

package com.justonetech.cp.permit.model.impl;

import com.justonetech.cp.permit.model.UnitProject;
import com.justonetech.cp.permit.service.UnitProjectLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the UnitProject service. Represents a row in the &quot;cp_UnitProject&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link UnitProjectImpl}.
 * </p>
 *
 * @author fanqi
 * @see UnitProjectImpl
 * @see com.justonetech.cp.permit.model.UnitProject
 * @generated
 */
public abstract class UnitProjectBaseImpl extends UnitProjectModelImpl
	implements UnitProject {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a unit project model instance should use the {@link UnitProject} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			UnitProjectLocalServiceUtil.addUnitProject(this);
		}
		else {
			UnitProjectLocalServiceUtil.updateUnitProject(this);
		}
	}
}