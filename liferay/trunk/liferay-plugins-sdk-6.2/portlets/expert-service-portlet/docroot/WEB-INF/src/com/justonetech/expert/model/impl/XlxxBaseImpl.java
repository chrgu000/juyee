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

package com.justonetech.expert.model.impl;

import com.justonetech.expert.model.Xlxx;
import com.justonetech.expert.service.XlxxLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the Xlxx service. Represents a row in the &quot;expert_Xlxx&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link XlxxImpl}.
 * </p>
 *
 * @author fanqi
 * @see XlxxImpl
 * @see com.justonetech.expert.model.Xlxx
 * @generated
 */
public abstract class XlxxBaseImpl extends XlxxModelImpl implements Xlxx {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a xlxx model instance should use the {@link Xlxx} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			XlxxLocalServiceUtil.addXlxx(this);
		}
		else {
			XlxxLocalServiceUtil.updateXlxx(this);
		}
	}
}