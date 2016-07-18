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

package com.justonetech.projApproval.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the ConstructionPermit service. Represents a row in the &quot;projApproval_ConstructionPermit&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.justonetech.projApproval.model.impl.ConstructionPermitModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.justonetech.projApproval.model.impl.ConstructionPermitImpl}.
 * </p>
 *
 * @author justonetech
 * @see ConstructionPermit
 * @see com.justonetech.projApproval.model.impl.ConstructionPermitImpl
 * @see com.justonetech.projApproval.model.impl.ConstructionPermitModelImpl
 * @generated
 */
public interface ConstructionPermitModel extends BaseModel<ConstructionPermit> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a construction permit model instance should use the {@link ConstructionPermit} interface instead.
	 */

	/**
	 * Returns the primary key of this construction permit.
	 *
	 * @return the primary key of this construction permit
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this construction permit.
	 *
	 * @param primaryKey the primary key of this construction permit
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the construction permit ID of this construction permit.
	 *
	 * @return the construction permit ID of this construction permit
	 */
	public long getConstructionPermitId();

	/**
	 * Sets the construction permit ID of this construction permit.
	 *
	 * @param constructionPermitId the construction permit ID of this construction permit
	 */
	public void setConstructionPermitId(long constructionPermitId);

	/**
	 * Returns the user ID of this construction permit.
	 *
	 * @return the user ID of this construction permit
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this construction permit.
	 *
	 * @param userId the user ID of this construction permit
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this construction permit.
	 *
	 * @return the user uuid of this construction permit
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this construction permit.
	 *
	 * @param userUuid the user uuid of this construction permit
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this construction permit.
	 *
	 * @return the user name of this construction permit
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this construction permit.
	 *
	 * @param userName the user name of this construction permit
	 */
	public void setUserName(String userName);

	/**
	 * Returns the create time of this construction permit.
	 *
	 * @return the create time of this construction permit
	 */
	public Date getCreateTime();

	/**
	 * Sets the create time of this construction permit.
	 *
	 * @param createTime the create time of this construction permit
	 */
	public void setCreateTime(Date createTime);

	/**
	 * Returns the modified time of this construction permit.
	 *
	 * @return the modified time of this construction permit
	 */
	public Date getModifiedTime();

	/**
	 * Sets the modified time of this construction permit.
	 *
	 * @param modifiedTime the modified time of this construction permit
	 */
	public void setModifiedTime(Date modifiedTime);

	/**
	 * Returns the proj type of this construction permit.
	 *
	 * @return the proj type of this construction permit
	 */
	public long getProjType();

	/**
	 * Sets the proj type of this construction permit.
	 *
	 * @param projType the proj type of this construction permit
	 */
	public void setProjType(long projType);

	/**
	 * Returns the proj property of this construction permit.
	 *
	 * @return the proj property of this construction permit
	 */
	public long getProjProperty();

	/**
	 * Sets the proj property of this construction permit.
	 *
	 * @param projProperty the proj property of this construction permit
	 */
	public void setProjProperty(long projProperty);

	/**
	 * Returns the county of this construction permit.
	 *
	 * @return the county of this construction permit
	 */
	public long getCounty();

	/**
	 * Sets the county of this construction permit.
	 *
	 * @param county the county of this construction permit
	 */
	public void setCounty(long county);

	/**
	 * Returns the construction code of this construction permit.
	 *
	 * @return the construction code of this construction permit
	 */
	@AutoEscape
	public String getConstructionCode();

	/**
	 * Sets the construction code of this construction permit.
	 *
	 * @param constructionCode the construction code of this construction permit
	 */
	public void setConstructionCode(String constructionCode);

	/**
	 * Returns the biding code of this construction permit.
	 *
	 * @return the biding code of this construction permit
	 */
	@AutoEscape
	public String getBidingCode();

	/**
	 * Sets the biding code of this construction permit.
	 *
	 * @param bidingCode the biding code of this construction permit
	 */
	public void setBidingCode(String bidingCode);

	/**
	 * Returns the business code of this construction permit.
	 *
	 * @return the business code of this construction permit
	 */
	@AutoEscape
	public String getBusinessCode();

	/**
	 * Sets the business code of this construction permit.
	 *
	 * @param businessCode the business code of this construction permit
	 */
	public void setBusinessCode(String businessCode);

	/**
	 * Returns the proj name of this construction permit.
	 *
	 * @return the proj name of this construction permit
	 */
	@AutoEscape
	public String getProjName();

	/**
	 * Sets the proj name of this construction permit.
	 *
	 * @param projName the proj name of this construction permit
	 */
	public void setProjName(String projName);

	/**
	 * Returns the company of this construction permit.
	 *
	 * @return the company of this construction permit
	 */
	@AutoEscape
	public String getCompany();

	/**
	 * Sets the company of this construction permit.
	 *
	 * @param company the company of this construction permit
	 */
	public void setCompany(String company);

	/**
	 * Returns the company property of this construction permit.
	 *
	 * @return the company property of this construction permit
	 */
	@AutoEscape
	public String getCompanyProperty();

	/**
	 * Sets the company property of this construction permit.
	 *
	 * @param companyProperty the company property of this construction permit
	 */
	public void setCompanyProperty(String companyProperty);

	/**
	 * Returns the company address of this construction permit.
	 *
	 * @return the company address of this construction permit
	 */
	@AutoEscape
	public String getCompanyAddress();

	/**
	 * Sets the company address of this construction permit.
	 *
	 * @param companyAddress the company address of this construction permit
	 */
	public void setCompanyAddress(String companyAddress);

	/**
	 * Returns the legal person of this construction permit.
	 *
	 * @return the legal person of this construction permit
	 */
	@AutoEscape
	public String getLegalPerson();

	/**
	 * Sets the legal person of this construction permit.
	 *
	 * @param legalPerson the legal person of this construction permit
	 */
	public void setLegalPerson(String legalPerson);

	/**
	 * Returns the company tel of this construction permit.
	 *
	 * @return the company tel of this construction permit
	 */
	@AutoEscape
	public String getCompanyTel();

	/**
	 * Sets the company tel of this construction permit.
	 *
	 * @param companyTel the company tel of this construction permit
	 */
	public void setCompanyTel(String companyTel);

	/**
	 * Returns the company contacts of this construction permit.
	 *
	 * @return the company contacts of this construction permit
	 */
	@AutoEscape
	public String getCompanyContacts();

	/**
	 * Sets the company contacts of this construction permit.
	 *
	 * @param companyContacts the company contacts of this construction permit
	 */
	public void setCompanyContacts(String companyContacts);

	/**
	 * Returns the company contact phone of this construction permit.
	 *
	 * @return the company contact phone of this construction permit
	 */
	@AutoEscape
	public String getCompanyContactPhone();

	/**
	 * Sets the company contact phone of this construction permit.
	 *
	 * @param companyContactPhone the company contact phone of this construction permit
	 */
	public void setCompanyContactPhone(String companyContactPhone);

	/**
	 * Returns the company site of this construction permit.
	 *
	 * @return the company site of this construction permit
	 */
	@AutoEscape
	public String getCompanySite();

	/**
	 * Sets the company site of this construction permit.
	 *
	 * @param companySite the company site of this construction permit
	 */
	public void setCompanySite(String companySite);

	/**
	 * Returns the engineer category of this construction permit.
	 *
	 * @return the engineer category of this construction permit
	 */
	@AutoEscape
	public String getEngineerCategory();

	/**
	 * Sets the engineer category of this construction permit.
	 *
	 * @param engineerCategory the engineer category of this construction permit
	 */
	public void setEngineerCategory(String engineerCategory);

	/**
	 * Returns the engineer attribute of this construction permit.
	 *
	 * @return the engineer attribute of this construction permit
	 */
	public long getEngineerAttribute();

	/**
	 * Sets the engineer attribute of this construction permit.
	 *
	 * @param engineerAttribute the engineer attribute of this construction permit
	 */
	public void setEngineerAttribute(long engineerAttribute);

	/**
	 * Returns the engineer scale of this construction permit.
	 *
	 * @return the engineer scale of this construction permit
	 */
	@AutoEscape
	public String getEngineerScale();

	/**
	 * Sets the engineer scale of this construction permit.
	 *
	 * @param engineerScale the engineer scale of this construction permit
	 */
	public void setEngineerScale(String engineerScale);

	/**
	 * Returns the national funds per of this construction permit.
	 *
	 * @return the national funds per of this construction permit
	 */
	@AutoEscape
	public String getNationalFundsPer();

	/**
	 * Sets the national funds per of this construction permit.
	 *
	 * @param nationalFundsPer the national funds per of this construction permit
	 */
	public void setNationalFundsPer(String nationalFundsPer);

	/**
	 * Returns the contract price of this construction permit.
	 *
	 * @return the contract price of this construction permit
	 */
	public double getContractPrice();

	/**
	 * Sets the contract price of this construction permit.
	 *
	 * @param contractPrice the contract price of this construction permit
	 */
	public void setContractPrice(double contractPrice);

	/**
	 * Returns the contract schedule of this construction permit.
	 *
	 * @return the contract schedule of this construction permit
	 */
	public double getContractSchedule();

	/**
	 * Sets the contract schedule of this construction permit.
	 *
	 * @param contractSchedule the contract schedule of this construction permit
	 */
	public void setContractSchedule(double contractSchedule);

	/**
	 * Returns the bid price of this construction permit.
	 *
	 * @return the bid price of this construction permit
	 */
	public double getBidPrice();

	/**
	 * Sets the bid price of this construction permit.
	 *
	 * @param bidPrice the bid price of this construction permit
	 */
	public void setBidPrice(double bidPrice);

	/**
	 * Returns the invest budget of this construction permit.
	 *
	 * @return the invest budget of this construction permit
	 */
	public double getInvestBudget();

	/**
	 * Sets the invest budget of this construction permit.
	 *
	 * @param investBudget the invest budget of this construction permit
	 */
	public void setInvestBudget(double investBudget);

	/**
	 * Returns the plan start date of this construction permit.
	 *
	 * @return the plan start date of this construction permit
	 */
	public Date getPlanStartDate();

	/**
	 * Sets the plan start date of this construction permit.
	 *
	 * @param planStartDate the plan start date of this construction permit
	 */
	public void setPlanStartDate(Date planStartDate);

	/**
	 * Returns the plan end date of this construction permit.
	 *
	 * @return the plan end date of this construction permit
	 */
	public Date getPlanEndDate();

	/**
	 * Sets the plan end date of this construction permit.
	 *
	 * @param planEndDate the plan end date of this construction permit
	 */
	public void setPlanEndDate(Date planEndDate);

	/**
	 * Returns the work situation of this construction permit.
	 *
	 * @return the work situation of this construction permit
	 */
	@AutoEscape
	public String getWorkSituation();

	/**
	 * Sets the work situation of this construction permit.
	 *
	 * @param workSituation the work situation of this construction permit
	 */
	public void setWorkSituation(String workSituation);

	/**
	 * Returns the other info of this construction permit.
	 *
	 * @return the other info of this construction permit
	 */
	@AutoEscape
	public String getOtherInfo();

	/**
	 * Sets the other info of this construction permit.
	 *
	 * @param otherInfo the other info of this construction permit
	 */
	public void setOtherInfo(String otherInfo);

	/**
	 * Returns the apply material of this construction permit.
	 *
	 * @return the apply material of this construction permit
	 */
	@AutoEscape
	public String getApplyMaterial();

	/**
	 * Sets the apply material of this construction permit.
	 *
	 * @param applyMaterial the apply material of this construction permit
	 */
	public void setApplyMaterial(String applyMaterial);

	/**
	 * Returns the receipt num of this construction permit.
	 *
	 * @return the receipt num of this construction permit
	 */
	@AutoEscape
	public String getReceiptNum();

	/**
	 * Sets the receipt num of this construction permit.
	 *
	 * @param receiptNum the receipt num of this construction permit
	 */
	public void setReceiptNum(String receiptNum);

	/**
	 * Returns the certification date of this construction permit.
	 *
	 * @return the certification date of this construction permit
	 */
	public Date getCertificationDate();

	/**
	 * Sets the certification date of this construction permit.
	 *
	 * @param certificationDate the certification date of this construction permit
	 */
	public void setCertificationDate(Date certificationDate);

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
		com.justonetech.projApproval.model.ConstructionPermit constructionPermit);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.justonetech.projApproval.model.ConstructionPermit> toCacheModel();

	@Override
	public com.justonetech.projApproval.model.ConstructionPermit toEscapedModel();

	@Override
	public com.justonetech.projApproval.model.ConstructionPermit toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}