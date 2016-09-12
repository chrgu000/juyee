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

package com.justonetech.cp.complete.model.impl;

import com.justonetech.cp.complete.model.Complete;
import com.justonetech.cp.complete.model.CompleteModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Complete service. Represents a row in the &quot;cp_Complete&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.justonetech.cp.complete.model.CompleteModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CompleteImpl}.
 * </p>
 *
 * @author fanqi
 * @see CompleteImpl
 * @see com.justonetech.cp.complete.model.Complete
 * @see com.justonetech.cp.complete.model.CompleteModel
 * @generated
 */
public class CompleteModelImpl extends BaseModelImpl<Complete>
	implements CompleteModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a complete model instance should use the {@link com.justonetech.cp.complete.model.Complete} interface instead.
	 */
	public static final String TABLE_NAME = "cp_Complete";
	public static final Object[][] TABLE_COLUMNS = {
			{ "completeId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "zzjgdm", Types.VARCHAR },
			{ "bjbh", Types.VARCHAR },
			{ "sqbz", Types.INTEGER },
			{ "sqzt", Types.INTEGER },
			{ "babh", Types.VARCHAR },
			{ "wssqbh", Types.VARCHAR },
			{ "sbrq", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table cp_Complete (completeId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,zzjgdm VARCHAR(75) null,bjbh VARCHAR(75) null,sqbz INTEGER,sqzt INTEGER,babh VARCHAR(75) null,wssqbh VARCHAR(75) null,sbrq DATE null)";
	public static final String TABLE_SQL_DROP = "drop table cp_Complete";
	public static final String ORDER_BY_JPQL = " ORDER BY complete.completeId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY cp_Complete.completeId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.justonetech.cp.complete.model.Complete"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.justonetech.cp.complete.model.Complete"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.justonetech.cp.complete.model.Complete"),
			true);
	public static long ZZJGDM_COLUMN_BITMASK = 1L;
	public static long COMPLETEID_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.justonetech.cp.complete.model.Complete"));

	public CompleteModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _completeId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCompleteId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _completeId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Complete.class;
	}

	@Override
	public String getModelClassName() {
		return Complete.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("completeId", getCompleteId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("zzjgdm", getZzjgdm());
		attributes.put("bjbh", getBjbh());
		attributes.put("sqbz", getSqbz());
		attributes.put("sqzt", getSqzt());
		attributes.put("babh", getBabh());
		attributes.put("wssqbh", getWssqbh());
		attributes.put("sbrq", getSbrq());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long completeId = (Long)attributes.get("completeId");

		if (completeId != null) {
			setCompleteId(completeId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String zzjgdm = (String)attributes.get("zzjgdm");

		if (zzjgdm != null) {
			setZzjgdm(zzjgdm);
		}

		String bjbh = (String)attributes.get("bjbh");

		if (bjbh != null) {
			setBjbh(bjbh);
		}

		Integer sqbz = (Integer)attributes.get("sqbz");

		if (sqbz != null) {
			setSqbz(sqbz);
		}

		Integer sqzt = (Integer)attributes.get("sqzt");

		if (sqzt != null) {
			setSqzt(sqzt);
		}

		String babh = (String)attributes.get("babh");

		if (babh != null) {
			setBabh(babh);
		}

		String wssqbh = (String)attributes.get("wssqbh");

		if (wssqbh != null) {
			setWssqbh(wssqbh);
		}

		Date sbrq = (Date)attributes.get("sbrq");

		if (sbrq != null) {
			setSbrq(sbrq);
		}
	}

	@Override
	public long getCompleteId() {
		return _completeId;
	}

	@Override
	public void setCompleteId(long completeId) {
		_completeId = completeId;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
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
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@Override
	public String getZzjgdm() {
		if (_zzjgdm == null) {
			return StringPool.BLANK;
		}
		else {
			return _zzjgdm;
		}
	}

	@Override
	public void setZzjgdm(String zzjgdm) {
		_columnBitmask |= ZZJGDM_COLUMN_BITMASK;

		if (_originalZzjgdm == null) {
			_originalZzjgdm = _zzjgdm;
		}

		_zzjgdm = zzjgdm;
	}

	public String getOriginalZzjgdm() {
		return GetterUtil.getString(_originalZzjgdm);
	}

	@Override
	public String getBjbh() {
		if (_bjbh == null) {
			return StringPool.BLANK;
		}
		else {
			return _bjbh;
		}
	}

	@Override
	public void setBjbh(String bjbh) {
		_bjbh = bjbh;
	}

	@Override
	public int getSqbz() {
		return _sqbz;
	}

	@Override
	public void setSqbz(int sqbz) {
		_sqbz = sqbz;
	}

	@Override
	public int getSqzt() {
		return _sqzt;
	}

	@Override
	public void setSqzt(int sqzt) {
		_sqzt = sqzt;
	}

	@Override
	public String getBabh() {
		if (_babh == null) {
			return StringPool.BLANK;
		}
		else {
			return _babh;
		}
	}

	@Override
	public void setBabh(String babh) {
		_babh = babh;
	}

	@Override
	public String getWssqbh() {
		if (_wssqbh == null) {
			return StringPool.BLANK;
		}
		else {
			return _wssqbh;
		}
	}

	@Override
	public void setWssqbh(String wssqbh) {
		_wssqbh = wssqbh;
	}

	@Override
	public Date getSbrq() {
		return _sbrq;
	}

	@Override
	public void setSbrq(Date sbrq) {
		_sbrq = sbrq;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			Complete.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Complete toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Complete)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		CompleteImpl completeImpl = new CompleteImpl();

		completeImpl.setCompleteId(getCompleteId());
		completeImpl.setGroupId(getGroupId());
		completeImpl.setCompanyId(getCompanyId());
		completeImpl.setUserId(getUserId());
		completeImpl.setUserName(getUserName());
		completeImpl.setCreateDate(getCreateDate());
		completeImpl.setModifiedDate(getModifiedDate());
		completeImpl.setZzjgdm(getZzjgdm());
		completeImpl.setBjbh(getBjbh());
		completeImpl.setSqbz(getSqbz());
		completeImpl.setSqzt(getSqzt());
		completeImpl.setBabh(getBabh());
		completeImpl.setWssqbh(getWssqbh());
		completeImpl.setSbrq(getSbrq());

		completeImpl.resetOriginalValues();

		return completeImpl;
	}

	@Override
	public int compareTo(Complete complete) {
		long primaryKey = complete.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Complete)) {
			return false;
		}

		Complete complete = (Complete)obj;

		long primaryKey = complete.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		CompleteModelImpl completeModelImpl = this;

		completeModelImpl._originalZzjgdm = completeModelImpl._zzjgdm;

		completeModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Complete> toCacheModel() {
		CompleteCacheModel completeCacheModel = new CompleteCacheModel();

		completeCacheModel.completeId = getCompleteId();

		completeCacheModel.groupId = getGroupId();

		completeCacheModel.companyId = getCompanyId();

		completeCacheModel.userId = getUserId();

		completeCacheModel.userName = getUserName();

		String userName = completeCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			completeCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			completeCacheModel.createDate = createDate.getTime();
		}
		else {
			completeCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			completeCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			completeCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		completeCacheModel.zzjgdm = getZzjgdm();

		String zzjgdm = completeCacheModel.zzjgdm;

		if ((zzjgdm != null) && (zzjgdm.length() == 0)) {
			completeCacheModel.zzjgdm = null;
		}

		completeCacheModel.bjbh = getBjbh();

		String bjbh = completeCacheModel.bjbh;

		if ((bjbh != null) && (bjbh.length() == 0)) {
			completeCacheModel.bjbh = null;
		}

		completeCacheModel.sqbz = getSqbz();

		completeCacheModel.sqzt = getSqzt();

		completeCacheModel.babh = getBabh();

		String babh = completeCacheModel.babh;

		if ((babh != null) && (babh.length() == 0)) {
			completeCacheModel.babh = null;
		}

		completeCacheModel.wssqbh = getWssqbh();

		String wssqbh = completeCacheModel.wssqbh;

		if ((wssqbh != null) && (wssqbh.length() == 0)) {
			completeCacheModel.wssqbh = null;
		}

		Date sbrq = getSbrq();

		if (sbrq != null) {
			completeCacheModel.sbrq = sbrq.getTime();
		}
		else {
			completeCacheModel.sbrq = Long.MIN_VALUE;
		}

		return completeCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{completeId=");
		sb.append(getCompleteId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", zzjgdm=");
		sb.append(getZzjgdm());
		sb.append(", bjbh=");
		sb.append(getBjbh());
		sb.append(", sqbz=");
		sb.append(getSqbz());
		sb.append(", sqzt=");
		sb.append(getSqzt());
		sb.append(", babh=");
		sb.append(getBabh());
		sb.append(", wssqbh=");
		sb.append(getWssqbh());
		sb.append(", sbrq=");
		sb.append(getSbrq());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append("com.justonetech.cp.complete.model.Complete");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>completeId</column-name><column-value><![CDATA[");
		sb.append(getCompleteId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>zzjgdm</column-name><column-value><![CDATA[");
		sb.append(getZzjgdm());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>bjbh</column-name><column-value><![CDATA[");
		sb.append(getBjbh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sqbz</column-name><column-value><![CDATA[");
		sb.append(getSqbz());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sqzt</column-name><column-value><![CDATA[");
		sb.append(getSqzt());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>babh</column-name><column-value><![CDATA[");
		sb.append(getBabh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>wssqbh</column-name><column-value><![CDATA[");
		sb.append(getWssqbh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sbrq</column-name><column-value><![CDATA[");
		sb.append(getSbrq());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Complete.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Complete.class
		};
	private long _completeId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _zzjgdm;
	private String _originalZzjgdm;
	private String _bjbh;
	private int _sqbz;
	private int _sqzt;
	private String _babh;
	private String _wssqbh;
	private Date _sbrq;
	private long _columnBitmask;
	private Complete _escapedModel;
}