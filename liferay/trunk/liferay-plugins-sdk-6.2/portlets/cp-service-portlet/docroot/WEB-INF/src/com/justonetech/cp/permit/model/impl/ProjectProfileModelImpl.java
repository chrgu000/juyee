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

import com.justonetech.cp.permit.model.ProjectProfile;
import com.justonetech.cp.permit.model.ProjectProfileModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the ProjectProfile service. Represents a row in the &quot;cp_ProjectProfile&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.justonetech.cp.permit.model.ProjectProfileModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ProjectProfileImpl}.
 * </p>
 *
 * @author fanqi
 * @see ProjectProfileImpl
 * @see com.justonetech.cp.permit.model.ProjectProfile
 * @see com.justonetech.cp.permit.model.ProjectProfileModel
 * @generated
 */
public class ProjectProfileModelImpl extends BaseModelImpl<ProjectProfile>
	implements ProjectProfileModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a project profile model instance should use the {@link com.justonetech.cp.permit.model.ProjectProfile} interface instead.
	 */
	public static final String TABLE_NAME = "cp_ProjectProfile";
	public static final Object[][] TABLE_COLUMNS = {
			{ "permitId", Types.BIGINT },
			{ "bjbh", Types.VARCHAR },
			{ "jsdwmc", Types.VARCHAR },
			{ "jsdwxz", Types.VARCHAR },
			{ "jsdwdz", Types.VARCHAR },
			{ "gcmc", Types.VARCHAR },
			{ "jsdd", Types.VARCHAR },
			{ "jsgcgm", Types.VARCHAR },
			{ "fwjzmj", Types.VARCHAR },
			{ "htjg", Types.VARCHAR },
			{ "htgq", Types.INTEGER },
			{ "fddbr", Types.VARCHAR },
			{ "jsdwlxdh", Types.VARCHAR },
			{ "jsdwlxr", Types.VARCHAR },
			{ "jsdwsjh", Types.VARCHAR },
			{ "jsydpzwjhfdccqzbh", Types.VARCHAR },
			{ "jsgcghxkzbh", Types.VARCHAR },
			{ "xckgqk", Types.VARCHAR },
			{ "xmlx", Types.BIGINT },
			{ "lxjb", Types.VARCHAR },
			{ "xmxz", Types.BIGINT },
			{ "ssqx", Types.VARCHAR },
			{ "ywbm", Types.VARCHAR },
			{ "jsddssqx", Types.BIGINT },
			{ "jsgclb", Types.VARCHAR },
			{ "jsgcsx", Types.BIGINT },
			{ "gyzjbz", Types.VARCHAR },
			{ "zbjg", Types.VARCHAR },
			{ "xmtzgs", Types.VARCHAR },
			{ "jhkg", Types.TIMESTAMP },
			{ "jhjg", Types.TIMESTAMP },
			{ "sfzftzl", Types.BOOLEAN },
			{ "yzzpl1", Types.VARCHAR },
			{ "yzzpl2", Types.VARCHAR },
			{ "yzzpl3", Types.VARCHAR },
			{ "yzzpl4", Types.VARCHAR },
			{ "tjsj", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table cp_ProjectProfile (permitId LONG not null primary key,bjbh VARCHAR(75) null,jsdwmc VARCHAR(300) null,jsdwxz VARCHAR(75) null,jsdwdz VARCHAR(300) null,gcmc VARCHAR(300) null,jsdd VARCHAR(300) null,jsgcgm VARCHAR(500) null,fwjzmj VARCHAR(75) null,htjg VARCHAR(75) null,htgq INTEGER,fddbr VARCHAR(75) null,jsdwlxdh VARCHAR(75) null,jsdwlxr VARCHAR(75) null,jsdwsjh VARCHAR(75) null,jsydpzwjhfdccqzbh VARCHAR(75) null,jsgcghxkzbh VARCHAR(75) null,xckgqk VARCHAR(75) null,xmlx LONG,lxjb VARCHAR(75) null,xmxz LONG,ssqx VARCHAR(75) null,ywbm VARCHAR(75) null,jsddssqx LONG,jsgclb VARCHAR(75) null,jsgcsx LONG,gyzjbz VARCHAR(75) null,zbjg VARCHAR(75) null,xmtzgs VARCHAR(75) null,jhkg DATE null,jhjg DATE null,sfzftzl BOOLEAN,yzzpl1 VARCHAR(75) null,yzzpl2 VARCHAR(75) null,yzzpl3 VARCHAR(75) null,yzzpl4 VARCHAR(75) null,tjsj DATE null)";
	public static final String TABLE_SQL_DROP = "drop table cp_ProjectProfile";
	public static final String ORDER_BY_JPQL = " ORDER BY projectProfile.permitId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY cp_ProjectProfile.permitId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.justonetech.cp.permit.model.ProjectProfile"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.justonetech.cp.permit.model.ProjectProfile"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.justonetech.cp.permit.model.ProjectProfile"));

	public ProjectProfileModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _permitId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setPermitId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _permitId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return ProjectProfile.class;
	}

	@Override
	public String getModelClassName() {
		return ProjectProfile.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("permitId", getPermitId());
		attributes.put("bjbh", getBjbh());
		attributes.put("jsdwmc", getJsdwmc());
		attributes.put("jsdwxz", getJsdwxz());
		attributes.put("jsdwdz", getJsdwdz());
		attributes.put("gcmc", getGcmc());
		attributes.put("jsdd", getJsdd());
		attributes.put("jsgcgm", getJsgcgm());
		attributes.put("fwjzmj", getFwjzmj());
		attributes.put("htjg", getHtjg());
		attributes.put("htgq", getHtgq());
		attributes.put("fddbr", getFddbr());
		attributes.put("jsdwlxdh", getJsdwlxdh());
		attributes.put("jsdwlxr", getJsdwlxr());
		attributes.put("jsdwsjh", getJsdwsjh());
		attributes.put("jsydpzwjhfdccqzbh", getJsydpzwjhfdccqzbh());
		attributes.put("jsgcghxkzbh", getJsgcghxkzbh());
		attributes.put("xckgqk", getXckgqk());
		attributes.put("xmlx", getXmlx());
		attributes.put("lxjb", getLxjb());
		attributes.put("xmxz", getXmxz());
		attributes.put("ssqx", getSsqx());
		attributes.put("ywbm", getYwbm());
		attributes.put("jsddssqx", getJsddssqx());
		attributes.put("jsgclb", getJsgclb());
		attributes.put("jsgcsx", getJsgcsx());
		attributes.put("gyzjbz", getGyzjbz());
		attributes.put("zbjg", getZbjg());
		attributes.put("xmtzgs", getXmtzgs());
		attributes.put("jhkg", getJhkg());
		attributes.put("jhjg", getJhjg());
		attributes.put("sfzftzl", getSfzftzl());
		attributes.put("yzzpl1", getYzzpl1());
		attributes.put("yzzpl2", getYzzpl2());
		attributes.put("yzzpl3", getYzzpl3());
		attributes.put("yzzpl4", getYzzpl4());
		attributes.put("tjsj", getTjsj());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long permitId = (Long)attributes.get("permitId");

		if (permitId != null) {
			setPermitId(permitId);
		}

		String bjbh = (String)attributes.get("bjbh");

		if (bjbh != null) {
			setBjbh(bjbh);
		}

		String jsdwmc = (String)attributes.get("jsdwmc");

		if (jsdwmc != null) {
			setJsdwmc(jsdwmc);
		}

		String jsdwxz = (String)attributes.get("jsdwxz");

		if (jsdwxz != null) {
			setJsdwxz(jsdwxz);
		}

		String jsdwdz = (String)attributes.get("jsdwdz");

		if (jsdwdz != null) {
			setJsdwdz(jsdwdz);
		}

		String gcmc = (String)attributes.get("gcmc");

		if (gcmc != null) {
			setGcmc(gcmc);
		}

		String jsdd = (String)attributes.get("jsdd");

		if (jsdd != null) {
			setJsdd(jsdd);
		}

		String jsgcgm = (String)attributes.get("jsgcgm");

		if (jsgcgm != null) {
			setJsgcgm(jsgcgm);
		}

		String fwjzmj = (String)attributes.get("fwjzmj");

		if (fwjzmj != null) {
			setFwjzmj(fwjzmj);
		}

		String htjg = (String)attributes.get("htjg");

		if (htjg != null) {
			setHtjg(htjg);
		}

		Integer htgq = (Integer)attributes.get("htgq");

		if (htgq != null) {
			setHtgq(htgq);
		}

		String fddbr = (String)attributes.get("fddbr");

		if (fddbr != null) {
			setFddbr(fddbr);
		}

		String jsdwlxdh = (String)attributes.get("jsdwlxdh");

		if (jsdwlxdh != null) {
			setJsdwlxdh(jsdwlxdh);
		}

		String jsdwlxr = (String)attributes.get("jsdwlxr");

		if (jsdwlxr != null) {
			setJsdwlxr(jsdwlxr);
		}

		String jsdwsjh = (String)attributes.get("jsdwsjh");

		if (jsdwsjh != null) {
			setJsdwsjh(jsdwsjh);
		}

		String jsydpzwjhfdccqzbh = (String)attributes.get("jsydpzwjhfdccqzbh");

		if (jsydpzwjhfdccqzbh != null) {
			setJsydpzwjhfdccqzbh(jsydpzwjhfdccqzbh);
		}

		String jsgcghxkzbh = (String)attributes.get("jsgcghxkzbh");

		if (jsgcghxkzbh != null) {
			setJsgcghxkzbh(jsgcghxkzbh);
		}

		String xckgqk = (String)attributes.get("xckgqk");

		if (xckgqk != null) {
			setXckgqk(xckgqk);
		}

		Long xmlx = (Long)attributes.get("xmlx");

		if (xmlx != null) {
			setXmlx(xmlx);
		}

		String lxjb = (String)attributes.get("lxjb");

		if (lxjb != null) {
			setLxjb(lxjb);
		}

		Long xmxz = (Long)attributes.get("xmxz");

		if (xmxz != null) {
			setXmxz(xmxz);
		}

		String ssqx = (String)attributes.get("ssqx");

		if (ssqx != null) {
			setSsqx(ssqx);
		}

		String ywbm = (String)attributes.get("ywbm");

		if (ywbm != null) {
			setYwbm(ywbm);
		}

		Long jsddssqx = (Long)attributes.get("jsddssqx");

		if (jsddssqx != null) {
			setJsddssqx(jsddssqx);
		}

		String jsgclb = (String)attributes.get("jsgclb");

		if (jsgclb != null) {
			setJsgclb(jsgclb);
		}

		Long jsgcsx = (Long)attributes.get("jsgcsx");

		if (jsgcsx != null) {
			setJsgcsx(jsgcsx);
		}

		String gyzjbz = (String)attributes.get("gyzjbz");

		if (gyzjbz != null) {
			setGyzjbz(gyzjbz);
		}

		String zbjg = (String)attributes.get("zbjg");

		if (zbjg != null) {
			setZbjg(zbjg);
		}

		String xmtzgs = (String)attributes.get("xmtzgs");

		if (xmtzgs != null) {
			setXmtzgs(xmtzgs);
		}

		Date jhkg = (Date)attributes.get("jhkg");

		if (jhkg != null) {
			setJhkg(jhkg);
		}

		Date jhjg = (Date)attributes.get("jhjg");

		if (jhjg != null) {
			setJhjg(jhjg);
		}

		Boolean sfzftzl = (Boolean)attributes.get("sfzftzl");

		if (sfzftzl != null) {
			setSfzftzl(sfzftzl);
		}

		String yzzpl1 = (String)attributes.get("yzzpl1");

		if (yzzpl1 != null) {
			setYzzpl1(yzzpl1);
		}

		String yzzpl2 = (String)attributes.get("yzzpl2");

		if (yzzpl2 != null) {
			setYzzpl2(yzzpl2);
		}

		String yzzpl3 = (String)attributes.get("yzzpl3");

		if (yzzpl3 != null) {
			setYzzpl3(yzzpl3);
		}

		String yzzpl4 = (String)attributes.get("yzzpl4");

		if (yzzpl4 != null) {
			setYzzpl4(yzzpl4);
		}

		Date tjsj = (Date)attributes.get("tjsj");

		if (tjsj != null) {
			setTjsj(tjsj);
		}
	}

	@Override
	public long getPermitId() {
		return _permitId;
	}

	@Override
	public void setPermitId(long permitId) {
		_permitId = permitId;
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
	public String getJsdwmc() {
		if (_jsdwmc == null) {
			return StringPool.BLANK;
		}
		else {
			return _jsdwmc;
		}
	}

	@Override
	public void setJsdwmc(String jsdwmc) {
		_jsdwmc = jsdwmc;
	}

	@Override
	public String getJsdwxz() {
		if (_jsdwxz == null) {
			return StringPool.BLANK;
		}
		else {
			return _jsdwxz;
		}
	}

	@Override
	public void setJsdwxz(String jsdwxz) {
		_jsdwxz = jsdwxz;
	}

	@Override
	public String getJsdwdz() {
		if (_jsdwdz == null) {
			return StringPool.BLANK;
		}
		else {
			return _jsdwdz;
		}
	}

	@Override
	public void setJsdwdz(String jsdwdz) {
		_jsdwdz = jsdwdz;
	}

	@Override
	public String getGcmc() {
		if (_gcmc == null) {
			return StringPool.BLANK;
		}
		else {
			return _gcmc;
		}
	}

	@Override
	public void setGcmc(String gcmc) {
		_gcmc = gcmc;
	}

	@Override
	public String getJsdd() {
		if (_jsdd == null) {
			return StringPool.BLANK;
		}
		else {
			return _jsdd;
		}
	}

	@Override
	public void setJsdd(String jsdd) {
		_jsdd = jsdd;
	}

	@Override
	public String getJsgcgm() {
		if (_jsgcgm == null) {
			return StringPool.BLANK;
		}
		else {
			return _jsgcgm;
		}
	}

	@Override
	public void setJsgcgm(String jsgcgm) {
		_jsgcgm = jsgcgm;
	}

	@Override
	public String getFwjzmj() {
		if (_fwjzmj == null) {
			return StringPool.BLANK;
		}
		else {
			return _fwjzmj;
		}
	}

	@Override
	public void setFwjzmj(String fwjzmj) {
		_fwjzmj = fwjzmj;
	}

	@Override
	public String getHtjg() {
		if (_htjg == null) {
			return StringPool.BLANK;
		}
		else {
			return _htjg;
		}
	}

	@Override
	public void setHtjg(String htjg) {
		_htjg = htjg;
	}

	@Override
	public int getHtgq() {
		return _htgq;
	}

	@Override
	public void setHtgq(int htgq) {
		_htgq = htgq;
	}

	@Override
	public String getFddbr() {
		if (_fddbr == null) {
			return StringPool.BLANK;
		}
		else {
			return _fddbr;
		}
	}

	@Override
	public void setFddbr(String fddbr) {
		_fddbr = fddbr;
	}

	@Override
	public String getJsdwlxdh() {
		if (_jsdwlxdh == null) {
			return StringPool.BLANK;
		}
		else {
			return _jsdwlxdh;
		}
	}

	@Override
	public void setJsdwlxdh(String jsdwlxdh) {
		_jsdwlxdh = jsdwlxdh;
	}

	@Override
	public String getJsdwlxr() {
		if (_jsdwlxr == null) {
			return StringPool.BLANK;
		}
		else {
			return _jsdwlxr;
		}
	}

	@Override
	public void setJsdwlxr(String jsdwlxr) {
		_jsdwlxr = jsdwlxr;
	}

	@Override
	public String getJsdwsjh() {
		if (_jsdwsjh == null) {
			return StringPool.BLANK;
		}
		else {
			return _jsdwsjh;
		}
	}

	@Override
	public void setJsdwsjh(String jsdwsjh) {
		_jsdwsjh = jsdwsjh;
	}

	@Override
	public String getJsydpzwjhfdccqzbh() {
		if (_jsydpzwjhfdccqzbh == null) {
			return StringPool.BLANK;
		}
		else {
			return _jsydpzwjhfdccqzbh;
		}
	}

	@Override
	public void setJsydpzwjhfdccqzbh(String jsydpzwjhfdccqzbh) {
		_jsydpzwjhfdccqzbh = jsydpzwjhfdccqzbh;
	}

	@Override
	public String getJsgcghxkzbh() {
		if (_jsgcghxkzbh == null) {
			return StringPool.BLANK;
		}
		else {
			return _jsgcghxkzbh;
		}
	}

	@Override
	public void setJsgcghxkzbh(String jsgcghxkzbh) {
		_jsgcghxkzbh = jsgcghxkzbh;
	}

	@Override
	public String getXckgqk() {
		if (_xckgqk == null) {
			return StringPool.BLANK;
		}
		else {
			return _xckgqk;
		}
	}

	@Override
	public void setXckgqk(String xckgqk) {
		_xckgqk = xckgqk;
	}

	@Override
	public long getXmlx() {
		return _xmlx;
	}

	@Override
	public void setXmlx(long xmlx) {
		_xmlx = xmlx;
	}

	@Override
	public String getLxjb() {
		if (_lxjb == null) {
			return StringPool.BLANK;
		}
		else {
			return _lxjb;
		}
	}

	@Override
	public void setLxjb(String lxjb) {
		_lxjb = lxjb;
	}

	@Override
	public long getXmxz() {
		return _xmxz;
	}

	@Override
	public void setXmxz(long xmxz) {
		_xmxz = xmxz;
	}

	@Override
	public String getSsqx() {
		if (_ssqx == null) {
			return StringPool.BLANK;
		}
		else {
			return _ssqx;
		}
	}

	@Override
	public void setSsqx(String ssqx) {
		_ssqx = ssqx;
	}

	@Override
	public String getYwbm() {
		if (_ywbm == null) {
			return StringPool.BLANK;
		}
		else {
			return _ywbm;
		}
	}

	@Override
	public void setYwbm(String ywbm) {
		_ywbm = ywbm;
	}

	@Override
	public long getJsddssqx() {
		return _jsddssqx;
	}

	@Override
	public void setJsddssqx(long jsddssqx) {
		_jsddssqx = jsddssqx;
	}

	@Override
	public String getJsgclb() {
		if (_jsgclb == null) {
			return StringPool.BLANK;
		}
		else {
			return _jsgclb;
		}
	}

	@Override
	public void setJsgclb(String jsgclb) {
		_jsgclb = jsgclb;
	}

	@Override
	public long getJsgcsx() {
		return _jsgcsx;
	}

	@Override
	public void setJsgcsx(long jsgcsx) {
		_jsgcsx = jsgcsx;
	}

	@Override
	public String getGyzjbz() {
		if (_gyzjbz == null) {
			return StringPool.BLANK;
		}
		else {
			return _gyzjbz;
		}
	}

	@Override
	public void setGyzjbz(String gyzjbz) {
		_gyzjbz = gyzjbz;
	}

	@Override
	public String getZbjg() {
		if (_zbjg == null) {
			return StringPool.BLANK;
		}
		else {
			return _zbjg;
		}
	}

	@Override
	public void setZbjg(String zbjg) {
		_zbjg = zbjg;
	}

	@Override
	public String getXmtzgs() {
		if (_xmtzgs == null) {
			return StringPool.BLANK;
		}
		else {
			return _xmtzgs;
		}
	}

	@Override
	public void setXmtzgs(String xmtzgs) {
		_xmtzgs = xmtzgs;
	}

	@Override
	public Date getJhkg() {
		return _jhkg;
	}

	@Override
	public void setJhkg(Date jhkg) {
		_jhkg = jhkg;
	}

	@Override
	public Date getJhjg() {
		return _jhjg;
	}

	@Override
	public void setJhjg(Date jhjg) {
		_jhjg = jhjg;
	}

	@Override
	public boolean getSfzftzl() {
		return _sfzftzl;
	}

	@Override
	public boolean isSfzftzl() {
		return _sfzftzl;
	}

	@Override
	public void setSfzftzl(boolean sfzftzl) {
		_sfzftzl = sfzftzl;
	}

	@Override
	public String getYzzpl1() {
		if (_yzzpl1 == null) {
			return StringPool.BLANK;
		}
		else {
			return _yzzpl1;
		}
	}

	@Override
	public void setYzzpl1(String yzzpl1) {
		_yzzpl1 = yzzpl1;
	}

	@Override
	public String getYzzpl2() {
		if (_yzzpl2 == null) {
			return StringPool.BLANK;
		}
		else {
			return _yzzpl2;
		}
	}

	@Override
	public void setYzzpl2(String yzzpl2) {
		_yzzpl2 = yzzpl2;
	}

	@Override
	public String getYzzpl3() {
		if (_yzzpl3 == null) {
			return StringPool.BLANK;
		}
		else {
			return _yzzpl3;
		}
	}

	@Override
	public void setYzzpl3(String yzzpl3) {
		_yzzpl3 = yzzpl3;
	}

	@Override
	public String getYzzpl4() {
		if (_yzzpl4 == null) {
			return StringPool.BLANK;
		}
		else {
			return _yzzpl4;
		}
	}

	@Override
	public void setYzzpl4(String yzzpl4) {
		_yzzpl4 = yzzpl4;
	}

	@Override
	public Date getTjsj() {
		return _tjsj;
	}

	@Override
	public void setTjsj(Date tjsj) {
		_tjsj = tjsj;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			ProjectProfile.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public ProjectProfile toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (ProjectProfile)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ProjectProfileImpl projectProfileImpl = new ProjectProfileImpl();

		projectProfileImpl.setPermitId(getPermitId());
		projectProfileImpl.setBjbh(getBjbh());
		projectProfileImpl.setJsdwmc(getJsdwmc());
		projectProfileImpl.setJsdwxz(getJsdwxz());
		projectProfileImpl.setJsdwdz(getJsdwdz());
		projectProfileImpl.setGcmc(getGcmc());
		projectProfileImpl.setJsdd(getJsdd());
		projectProfileImpl.setJsgcgm(getJsgcgm());
		projectProfileImpl.setFwjzmj(getFwjzmj());
		projectProfileImpl.setHtjg(getHtjg());
		projectProfileImpl.setHtgq(getHtgq());
		projectProfileImpl.setFddbr(getFddbr());
		projectProfileImpl.setJsdwlxdh(getJsdwlxdh());
		projectProfileImpl.setJsdwlxr(getJsdwlxr());
		projectProfileImpl.setJsdwsjh(getJsdwsjh());
		projectProfileImpl.setJsydpzwjhfdccqzbh(getJsydpzwjhfdccqzbh());
		projectProfileImpl.setJsgcghxkzbh(getJsgcghxkzbh());
		projectProfileImpl.setXckgqk(getXckgqk());
		projectProfileImpl.setXmlx(getXmlx());
		projectProfileImpl.setLxjb(getLxjb());
		projectProfileImpl.setXmxz(getXmxz());
		projectProfileImpl.setSsqx(getSsqx());
		projectProfileImpl.setYwbm(getYwbm());
		projectProfileImpl.setJsddssqx(getJsddssqx());
		projectProfileImpl.setJsgclb(getJsgclb());
		projectProfileImpl.setJsgcsx(getJsgcsx());
		projectProfileImpl.setGyzjbz(getGyzjbz());
		projectProfileImpl.setZbjg(getZbjg());
		projectProfileImpl.setXmtzgs(getXmtzgs());
		projectProfileImpl.setJhkg(getJhkg());
		projectProfileImpl.setJhjg(getJhjg());
		projectProfileImpl.setSfzftzl(getSfzftzl());
		projectProfileImpl.setYzzpl1(getYzzpl1());
		projectProfileImpl.setYzzpl2(getYzzpl2());
		projectProfileImpl.setYzzpl3(getYzzpl3());
		projectProfileImpl.setYzzpl4(getYzzpl4());
		projectProfileImpl.setTjsj(getTjsj());

		projectProfileImpl.resetOriginalValues();

		return projectProfileImpl;
	}

	@Override
	public int compareTo(ProjectProfile projectProfile) {
		long primaryKey = projectProfile.getPrimaryKey();

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

		if (!(obj instanceof ProjectProfile)) {
			return false;
		}

		ProjectProfile projectProfile = (ProjectProfile)obj;

		long primaryKey = projectProfile.getPrimaryKey();

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
	public CacheModel<ProjectProfile> toCacheModel() {
		ProjectProfileCacheModel projectProfileCacheModel = new ProjectProfileCacheModel();

		projectProfileCacheModel.permitId = getPermitId();

		projectProfileCacheModel.bjbh = getBjbh();

		String bjbh = projectProfileCacheModel.bjbh;

		if ((bjbh != null) && (bjbh.length() == 0)) {
			projectProfileCacheModel.bjbh = null;
		}

		projectProfileCacheModel.jsdwmc = getJsdwmc();

		String jsdwmc = projectProfileCacheModel.jsdwmc;

		if ((jsdwmc != null) && (jsdwmc.length() == 0)) {
			projectProfileCacheModel.jsdwmc = null;
		}

		projectProfileCacheModel.jsdwxz = getJsdwxz();

		String jsdwxz = projectProfileCacheModel.jsdwxz;

		if ((jsdwxz != null) && (jsdwxz.length() == 0)) {
			projectProfileCacheModel.jsdwxz = null;
		}

		projectProfileCacheModel.jsdwdz = getJsdwdz();

		String jsdwdz = projectProfileCacheModel.jsdwdz;

		if ((jsdwdz != null) && (jsdwdz.length() == 0)) {
			projectProfileCacheModel.jsdwdz = null;
		}

		projectProfileCacheModel.gcmc = getGcmc();

		String gcmc = projectProfileCacheModel.gcmc;

		if ((gcmc != null) && (gcmc.length() == 0)) {
			projectProfileCacheModel.gcmc = null;
		}

		projectProfileCacheModel.jsdd = getJsdd();

		String jsdd = projectProfileCacheModel.jsdd;

		if ((jsdd != null) && (jsdd.length() == 0)) {
			projectProfileCacheModel.jsdd = null;
		}

		projectProfileCacheModel.jsgcgm = getJsgcgm();

		String jsgcgm = projectProfileCacheModel.jsgcgm;

		if ((jsgcgm != null) && (jsgcgm.length() == 0)) {
			projectProfileCacheModel.jsgcgm = null;
		}

		projectProfileCacheModel.fwjzmj = getFwjzmj();

		String fwjzmj = projectProfileCacheModel.fwjzmj;

		if ((fwjzmj != null) && (fwjzmj.length() == 0)) {
			projectProfileCacheModel.fwjzmj = null;
		}

		projectProfileCacheModel.htjg = getHtjg();

		String htjg = projectProfileCacheModel.htjg;

		if ((htjg != null) && (htjg.length() == 0)) {
			projectProfileCacheModel.htjg = null;
		}

		projectProfileCacheModel.htgq = getHtgq();

		projectProfileCacheModel.fddbr = getFddbr();

		String fddbr = projectProfileCacheModel.fddbr;

		if ((fddbr != null) && (fddbr.length() == 0)) {
			projectProfileCacheModel.fddbr = null;
		}

		projectProfileCacheModel.jsdwlxdh = getJsdwlxdh();

		String jsdwlxdh = projectProfileCacheModel.jsdwlxdh;

		if ((jsdwlxdh != null) && (jsdwlxdh.length() == 0)) {
			projectProfileCacheModel.jsdwlxdh = null;
		}

		projectProfileCacheModel.jsdwlxr = getJsdwlxr();

		String jsdwlxr = projectProfileCacheModel.jsdwlxr;

		if ((jsdwlxr != null) && (jsdwlxr.length() == 0)) {
			projectProfileCacheModel.jsdwlxr = null;
		}

		projectProfileCacheModel.jsdwsjh = getJsdwsjh();

		String jsdwsjh = projectProfileCacheModel.jsdwsjh;

		if ((jsdwsjh != null) && (jsdwsjh.length() == 0)) {
			projectProfileCacheModel.jsdwsjh = null;
		}

		projectProfileCacheModel.jsydpzwjhfdccqzbh = getJsydpzwjhfdccqzbh();

		String jsydpzwjhfdccqzbh = projectProfileCacheModel.jsydpzwjhfdccqzbh;

		if ((jsydpzwjhfdccqzbh != null) && (jsydpzwjhfdccqzbh.length() == 0)) {
			projectProfileCacheModel.jsydpzwjhfdccqzbh = null;
		}

		projectProfileCacheModel.jsgcghxkzbh = getJsgcghxkzbh();

		String jsgcghxkzbh = projectProfileCacheModel.jsgcghxkzbh;

		if ((jsgcghxkzbh != null) && (jsgcghxkzbh.length() == 0)) {
			projectProfileCacheModel.jsgcghxkzbh = null;
		}

		projectProfileCacheModel.xckgqk = getXckgqk();

		String xckgqk = projectProfileCacheModel.xckgqk;

		if ((xckgqk != null) && (xckgqk.length() == 0)) {
			projectProfileCacheModel.xckgqk = null;
		}

		projectProfileCacheModel.xmlx = getXmlx();

		projectProfileCacheModel.lxjb = getLxjb();

		String lxjb = projectProfileCacheModel.lxjb;

		if ((lxjb != null) && (lxjb.length() == 0)) {
			projectProfileCacheModel.lxjb = null;
		}

		projectProfileCacheModel.xmxz = getXmxz();

		projectProfileCacheModel.ssqx = getSsqx();

		String ssqx = projectProfileCacheModel.ssqx;

		if ((ssqx != null) && (ssqx.length() == 0)) {
			projectProfileCacheModel.ssqx = null;
		}

		projectProfileCacheModel.ywbm = getYwbm();

		String ywbm = projectProfileCacheModel.ywbm;

		if ((ywbm != null) && (ywbm.length() == 0)) {
			projectProfileCacheModel.ywbm = null;
		}

		projectProfileCacheModel.jsddssqx = getJsddssqx();

		projectProfileCacheModel.jsgclb = getJsgclb();

		String jsgclb = projectProfileCacheModel.jsgclb;

		if ((jsgclb != null) && (jsgclb.length() == 0)) {
			projectProfileCacheModel.jsgclb = null;
		}

		projectProfileCacheModel.jsgcsx = getJsgcsx();

		projectProfileCacheModel.gyzjbz = getGyzjbz();

		String gyzjbz = projectProfileCacheModel.gyzjbz;

		if ((gyzjbz != null) && (gyzjbz.length() == 0)) {
			projectProfileCacheModel.gyzjbz = null;
		}

		projectProfileCacheModel.zbjg = getZbjg();

		String zbjg = projectProfileCacheModel.zbjg;

		if ((zbjg != null) && (zbjg.length() == 0)) {
			projectProfileCacheModel.zbjg = null;
		}

		projectProfileCacheModel.xmtzgs = getXmtzgs();

		String xmtzgs = projectProfileCacheModel.xmtzgs;

		if ((xmtzgs != null) && (xmtzgs.length() == 0)) {
			projectProfileCacheModel.xmtzgs = null;
		}

		Date jhkg = getJhkg();

		if (jhkg != null) {
			projectProfileCacheModel.jhkg = jhkg.getTime();
		}
		else {
			projectProfileCacheModel.jhkg = Long.MIN_VALUE;
		}

		Date jhjg = getJhjg();

		if (jhjg != null) {
			projectProfileCacheModel.jhjg = jhjg.getTime();
		}
		else {
			projectProfileCacheModel.jhjg = Long.MIN_VALUE;
		}

		projectProfileCacheModel.sfzftzl = getSfzftzl();

		projectProfileCacheModel.yzzpl1 = getYzzpl1();

		String yzzpl1 = projectProfileCacheModel.yzzpl1;

		if ((yzzpl1 != null) && (yzzpl1.length() == 0)) {
			projectProfileCacheModel.yzzpl1 = null;
		}

		projectProfileCacheModel.yzzpl2 = getYzzpl2();

		String yzzpl2 = projectProfileCacheModel.yzzpl2;

		if ((yzzpl2 != null) && (yzzpl2.length() == 0)) {
			projectProfileCacheModel.yzzpl2 = null;
		}

		projectProfileCacheModel.yzzpl3 = getYzzpl3();

		String yzzpl3 = projectProfileCacheModel.yzzpl3;

		if ((yzzpl3 != null) && (yzzpl3.length() == 0)) {
			projectProfileCacheModel.yzzpl3 = null;
		}

		projectProfileCacheModel.yzzpl4 = getYzzpl4();

		String yzzpl4 = projectProfileCacheModel.yzzpl4;

		if ((yzzpl4 != null) && (yzzpl4.length() == 0)) {
			projectProfileCacheModel.yzzpl4 = null;
		}

		Date tjsj = getTjsj();

		if (tjsj != null) {
			projectProfileCacheModel.tjsj = tjsj.getTime();
		}
		else {
			projectProfileCacheModel.tjsj = Long.MIN_VALUE;
		}

		return projectProfileCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(75);

		sb.append("{permitId=");
		sb.append(getPermitId());
		sb.append(", bjbh=");
		sb.append(getBjbh());
		sb.append(", jsdwmc=");
		sb.append(getJsdwmc());
		sb.append(", jsdwxz=");
		sb.append(getJsdwxz());
		sb.append(", jsdwdz=");
		sb.append(getJsdwdz());
		sb.append(", gcmc=");
		sb.append(getGcmc());
		sb.append(", jsdd=");
		sb.append(getJsdd());
		sb.append(", jsgcgm=");
		sb.append(getJsgcgm());
		sb.append(", fwjzmj=");
		sb.append(getFwjzmj());
		sb.append(", htjg=");
		sb.append(getHtjg());
		sb.append(", htgq=");
		sb.append(getHtgq());
		sb.append(", fddbr=");
		sb.append(getFddbr());
		sb.append(", jsdwlxdh=");
		sb.append(getJsdwlxdh());
		sb.append(", jsdwlxr=");
		sb.append(getJsdwlxr());
		sb.append(", jsdwsjh=");
		sb.append(getJsdwsjh());
		sb.append(", jsydpzwjhfdccqzbh=");
		sb.append(getJsydpzwjhfdccqzbh());
		sb.append(", jsgcghxkzbh=");
		sb.append(getJsgcghxkzbh());
		sb.append(", xckgqk=");
		sb.append(getXckgqk());
		sb.append(", xmlx=");
		sb.append(getXmlx());
		sb.append(", lxjb=");
		sb.append(getLxjb());
		sb.append(", xmxz=");
		sb.append(getXmxz());
		sb.append(", ssqx=");
		sb.append(getSsqx());
		sb.append(", ywbm=");
		sb.append(getYwbm());
		sb.append(", jsddssqx=");
		sb.append(getJsddssqx());
		sb.append(", jsgclb=");
		sb.append(getJsgclb());
		sb.append(", jsgcsx=");
		sb.append(getJsgcsx());
		sb.append(", gyzjbz=");
		sb.append(getGyzjbz());
		sb.append(", zbjg=");
		sb.append(getZbjg());
		sb.append(", xmtzgs=");
		sb.append(getXmtzgs());
		sb.append(", jhkg=");
		sb.append(getJhkg());
		sb.append(", jhjg=");
		sb.append(getJhjg());
		sb.append(", sfzftzl=");
		sb.append(getSfzftzl());
		sb.append(", yzzpl1=");
		sb.append(getYzzpl1());
		sb.append(", yzzpl2=");
		sb.append(getYzzpl2());
		sb.append(", yzzpl3=");
		sb.append(getYzzpl3());
		sb.append(", yzzpl4=");
		sb.append(getYzzpl4());
		sb.append(", tjsj=");
		sb.append(getTjsj());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(115);

		sb.append("<model><model-name>");
		sb.append("com.justonetech.cp.permit.model.ProjectProfile");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>permitId</column-name><column-value><![CDATA[");
		sb.append(getPermitId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>bjbh</column-name><column-value><![CDATA[");
		sb.append(getBjbh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>jsdwmc</column-name><column-value><![CDATA[");
		sb.append(getJsdwmc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>jsdwxz</column-name><column-value><![CDATA[");
		sb.append(getJsdwxz());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>jsdwdz</column-name><column-value><![CDATA[");
		sb.append(getJsdwdz());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gcmc</column-name><column-value><![CDATA[");
		sb.append(getGcmc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>jsdd</column-name><column-value><![CDATA[");
		sb.append(getJsdd());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>jsgcgm</column-name><column-value><![CDATA[");
		sb.append(getJsgcgm());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fwjzmj</column-name><column-value><![CDATA[");
		sb.append(getFwjzmj());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>htjg</column-name><column-value><![CDATA[");
		sb.append(getHtjg());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>htgq</column-name><column-value><![CDATA[");
		sb.append(getHtgq());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fddbr</column-name><column-value><![CDATA[");
		sb.append(getFddbr());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>jsdwlxdh</column-name><column-value><![CDATA[");
		sb.append(getJsdwlxdh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>jsdwlxr</column-name><column-value><![CDATA[");
		sb.append(getJsdwlxr());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>jsdwsjh</column-name><column-value><![CDATA[");
		sb.append(getJsdwsjh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>jsydpzwjhfdccqzbh</column-name><column-value><![CDATA[");
		sb.append(getJsydpzwjhfdccqzbh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>jsgcghxkzbh</column-name><column-value><![CDATA[");
		sb.append(getJsgcghxkzbh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>xckgqk</column-name><column-value><![CDATA[");
		sb.append(getXckgqk());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>xmlx</column-name><column-value><![CDATA[");
		sb.append(getXmlx());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lxjb</column-name><column-value><![CDATA[");
		sb.append(getLxjb());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>xmxz</column-name><column-value><![CDATA[");
		sb.append(getXmxz());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ssqx</column-name><column-value><![CDATA[");
		sb.append(getSsqx());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ywbm</column-name><column-value><![CDATA[");
		sb.append(getYwbm());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>jsddssqx</column-name><column-value><![CDATA[");
		sb.append(getJsddssqx());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>jsgclb</column-name><column-value><![CDATA[");
		sb.append(getJsgclb());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>jsgcsx</column-name><column-value><![CDATA[");
		sb.append(getJsgcsx());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gyzjbz</column-name><column-value><![CDATA[");
		sb.append(getGyzjbz());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>zbjg</column-name><column-value><![CDATA[");
		sb.append(getZbjg());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>xmtzgs</column-name><column-value><![CDATA[");
		sb.append(getXmtzgs());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>jhkg</column-name><column-value><![CDATA[");
		sb.append(getJhkg());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>jhjg</column-name><column-value><![CDATA[");
		sb.append(getJhjg());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sfzftzl</column-name><column-value><![CDATA[");
		sb.append(getSfzftzl());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>yzzpl1</column-name><column-value><![CDATA[");
		sb.append(getYzzpl1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>yzzpl2</column-name><column-value><![CDATA[");
		sb.append(getYzzpl2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>yzzpl3</column-name><column-value><![CDATA[");
		sb.append(getYzzpl3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>yzzpl4</column-name><column-value><![CDATA[");
		sb.append(getYzzpl4());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tjsj</column-name><column-value><![CDATA[");
		sb.append(getTjsj());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = ProjectProfile.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			ProjectProfile.class
		};
	private long _permitId;
	private String _bjbh;
	private String _jsdwmc;
	private String _jsdwxz;
	private String _jsdwdz;
	private String _gcmc;
	private String _jsdd;
	private String _jsgcgm;
	private String _fwjzmj;
	private String _htjg;
	private int _htgq;
	private String _fddbr;
	private String _jsdwlxdh;
	private String _jsdwlxr;
	private String _jsdwsjh;
	private String _jsydpzwjhfdccqzbh;
	private String _jsgcghxkzbh;
	private String _xckgqk;
	private long _xmlx;
	private String _lxjb;
	private long _xmxz;
	private String _ssqx;
	private String _ywbm;
	private long _jsddssqx;
	private String _jsgclb;
	private long _jsgcsx;
	private String _gyzjbz;
	private String _zbjg;
	private String _xmtzgs;
	private Date _jhkg;
	private Date _jhjg;
	private boolean _sfzftzl;
	private String _yzzpl1;
	private String _yzzpl2;
	private String _yzzpl3;
	private String _yzzpl4;
	private Date _tjsj;
	private ProjectProfile _escapedModel;
}