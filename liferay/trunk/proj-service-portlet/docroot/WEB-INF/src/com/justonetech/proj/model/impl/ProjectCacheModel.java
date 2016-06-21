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

package com.justonetech.proj.model.impl;

import com.justonetech.proj.model.Project;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Project in entity cache.
 *
 * @author fanqi
 * @see Project
 * @generated
 */
public class ProjectCacheModel implements CacheModel<Project>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(75);

		sb.append("{projectId=");
		sb.append(projectId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", bjbh=");
		sb.append(bjbh);
		sb.append(", projNum=");
		sb.append(projNum);
		sb.append(", sortNo=");
		sb.append(sortNo);
		sb.append(", projStatus=");
		sb.append(projStatus);
		sb.append(", industryCategory=");
		sb.append(industryCategory);
		sb.append(", manageAttr=");
		sb.append(manageAttr);
		sb.append(", isMajor=");
		sb.append(isMajor);
		sb.append(", projSource=");
		sb.append(projSource);
		sb.append(", belongCounty=");
		sb.append(belongCounty);
		sb.append(", projAttr=");
		sb.append(projAttr);
		sb.append(", startDate=");
		sb.append(startDate);
		sb.append(", endDate=");
		sb.append(endDate);
		sb.append(", projName=");
		sb.append(projName);
		sb.append(", location=");
		sb.append(location);
		sb.append(", involveCounty=");
		sb.append(involveCounty);
		sb.append(", ghhx=");
		sb.append(ghhx);
		sb.append(", roadLevel=");
		sb.append(roadLevel);
		sb.append(", roadTechLevel=");
		sb.append(roadTechLevel);
		sb.append(", startNode=");
		sb.append(startNode);
		sb.append(", endNode=");
		sb.append(endNode);
		sb.append(", planStartDate=");
		sb.append(planStartDate);
		sb.append(", planEndDate=");
		sb.append(planEndDate);
		sb.append(", introduction=");
		sb.append(introduction);
		sb.append(", planTotle=");
		sb.append(planTotle);
		sb.append(", gkpfTotle=");
		sb.append(gkpfTotle);
		sb.append(", gkpfPre=");
		sb.append(gkpfPre);
		sb.append(", gkpfJafy=");
		sb.append(gkpfJafy);
		sb.append(", csTotle=");
		sb.append(csTotle);
		sb.append(", csPre=");
		sb.append(csPre);
		sb.append(", csJafy=");
		sb.append(csJafy);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Project toEntityModel() {
		ProjectImpl projectImpl = new ProjectImpl();

		projectImpl.setProjectId(projectId);
		projectImpl.setGroupId(groupId);
		projectImpl.setCompanyId(companyId);
		projectImpl.setUserId(userId);

		if (userName == null) {
			projectImpl.setUserName(StringPool.BLANK);
		}
		else {
			projectImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			projectImpl.setCreateDate(null);
		}
		else {
			projectImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			projectImpl.setModifiedDate(null);
		}
		else {
			projectImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (bjbh == null) {
			projectImpl.setBjbh(StringPool.BLANK);
		}
		else {
			projectImpl.setBjbh(bjbh);
		}

		if (projNum == null) {
			projectImpl.setProjNum(StringPool.BLANK);
		}
		else {
			projectImpl.setProjNum(projNum);
		}

		projectImpl.setSortNo(sortNo);
		projectImpl.setProjStatus(projStatus);
		projectImpl.setIndustryCategory(industryCategory);
		projectImpl.setManageAttr(manageAttr);
		projectImpl.setIsMajor(isMajor);
		projectImpl.setProjSource(projSource);
		projectImpl.setBelongCounty(belongCounty);
		projectImpl.setProjAttr(projAttr);

		if (startDate == Long.MIN_VALUE) {
			projectImpl.setStartDate(null);
		}
		else {
			projectImpl.setStartDate(new Date(startDate));
		}

		if (endDate == Long.MIN_VALUE) {
			projectImpl.setEndDate(null);
		}
		else {
			projectImpl.setEndDate(new Date(endDate));
		}

		if (projName == null) {
			projectImpl.setProjName(StringPool.BLANK);
		}
		else {
			projectImpl.setProjName(projName);
		}

		if (location == null) {
			projectImpl.setLocation(StringPool.BLANK);
		}
		else {
			projectImpl.setLocation(location);
		}

		if (involveCounty == null) {
			projectImpl.setInvolveCounty(StringPool.BLANK);
		}
		else {
			projectImpl.setInvolveCounty(involveCounty);
		}

		projectImpl.setGhhx(ghhx);
		projectImpl.setRoadLevel(roadLevel);
		projectImpl.setRoadTechLevel(roadTechLevel);

		if (startNode == Long.MIN_VALUE) {
			projectImpl.setStartNode(null);
		}
		else {
			projectImpl.setStartNode(new Date(startNode));
		}

		if (endNode == Long.MIN_VALUE) {
			projectImpl.setEndNode(null);
		}
		else {
			projectImpl.setEndNode(new Date(endNode));
		}

		if (planStartDate == Long.MIN_VALUE) {
			projectImpl.setPlanStartDate(null);
		}
		else {
			projectImpl.setPlanStartDate(new Date(planStartDate));
		}

		if (planEndDate == Long.MIN_VALUE) {
			projectImpl.setPlanEndDate(null);
		}
		else {
			projectImpl.setPlanEndDate(new Date(planEndDate));
		}

		if (introduction == null) {
			projectImpl.setIntroduction(StringPool.BLANK);
		}
		else {
			projectImpl.setIntroduction(introduction);
		}

		projectImpl.setPlanTotle(planTotle);
		projectImpl.setGkpfTotle(gkpfTotle);
		projectImpl.setGkpfPre(gkpfPre);
		projectImpl.setGkpfJafy(gkpfJafy);
		projectImpl.setCsTotle(csTotle);
		projectImpl.setCsPre(csPre);
		projectImpl.setCsJafy(csJafy);

		projectImpl.resetOriginalValues();

		return projectImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		projectId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		bjbh = objectInput.readUTF();
		projNum = objectInput.readUTF();
		sortNo = objectInput.readInt();
		projStatus = objectInput.readLong();
		industryCategory = objectInput.readLong();
		manageAttr = objectInput.readLong();
		isMajor = objectInput.readBoolean();
		projSource = objectInput.readLong();
		belongCounty = objectInput.readLong();
		projAttr = objectInput.readLong();
		startDate = objectInput.readLong();
		endDate = objectInput.readLong();
		projName = objectInput.readUTF();
		location = objectInput.readUTF();
		involveCounty = objectInput.readUTF();
		ghhx = objectInput.readDouble();
		roadLevel = objectInput.readLong();
		roadTechLevel = objectInput.readLong();
		startNode = objectInput.readLong();
		endNode = objectInput.readLong();
		planStartDate = objectInput.readLong();
		planEndDate = objectInput.readLong();
		introduction = objectInput.readUTF();
		planTotle = objectInput.readDouble();
		gkpfTotle = objectInput.readDouble();
		gkpfPre = objectInput.readDouble();
		gkpfJafy = objectInput.readDouble();
		csTotle = objectInput.readDouble();
		csPre = objectInput.readDouble();
		csJafy = objectInput.readDouble();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(projectId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (bjbh == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(bjbh);
		}

		if (projNum == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(projNum);
		}

		objectOutput.writeInt(sortNo);
		objectOutput.writeLong(projStatus);
		objectOutput.writeLong(industryCategory);
		objectOutput.writeLong(manageAttr);
		objectOutput.writeBoolean(isMajor);
		objectOutput.writeLong(projSource);
		objectOutput.writeLong(belongCounty);
		objectOutput.writeLong(projAttr);
		objectOutput.writeLong(startDate);
		objectOutput.writeLong(endDate);

		if (projName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(projName);
		}

		if (location == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(location);
		}

		if (involveCounty == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(involveCounty);
		}

		objectOutput.writeDouble(ghhx);
		objectOutput.writeLong(roadLevel);
		objectOutput.writeLong(roadTechLevel);
		objectOutput.writeLong(startNode);
		objectOutput.writeLong(endNode);
		objectOutput.writeLong(planStartDate);
		objectOutput.writeLong(planEndDate);

		if (introduction == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(introduction);
		}

		objectOutput.writeDouble(planTotle);
		objectOutput.writeDouble(gkpfTotle);
		objectOutput.writeDouble(gkpfPre);
		objectOutput.writeDouble(gkpfJafy);
		objectOutput.writeDouble(csTotle);
		objectOutput.writeDouble(csPre);
		objectOutput.writeDouble(csJafy);
	}

	public long projectId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String bjbh;
	public String projNum;
	public int sortNo;
	public long projStatus;
	public long industryCategory;
	public long manageAttr;
	public boolean isMajor;
	public long projSource;
	public long belongCounty;
	public long projAttr;
	public long startDate;
	public long endDate;
	public String projName;
	public String location;
	public String involveCounty;
	public double ghhx;
	public long roadLevel;
	public long roadTechLevel;
	public long startNode;
	public long endNode;
	public long planStartDate;
	public long planEndDate;
	public String introduction;
	public double planTotle;
	public double gkpfTotle;
	public double gkpfPre;
	public double gkpfJafy;
	public double csTotle;
	public double csPre;
	public double csJafy;
}