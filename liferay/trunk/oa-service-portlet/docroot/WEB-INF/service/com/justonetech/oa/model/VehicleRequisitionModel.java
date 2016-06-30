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

package com.justonetech.oa.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the VehicleRequisition service. Represents a row in the &quot;oa_VehicleRequisition&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.justonetech.oa.model.impl.VehicleRequisitionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.justonetech.oa.model.impl.VehicleRequisitionImpl}.
 * </p>
 *
 * @author justonetech
 * @see VehicleRequisition
 * @see com.justonetech.oa.model.impl.VehicleRequisitionImpl
 * @see com.justonetech.oa.model.impl.VehicleRequisitionModelImpl
 * @generated
 */
public interface VehicleRequisitionModel extends BaseModel<VehicleRequisition> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a vehicle requisition model instance should use the {@link VehicleRequisition} interface instead.
	 */

	/**
	 * Returns the primary key of this vehicle requisition.
	 *
	 * @return the primary key of this vehicle requisition
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this vehicle requisition.
	 *
	 * @param primaryKey the primary key of this vehicle requisition
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the vehicle requisition ID of this vehicle requisition.
	 *
	 * @return the vehicle requisition ID of this vehicle requisition
	 */
	public long getVehicleRequisitionId();

	/**
	 * Sets the vehicle requisition ID of this vehicle requisition.
	 *
	 * @param vehicleRequisitionId the vehicle requisition ID of this vehicle requisition
	 */
	public void setVehicleRequisitionId(long vehicleRequisitionId);

	/**
	 * Returns the user ID of this vehicle requisition.
	 *
	 * @return the user ID of this vehicle requisition
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this vehicle requisition.
	 *
	 * @param userId the user ID of this vehicle requisition
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this vehicle requisition.
	 *
	 * @return the user uuid of this vehicle requisition
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this vehicle requisition.
	 *
	 * @param userUuid the user uuid of this vehicle requisition
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this vehicle requisition.
	 *
	 * @return the user name of this vehicle requisition
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this vehicle requisition.
	 *
	 * @param userName the user name of this vehicle requisition
	 */
	public void setUserName(String userName);

	/**
	 * Returns the create time of this vehicle requisition.
	 *
	 * @return the create time of this vehicle requisition
	 */
	public Date getCreateTime();

	/**
	 * Sets the create time of this vehicle requisition.
	 *
	 * @param createTime the create time of this vehicle requisition
	 */
	public void setCreateTime(Date createTime);

	/**
	 * Returns the modified time of this vehicle requisition.
	 *
	 * @return the modified time of this vehicle requisition
	 */
	public Date getModifiedTime();

	/**
	 * Sets the modified time of this vehicle requisition.
	 *
	 * @param modifiedTime the modified time of this vehicle requisition
	 */
	public void setModifiedTime(Date modifiedTime);

	/**
	 * Returns the applicant dept ID of this vehicle requisition.
	 *
	 * @return the applicant dept ID of this vehicle requisition
	 */
	public long getApplicantDeptId();

	/**
	 * Sets the applicant dept ID of this vehicle requisition.
	 *
	 * @param applicantDeptId the applicant dept ID of this vehicle requisition
	 */
	public void setApplicantDeptId(long applicantDeptId);

	/**
	 * Returns the applicant dept name of this vehicle requisition.
	 *
	 * @return the applicant dept name of this vehicle requisition
	 */
	@AutoEscape
	public String getApplicantDeptName();

	/**
	 * Sets the applicant dept name of this vehicle requisition.
	 *
	 * @param applicantDeptName the applicant dept name of this vehicle requisition
	 */
	public void setApplicantDeptName(String applicantDeptName);

	/**
	 * Returns the applicant ID of this vehicle requisition.
	 *
	 * @return the applicant ID of this vehicle requisition
	 */
	public long getApplicantId();

	/**
	 * Sets the applicant ID of this vehicle requisition.
	 *
	 * @param applicantId the applicant ID of this vehicle requisition
	 */
	public void setApplicantId(long applicantId);

	/**
	 * Returns the applicant name of this vehicle requisition.
	 *
	 * @return the applicant name of this vehicle requisition
	 */
	@AutoEscape
	public String getApplicantName();

	/**
	 * Sets the applicant name of this vehicle requisition.
	 *
	 * @param applicantName the applicant name of this vehicle requisition
	 */
	public void setApplicantName(String applicantName);

	/**
	 * Returns the start time of this vehicle requisition.
	 *
	 * @return the start time of this vehicle requisition
	 */
	public Date getStartTime();

	/**
	 * Sets the start time of this vehicle requisition.
	 *
	 * @param startTime the start time of this vehicle requisition
	 */
	public void setStartTime(Date startTime);

	/**
	 * Returns the end time of this vehicle requisition.
	 *
	 * @return the end time of this vehicle requisition
	 */
	public Date getEndTime();

	/**
	 * Sets the end time of this vehicle requisition.
	 *
	 * @param endTime the end time of this vehicle requisition
	 */
	public void setEndTime(Date endTime);

	/**
	 * Returns the passenger num of this vehicle requisition.
	 *
	 * @return the passenger num of this vehicle requisition
	 */
	public int getPassengerNum();

	/**
	 * Sets the passenger num of this vehicle requisition.
	 *
	 * @param passengerNum the passenger num of this vehicle requisition
	 */
	public void setPassengerNum(int passengerNum);

	/**
	 * Returns the reason of this vehicle requisition.
	 *
	 * @return the reason of this vehicle requisition
	 */
	@AutoEscape
	public String getReason();

	/**
	 * Sets the reason of this vehicle requisition.
	 *
	 * @param reason the reason of this vehicle requisition
	 */
	public void setReason(String reason);

	/**
	 * Returns the destination of this vehicle requisition.
	 *
	 * @return the destination of this vehicle requisition
	 */
	@AutoEscape
	public String getDestination();

	/**
	 * Sets the destination of this vehicle requisition.
	 *
	 * @param destination the destination of this vehicle requisition
	 */
	public void setDestination(String destination);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		com.justonetech.oa.model.VehicleRequisition vehicleRequisition);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.justonetech.oa.model.VehicleRequisition> toCacheModel();

	@Override
	public com.justonetech.oa.model.VehicleRequisition toEscapedModel();

	@Override
	public com.justonetech.oa.model.VehicleRequisition toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}