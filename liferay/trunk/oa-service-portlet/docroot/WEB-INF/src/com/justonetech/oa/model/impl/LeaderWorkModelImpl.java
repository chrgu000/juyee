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

package com.justonetech.oa.model.impl;

import com.justonetech.oa.model.LeaderWork;
import com.justonetech.oa.model.LeaderWorkModel;
import com.justonetech.oa.service.persistence.LeaderWorkPK;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the LeaderWork service. Represents a row in the &quot;oa_LeaderWork&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.justonetech.oa.model.LeaderWorkModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LeaderWorkImpl}.
 * </p>
 *
 * @author justonetech
 * @see LeaderWorkImpl
 * @see com.justonetech.oa.model.LeaderWork
 * @see com.justonetech.oa.model.LeaderWorkModel
 * @generated
 */
public class LeaderWorkModelImpl extends BaseModelImpl<LeaderWork>
	implements LeaderWorkModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a leader work model instance should use the {@link com.justonetech.oa.model.LeaderWork} interface instead.
	 */
	public static final String TABLE_NAME = "oa_LeaderWork";
	public static final Object[][] TABLE_COLUMNS = {
			{ "userId", Types.BIGINT },
			{ "workDate", Types.BIGINT },
			{ "amOrPm", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createTime", Types.TIMESTAMP },
			{ "modifiedTime", Types.TIMESTAMP },
			{ "content", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table oa_LeaderWork (userId LONG not null,workDate LONG not null,amOrPm LONG not null,userName VARCHAR(75) null,createTime DATE null,modifiedTime DATE null,content VARCHAR(1000) null,primary key (userId, workDate, amOrPm))";
	public static final String TABLE_SQL_DROP = "drop table oa_LeaderWork";
	public static final String ORDER_BY_JPQL = " ORDER BY leaderWork.id.userId ASC, leaderWork.id.workDate ASC, leaderWork.id.amOrPm ASC";
	public static final String ORDER_BY_SQL = " ORDER BY oa_LeaderWork.userId ASC, oa_LeaderWork.workDate ASC, oa_LeaderWork.amOrPm ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.justonetech.oa.model.LeaderWork"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.justonetech.oa.model.LeaderWork"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.justonetech.oa.model.LeaderWork"));

	public LeaderWorkModelImpl() {
	}

	@Override
	public LeaderWorkPK getPrimaryKey() {
		return new LeaderWorkPK(_userId, _workDate, _amOrPm);
	}

	@Override
	public void setPrimaryKey(LeaderWorkPK primaryKey) {
		setUserId(primaryKey.userId);
		setWorkDate(primaryKey.workDate);
		setAmOrPm(primaryKey.amOrPm);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new LeaderWorkPK(_userId, _workDate, _amOrPm);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((LeaderWorkPK)primaryKeyObj);
	}

	@Override
	public Class<?> getModelClass() {
		return LeaderWork.class;
	}

	@Override
	public String getModelClassName() {
		return LeaderWork.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("userId", getUserId());
		attributes.put("workDate", getWorkDate());
		attributes.put("amOrPm", getAmOrPm());
		attributes.put("userName", getUserName());
		attributes.put("createTime", getCreateTime());
		attributes.put("modifiedTime", getModifiedTime());
		attributes.put("content", getContent());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long workDate = (Long)attributes.get("workDate");

		if (workDate != null) {
			setWorkDate(workDate);
		}

		Long amOrPm = (Long)attributes.get("amOrPm");

		if (amOrPm != null) {
			setAmOrPm(amOrPm);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createTime = (Date)attributes.get("createTime");

		if (createTime != null) {
			setCreateTime(createTime);
		}

		Date modifiedTime = (Date)attributes.get("modifiedTime");

		if (modifiedTime != null) {
			setModifiedTime(modifiedTime);
		}

		String content = (String)attributes.get("content");

		if (content != null) {
			setContent(content);
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public long getWorkDate() {
		return _workDate;
	}

	@Override
	public void setWorkDate(long workDate) {
		_workDate = workDate;
	}

	@Override
	public long getAmOrPm() {
		return _amOrPm;
	}

	@Override
	public void setAmOrPm(long amOrPm) {
		_amOrPm = amOrPm;
	}

	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@Override
	public Date getCreateTime() {
		return _createTime;
	}

	@Override
	public void setCreateTime(Date createTime) {
		_createTime = createTime;
	}

	@Override
	public Date getModifiedTime() {
		return _modifiedTime;
	}

	@Override
	public void setModifiedTime(Date modifiedTime) {
		_modifiedTime = modifiedTime;
	}

	@Override
	public String getContent() {
		if (_content == null) {
			return StringPool.BLANK;
		}
		else {
			return _content;
		}
	}

	@Override
	public void setContent(String content) {
		_content = content;
	}

	@Override
	public LeaderWork toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (LeaderWork)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		LeaderWorkImpl leaderWorkImpl = new LeaderWorkImpl();

		leaderWorkImpl.setUserId(getUserId());
		leaderWorkImpl.setWorkDate(getWorkDate());
		leaderWorkImpl.setAmOrPm(getAmOrPm());
		leaderWorkImpl.setUserName(getUserName());
		leaderWorkImpl.setCreateTime(getCreateTime());
		leaderWorkImpl.setModifiedTime(getModifiedTime());
		leaderWorkImpl.setContent(getContent());

		leaderWorkImpl.resetOriginalValues();

		return leaderWorkImpl;
	}

	@Override
	public int compareTo(LeaderWork leaderWork) {
		LeaderWorkPK primaryKey = leaderWork.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LeaderWork)) {
			return false;
		}

		LeaderWork leaderWork = (LeaderWork)obj;

		LeaderWorkPK primaryKey = leaderWork.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<LeaderWork> toCacheModel() {
		LeaderWorkCacheModel leaderWorkCacheModel = new LeaderWorkCacheModel();

		leaderWorkCacheModel.userId = getUserId();

		leaderWorkCacheModel.workDate = getWorkDate();

		leaderWorkCacheModel.amOrPm = getAmOrPm();

		leaderWorkCacheModel.userName = getUserName();

		String userName = leaderWorkCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			leaderWorkCacheModel.userName = null;
		}

		Date createTime = getCreateTime();

		if (createTime != null) {
			leaderWorkCacheModel.createTime = createTime.getTime();
		}
		else {
			leaderWorkCacheModel.createTime = Long.MIN_VALUE;
		}

		Date modifiedTime = getModifiedTime();

		if (modifiedTime != null) {
			leaderWorkCacheModel.modifiedTime = modifiedTime.getTime();
		}
		else {
			leaderWorkCacheModel.modifiedTime = Long.MIN_VALUE;
		}

		leaderWorkCacheModel.content = getContent();

		String content = leaderWorkCacheModel.content;

		if ((content != null) && (content.length() == 0)) {
			leaderWorkCacheModel.content = null;
		}

		return leaderWorkCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{userId=");
		sb.append(getUserId());
		sb.append(", workDate=");
		sb.append(getWorkDate());
		sb.append(", amOrPm=");
		sb.append(getAmOrPm());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createTime=");
		sb.append(getCreateTime());
		sb.append(", modifiedTime=");
		sb.append(getModifiedTime());
		sb.append(", content=");
		sb.append(getContent());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.justonetech.oa.model.LeaderWork");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>workDate</column-name><column-value><![CDATA[");
		sb.append(getWorkDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>amOrPm</column-name><column-value><![CDATA[");
		sb.append(getAmOrPm());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createTime</column-name><column-value><![CDATA[");
		sb.append(getCreateTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedTime</column-name><column-value><![CDATA[");
		sb.append(getModifiedTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>content</column-name><column-value><![CDATA[");
		sb.append(getContent());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = LeaderWork.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			LeaderWork.class
		};
	private long _userId;
	private String _userUuid;
	private long _workDate;
	private long _amOrPm;
	private String _userName;
	private Date _createTime;
	private Date _modifiedTime;
	private String _content;
	private LeaderWork _escapedModel;
}