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

package com.justonetech.cp.permit.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the ProjectProfile service. Represents a row in the &quot;cp_ProjectProfile&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.justonetech.cp.permit.model.impl.ProjectProfileModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.justonetech.cp.permit.model.impl.ProjectProfileImpl}.
 * </p>
 *
 * @author fanqi
 * @see ProjectProfile
 * @see com.justonetech.cp.permit.model.impl.ProjectProfileImpl
 * @see com.justonetech.cp.permit.model.impl.ProjectProfileModelImpl
 * @generated
 */
public interface ProjectProfileModel extends BaseModel<ProjectProfile> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a project profile model instance should use the {@link ProjectProfile} interface instead.
	 */

	/**
	 * Returns the primary key of this project profile.
	 *
	 * @return the primary key of this project profile
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this project profile.
	 *
	 * @param primaryKey the primary key of this project profile
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the permit ID of this project profile.
	 *
	 * @return the permit ID of this project profile
	 */
	public long getPermitId();

	/**
	 * Sets the permit ID of this project profile.
	 *
	 * @param permitId the permit ID of this project profile
	 */
	public void setPermitId(long permitId);

	/**
	 * Returns the bjbh of this project profile.
	 *
	 * @return the bjbh of this project profile
	 */
	@AutoEscape
	public String getBjbh();

	/**
	 * Sets the bjbh of this project profile.
	 *
	 * @param bjbh the bjbh of this project profile
	 */
	public void setBjbh(String bjbh);

	/**
	 * Returns the jsdwmc of this project profile.
	 *
	 * @return the jsdwmc of this project profile
	 */
	@AutoEscape
	public String getJsdwmc();

	/**
	 * Sets the jsdwmc of this project profile.
	 *
	 * @param jsdwmc the jsdwmc of this project profile
	 */
	public void setJsdwmc(String jsdwmc);

	/**
	 * Returns the jsdwxz of this project profile.
	 *
	 * @return the jsdwxz of this project profile
	 */
	@AutoEscape
	public String getJsdwxz();

	/**
	 * Sets the jsdwxz of this project profile.
	 *
	 * @param jsdwxz the jsdwxz of this project profile
	 */
	public void setJsdwxz(String jsdwxz);

	/**
	 * Returns the jsdwdz of this project profile.
	 *
	 * @return the jsdwdz of this project profile
	 */
	@AutoEscape
	public String getJsdwdz();

	/**
	 * Sets the jsdwdz of this project profile.
	 *
	 * @param jsdwdz the jsdwdz of this project profile
	 */
	public void setJsdwdz(String jsdwdz);

	/**
	 * Returns the gcmc of this project profile.
	 *
	 * @return the gcmc of this project profile
	 */
	@AutoEscape
	public String getGcmc();

	/**
	 * Sets the gcmc of this project profile.
	 *
	 * @param gcmc the gcmc of this project profile
	 */
	public void setGcmc(String gcmc);

	/**
	 * Returns the jsdd of this project profile.
	 *
	 * @return the jsdd of this project profile
	 */
	@AutoEscape
	public String getJsdd();

	/**
	 * Sets the jsdd of this project profile.
	 *
	 * @param jsdd the jsdd of this project profile
	 */
	public void setJsdd(String jsdd);

	/**
	 * Returns the jsgcgm of this project profile.
	 *
	 * @return the jsgcgm of this project profile
	 */
	@AutoEscape
	public String getJsgcgm();

	/**
	 * Sets the jsgcgm of this project profile.
	 *
	 * @param jsgcgm the jsgcgm of this project profile
	 */
	public void setJsgcgm(String jsgcgm);

	/**
	 * Returns the fwjzmj of this project profile.
	 *
	 * @return the fwjzmj of this project profile
	 */
	@AutoEscape
	public String getFwjzmj();

	/**
	 * Sets the fwjzmj of this project profile.
	 *
	 * @param fwjzmj the fwjzmj of this project profile
	 */
	public void setFwjzmj(String fwjzmj);

	/**
	 * Returns the htjg of this project profile.
	 *
	 * @return the htjg of this project profile
	 */
	@AutoEscape
	public String getHtjg();

	/**
	 * Sets the htjg of this project profile.
	 *
	 * @param htjg the htjg of this project profile
	 */
	public void setHtjg(String htjg);

	/**
	 * Returns the htgq of this project profile.
	 *
	 * @return the htgq of this project profile
	 */
	public int getHtgq();

	/**
	 * Sets the htgq of this project profile.
	 *
	 * @param htgq the htgq of this project profile
	 */
	public void setHtgq(int htgq);

	/**
	 * Returns the fddbr of this project profile.
	 *
	 * @return the fddbr of this project profile
	 */
	@AutoEscape
	public String getFddbr();

	/**
	 * Sets the fddbr of this project profile.
	 *
	 * @param fddbr the fddbr of this project profile
	 */
	public void setFddbr(String fddbr);

	/**
	 * Returns the jsdwlxdh of this project profile.
	 *
	 * @return the jsdwlxdh of this project profile
	 */
	@AutoEscape
	public String getJsdwlxdh();

	/**
	 * Sets the jsdwlxdh of this project profile.
	 *
	 * @param jsdwlxdh the jsdwlxdh of this project profile
	 */
	public void setJsdwlxdh(String jsdwlxdh);

	/**
	 * Returns the jsdwlxr of this project profile.
	 *
	 * @return the jsdwlxr of this project profile
	 */
	@AutoEscape
	public String getJsdwlxr();

	/**
	 * Sets the jsdwlxr of this project profile.
	 *
	 * @param jsdwlxr the jsdwlxr of this project profile
	 */
	public void setJsdwlxr(String jsdwlxr);

	/**
	 * Returns the jsdwsjh of this project profile.
	 *
	 * @return the jsdwsjh of this project profile
	 */
	@AutoEscape
	public String getJsdwsjh();

	/**
	 * Sets the jsdwsjh of this project profile.
	 *
	 * @param jsdwsjh the jsdwsjh of this project profile
	 */
	public void setJsdwsjh(String jsdwsjh);

	/**
	 * Returns the jsydpzwjhfdccqzbh of this project profile.
	 *
	 * @return the jsydpzwjhfdccqzbh of this project profile
	 */
	@AutoEscape
	public String getJsydpzwjhfdccqzbh();

	/**
	 * Sets the jsydpzwjhfdccqzbh of this project profile.
	 *
	 * @param jsydpzwjhfdccqzbh the jsydpzwjhfdccqzbh of this project profile
	 */
	public void setJsydpzwjhfdccqzbh(String jsydpzwjhfdccqzbh);

	/**
	 * Returns the jsgcghxkzbh of this project profile.
	 *
	 * @return the jsgcghxkzbh of this project profile
	 */
	@AutoEscape
	public String getJsgcghxkzbh();

	/**
	 * Sets the jsgcghxkzbh of this project profile.
	 *
	 * @param jsgcghxkzbh the jsgcghxkzbh of this project profile
	 */
	public void setJsgcghxkzbh(String jsgcghxkzbh);

	/**
	 * Returns the xckgqk of this project profile.
	 *
	 * @return the xckgqk of this project profile
	 */
	@AutoEscape
	public String getXckgqk();

	/**
	 * Sets the xckgqk of this project profile.
	 *
	 * @param xckgqk the xckgqk of this project profile
	 */
	public void setXckgqk(String xckgqk);

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
		com.justonetech.cp.permit.model.ProjectProfile projectProfile);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.justonetech.cp.permit.model.ProjectProfile> toCacheModel();

	@Override
	public com.justonetech.cp.permit.model.ProjectProfile toEscapedModel();

	@Override
	public com.justonetech.cp.permit.model.ProjectProfile toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}