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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.justonetech.projApproval.service.http.ConstructionPermitServiceSoap}.
 *
 * @author justonetech
 * @see com.justonetech.projApproval.service.http.ConstructionPermitServiceSoap
 * @generated
 */
public class ConstructionPermitSoap implements Serializable {
	public static ConstructionPermitSoap toSoapModel(ConstructionPermit model) {
		ConstructionPermitSoap soapModel = new ConstructionPermitSoap();

		soapModel.setConstructionPermitId(model.getConstructionPermitId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateTime(model.getCreateTime());
		soapModel.setModifiedTime(model.getModifiedTime());
		soapModel.setProjType(model.getProjType());
		soapModel.setProjProperty(model.getProjProperty());
		soapModel.setCounty(model.getCounty());
		soapModel.setConstructionCode(model.getConstructionCode());
		soapModel.setBidingCode(model.getBidingCode());
		soapModel.setBusinessCode(model.getBusinessCode());
		soapModel.setProjName(model.getProjName());
		soapModel.setCompany(model.getCompany());
		soapModel.setCompanyProperty(model.getCompanyProperty());
		soapModel.setCompanyAddress(model.getCompanyAddress());
		soapModel.setLegalPerson(model.getLegalPerson());
		soapModel.setCompanyTel(model.getCompanyTel());
		soapModel.setCompanyContacts(model.getCompanyContacts());
		soapModel.setCompanyContactPhone(model.getCompanyContactPhone());
		soapModel.setCompanySite(model.getCompanySite());
		soapModel.setEngineerCategory(model.getEngineerCategory());
		soapModel.setEngineerAttribute(model.getEngineerAttribute());
		soapModel.setEngineerScale(model.getEngineerScale());
		soapModel.setNationalFundsPer(model.getNationalFundsPer());
		soapModel.setContractPrice(model.getContractPrice());
		soapModel.setContractSchedule(model.getContractSchedule());
		soapModel.setBidPrice(model.getBidPrice());
		soapModel.setInvestBudget(model.getInvestBudget());
		soapModel.setPlanStartDate(model.getPlanStartDate());
		soapModel.setPlanEndDate(model.getPlanEndDate());
		soapModel.setWorkSituation(model.getWorkSituation());
		soapModel.setOtherInfo(model.getOtherInfo());
		soapModel.setApplyMaterial(model.getApplyMaterial());
		soapModel.setReceiptNum(model.getReceiptNum());
		soapModel.setCertificationDate(model.getCertificationDate());

		return soapModel;
	}

	public static ConstructionPermitSoap[] toSoapModels(
		ConstructionPermit[] models) {
		ConstructionPermitSoap[] soapModels = new ConstructionPermitSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ConstructionPermitSoap[][] toSoapModels(
		ConstructionPermit[][] models) {
		ConstructionPermitSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ConstructionPermitSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ConstructionPermitSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ConstructionPermitSoap[] toSoapModels(
		List<ConstructionPermit> models) {
		List<ConstructionPermitSoap> soapModels = new ArrayList<ConstructionPermitSoap>(models.size());

		for (ConstructionPermit model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ConstructionPermitSoap[soapModels.size()]);
	}

	public ConstructionPermitSoap() {
	}

	public long getPrimaryKey() {
		return _constructionPermitId;
	}

	public void setPrimaryKey(long pk) {
		setConstructionPermitId(pk);
	}

	public long getConstructionPermitId() {
		return _constructionPermitId;
	}

	public void setConstructionPermitId(long constructionPermitId) {
		_constructionPermitId = constructionPermitId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateTime() {
		return _createTime;
	}

	public void setCreateTime(Date createTime) {
		_createTime = createTime;
	}

	public Date getModifiedTime() {
		return _modifiedTime;
	}

	public void setModifiedTime(Date modifiedTime) {
		_modifiedTime = modifiedTime;
	}

	public long getProjType() {
		return _projType;
	}

	public void setProjType(long projType) {
		_projType = projType;
	}

	public long getProjProperty() {
		return _projProperty;
	}

	public void setProjProperty(long projProperty) {
		_projProperty = projProperty;
	}

	public long getCounty() {
		return _county;
	}

	public void setCounty(long county) {
		_county = county;
	}

	public String getConstructionCode() {
		return _constructionCode;
	}

	public void setConstructionCode(String constructionCode) {
		_constructionCode = constructionCode;
	}

	public String getBidingCode() {
		return _bidingCode;
	}

	public void setBidingCode(String bidingCode) {
		_bidingCode = bidingCode;
	}

	public String getBusinessCode() {
		return _businessCode;
	}

	public void setBusinessCode(String businessCode) {
		_businessCode = businessCode;
	}

	public String getProjName() {
		return _projName;
	}

	public void setProjName(String projName) {
		_projName = projName;
	}

	public String getCompany() {
		return _company;
	}

	public void setCompany(String company) {
		_company = company;
	}

	public String getCompanyProperty() {
		return _companyProperty;
	}

	public void setCompanyProperty(String companyProperty) {
		_companyProperty = companyProperty;
	}

	public String getCompanyAddress() {
		return _companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		_companyAddress = companyAddress;
	}

	public String getLegalPerson() {
		return _legalPerson;
	}

	public void setLegalPerson(String legalPerson) {
		_legalPerson = legalPerson;
	}

	public String getCompanyTel() {
		return _companyTel;
	}

	public void setCompanyTel(String companyTel) {
		_companyTel = companyTel;
	}

	public String getCompanyContacts() {
		return _companyContacts;
	}

	public void setCompanyContacts(String companyContacts) {
		_companyContacts = companyContacts;
	}

	public String getCompanyContactPhone() {
		return _companyContactPhone;
	}

	public void setCompanyContactPhone(String companyContactPhone) {
		_companyContactPhone = companyContactPhone;
	}

	public String getCompanySite() {
		return _companySite;
	}

	public void setCompanySite(String companySite) {
		_companySite = companySite;
	}

	public String getEngineerCategory() {
		return _engineerCategory;
	}

	public void setEngineerCategory(String engineerCategory) {
		_engineerCategory = engineerCategory;
	}

	public long getEngineerAttribute() {
		return _engineerAttribute;
	}

	public void setEngineerAttribute(long engineerAttribute) {
		_engineerAttribute = engineerAttribute;
	}

	public String getEngineerScale() {
		return _engineerScale;
	}

	public void setEngineerScale(String engineerScale) {
		_engineerScale = engineerScale;
	}

	public String getNationalFundsPer() {
		return _nationalFundsPer;
	}

	public void setNationalFundsPer(String nationalFundsPer) {
		_nationalFundsPer = nationalFundsPer;
	}

	public double getContractPrice() {
		return _contractPrice;
	}

	public void setContractPrice(double contractPrice) {
		_contractPrice = contractPrice;
	}

	public double getContractSchedule() {
		return _contractSchedule;
	}

	public void setContractSchedule(double contractSchedule) {
		_contractSchedule = contractSchedule;
	}

	public double getBidPrice() {
		return _bidPrice;
	}

	public void setBidPrice(double bidPrice) {
		_bidPrice = bidPrice;
	}

	public double getInvestBudget() {
		return _investBudget;
	}

	public void setInvestBudget(double investBudget) {
		_investBudget = investBudget;
	}

	public Date getPlanStartDate() {
		return _planStartDate;
	}

	public void setPlanStartDate(Date planStartDate) {
		_planStartDate = planStartDate;
	}

	public Date getPlanEndDate() {
		return _planEndDate;
	}

	public void setPlanEndDate(Date planEndDate) {
		_planEndDate = planEndDate;
	}

	public String getWorkSituation() {
		return _workSituation;
	}

	public void setWorkSituation(String workSituation) {
		_workSituation = workSituation;
	}

	public String getOtherInfo() {
		return _otherInfo;
	}

	public void setOtherInfo(String otherInfo) {
		_otherInfo = otherInfo;
	}

	public String getApplyMaterial() {
		return _applyMaterial;
	}

	public void setApplyMaterial(String applyMaterial) {
		_applyMaterial = applyMaterial;
	}

	public String getReceiptNum() {
		return _receiptNum;
	}

	public void setReceiptNum(String receiptNum) {
		_receiptNum = receiptNum;
	}

	public Date getCertificationDate() {
		return _certificationDate;
	}

	public void setCertificationDate(Date certificationDate) {
		_certificationDate = certificationDate;
	}

	private long _constructionPermitId;
	private long _userId;
	private String _userName;
	private Date _createTime;
	private Date _modifiedTime;
	private long _projType;
	private long _projProperty;
	private long _county;
	private String _constructionCode;
	private String _bidingCode;
	private String _businessCode;
	private String _projName;
	private String _company;
	private String _companyProperty;
	private String _companyAddress;
	private String _legalPerson;
	private String _companyTel;
	private String _companyContacts;
	private String _companyContactPhone;
	private String _companySite;
	private String _engineerCategory;
	private long _engineerAttribute;
	private String _engineerScale;
	private String _nationalFundsPer;
	private double _contractPrice;
	private double _contractSchedule;
	private double _bidPrice;
	private double _investBudget;
	private Date _planStartDate;
	private Date _planEndDate;
	private String _workSituation;
	private String _otherInfo;
	private String _applyMaterial;
	private String _receiptNum;
	private Date _certificationDate;
}