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

package com.justonetech.cyzt.leo.model.impl;

import com.justonetech.cyzt.leo.model.LEOCertificate;
import com.justonetech.cyzt.leo.model.LEOCertificateModel;

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
 * The base model implementation for the LEOCertificate service. Represents a row in the &quot;cyzt_LEOCertificate&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.justonetech.cyzt.leo.model.LEOCertificateModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LEOCertificateImpl}.
 * </p>
 *
 * @author fanqi
 * @see LEOCertificateImpl
 * @see com.justonetech.cyzt.leo.model.LEOCertificate
 * @see com.justonetech.cyzt.leo.model.LEOCertificateModel
 * @generated
 */
public class LEOCertificateModelImpl extends BaseModelImpl<LEOCertificate>
	implements LEOCertificateModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a l e o certificate model instance should use the {@link com.justonetech.cyzt.leo.model.LEOCertificate} interface instead.
	 */
	public static final String TABLE_NAME = "cyzt_LEOCertificate";
	public static final Object[][] TABLE_COLUMNS = {
			{ "certificateId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "xm", Types.VARCHAR },
			{ "zjbh", Types.VARCHAR },
			{ "zylx", Types.VARCHAR },
			{ "yxq", Types.TIMESTAMP },
			{ "fzrq", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table cyzt_LEOCertificate (certificateId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,xm VARCHAR(75) null,zjbh VARCHAR(75) null,zylx VARCHAR(75) null,yxq DATE null,fzrq DATE null)";
	public static final String TABLE_SQL_DROP = "drop table cyzt_LEOCertificate";
	public static final String ORDER_BY_JPQL = " ORDER BY leoCertificate.certificateId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY cyzt_LEOCertificate.certificateId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.justonetech.cyzt.leo.model.LEOCertificate"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.justonetech.cyzt.leo.model.LEOCertificate"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.justonetech.cyzt.leo.model.LEOCertificate"));

	public LEOCertificateModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _certificateId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCertificateId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _certificateId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return LEOCertificate.class;
	}

	@Override
	public String getModelClassName() {
		return LEOCertificate.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("certificateId", getCertificateId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("xm", getXm());
		attributes.put("zjbh", getZjbh());
		attributes.put("zylx", getZylx());
		attributes.put("yxq", getYxq());
		attributes.put("fzrq", getFzrq());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long certificateId = (Long)attributes.get("certificateId");

		if (certificateId != null) {
			setCertificateId(certificateId);
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

		String xm = (String)attributes.get("xm");

		if (xm != null) {
			setXm(xm);
		}

		String zjbh = (String)attributes.get("zjbh");

		if (zjbh != null) {
			setZjbh(zjbh);
		}

		String zylx = (String)attributes.get("zylx");

		if (zylx != null) {
			setZylx(zylx);
		}

		Date yxq = (Date)attributes.get("yxq");

		if (yxq != null) {
			setYxq(yxq);
		}

		Date fzrq = (Date)attributes.get("fzrq");

		if (fzrq != null) {
			setFzrq(fzrq);
		}
	}

	@Override
	public long getCertificateId() {
		return _certificateId;
	}

	@Override
	public void setCertificateId(long certificateId) {
		_certificateId = certificateId;
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
	public String getXm() {
		if (_xm == null) {
			return StringPool.BLANK;
		}
		else {
			return _xm;
		}
	}

	@Override
	public void setXm(String xm) {
		_xm = xm;
	}

	@Override
	public String getZjbh() {
		if (_zjbh == null) {
			return StringPool.BLANK;
		}
		else {
			return _zjbh;
		}
	}

	@Override
	public void setZjbh(String zjbh) {
		_zjbh = zjbh;
	}

	@Override
	public String getZylx() {
		if (_zylx == null) {
			return StringPool.BLANK;
		}
		else {
			return _zylx;
		}
	}

	@Override
	public void setZylx(String zylx) {
		_zylx = zylx;
	}

	@Override
	public Date getYxq() {
		return _yxq;
	}

	@Override
	public void setYxq(Date yxq) {
		_yxq = yxq;
	}

	@Override
	public Date getFzrq() {
		return _fzrq;
	}

	@Override
	public void setFzrq(Date fzrq) {
		_fzrq = fzrq;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			LEOCertificate.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public LEOCertificate toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (LEOCertificate)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		LEOCertificateImpl leoCertificateImpl = new LEOCertificateImpl();

		leoCertificateImpl.setCertificateId(getCertificateId());
		leoCertificateImpl.setGroupId(getGroupId());
		leoCertificateImpl.setCompanyId(getCompanyId());
		leoCertificateImpl.setUserId(getUserId());
		leoCertificateImpl.setUserName(getUserName());
		leoCertificateImpl.setCreateDate(getCreateDate());
		leoCertificateImpl.setModifiedDate(getModifiedDate());
		leoCertificateImpl.setXm(getXm());
		leoCertificateImpl.setZjbh(getZjbh());
		leoCertificateImpl.setZylx(getZylx());
		leoCertificateImpl.setYxq(getYxq());
		leoCertificateImpl.setFzrq(getFzrq());

		leoCertificateImpl.resetOriginalValues();

		return leoCertificateImpl;
	}

	@Override
	public int compareTo(LEOCertificate leoCertificate) {
		long primaryKey = leoCertificate.getPrimaryKey();

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

		if (!(obj instanceof LEOCertificate)) {
			return false;
		}

		LEOCertificate leoCertificate = (LEOCertificate)obj;

		long primaryKey = leoCertificate.getPrimaryKey();

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
	}

	@Override
	public CacheModel<LEOCertificate> toCacheModel() {
		LEOCertificateCacheModel leoCertificateCacheModel = new LEOCertificateCacheModel();

		leoCertificateCacheModel.certificateId = getCertificateId();

		leoCertificateCacheModel.groupId = getGroupId();

		leoCertificateCacheModel.companyId = getCompanyId();

		leoCertificateCacheModel.userId = getUserId();

		leoCertificateCacheModel.userName = getUserName();

		String userName = leoCertificateCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			leoCertificateCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			leoCertificateCacheModel.createDate = createDate.getTime();
		}
		else {
			leoCertificateCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			leoCertificateCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			leoCertificateCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		leoCertificateCacheModel.xm = getXm();

		String xm = leoCertificateCacheModel.xm;

		if ((xm != null) && (xm.length() == 0)) {
			leoCertificateCacheModel.xm = null;
		}

		leoCertificateCacheModel.zjbh = getZjbh();

		String zjbh = leoCertificateCacheModel.zjbh;

		if ((zjbh != null) && (zjbh.length() == 0)) {
			leoCertificateCacheModel.zjbh = null;
		}

		leoCertificateCacheModel.zylx = getZylx();

		String zylx = leoCertificateCacheModel.zylx;

		if ((zylx != null) && (zylx.length() == 0)) {
			leoCertificateCacheModel.zylx = null;
		}

		Date yxq = getYxq();

		if (yxq != null) {
			leoCertificateCacheModel.yxq = yxq.getTime();
		}
		else {
			leoCertificateCacheModel.yxq = Long.MIN_VALUE;
		}

		Date fzrq = getFzrq();

		if (fzrq != null) {
			leoCertificateCacheModel.fzrq = fzrq.getTime();
		}
		else {
			leoCertificateCacheModel.fzrq = Long.MIN_VALUE;
		}

		return leoCertificateCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{certificateId=");
		sb.append(getCertificateId());
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
		sb.append(", xm=");
		sb.append(getXm());
		sb.append(", zjbh=");
		sb.append(getZjbh());
		sb.append(", zylx=");
		sb.append(getZylx());
		sb.append(", yxq=");
		sb.append(getYxq());
		sb.append(", fzrq=");
		sb.append(getFzrq());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("com.justonetech.cyzt.leo.model.LEOCertificate");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>certificateId</column-name><column-value><![CDATA[");
		sb.append(getCertificateId());
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
			"<column><column-name>xm</column-name><column-value><![CDATA[");
		sb.append(getXm());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>zjbh</column-name><column-value><![CDATA[");
		sb.append(getZjbh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>zylx</column-name><column-value><![CDATA[");
		sb.append(getZylx());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>yxq</column-name><column-value><![CDATA[");
		sb.append(getYxq());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fzrq</column-name><column-value><![CDATA[");
		sb.append(getFzrq());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = LEOCertificate.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			LEOCertificate.class
		};
	private long _certificateId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _xm;
	private String _zjbh;
	private String _zylx;
	private Date _yxq;
	private Date _fzrq;
	private LEOCertificate _escapedModel;
}