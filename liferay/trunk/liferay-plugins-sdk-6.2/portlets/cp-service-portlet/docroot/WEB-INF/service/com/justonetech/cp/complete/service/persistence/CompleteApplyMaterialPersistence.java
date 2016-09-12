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

package com.justonetech.cp.complete.service.persistence;

import com.justonetech.cp.complete.model.CompleteApplyMaterial;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the complete apply material service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author fanqi
 * @see CompleteApplyMaterialPersistenceImpl
 * @see CompleteApplyMaterialUtil
 * @generated
 */
public interface CompleteApplyMaterialPersistence extends BasePersistence<CompleteApplyMaterial> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CompleteApplyMaterialUtil} to access the complete apply material persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the complete apply materials where completeId = &#63;.
	*
	* @param completeId the complete ID
	* @return the matching complete apply materials
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.justonetech.cp.complete.model.CompleteApplyMaterial> findByCompleteId(
		long completeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the complete apply materials where completeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.justonetech.cp.complete.model.impl.CompleteApplyMaterialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param completeId the complete ID
	* @param start the lower bound of the range of complete apply materials
	* @param end the upper bound of the range of complete apply materials (not inclusive)
	* @return the range of matching complete apply materials
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.justonetech.cp.complete.model.CompleteApplyMaterial> findByCompleteId(
		long completeId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the complete apply materials where completeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.justonetech.cp.complete.model.impl.CompleteApplyMaterialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param completeId the complete ID
	* @param start the lower bound of the range of complete apply materials
	* @param end the upper bound of the range of complete apply materials (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching complete apply materials
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.justonetech.cp.complete.model.CompleteApplyMaterial> findByCompleteId(
		long completeId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first complete apply material in the ordered set where completeId = &#63;.
	*
	* @param completeId the complete ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching complete apply material
	* @throws com.justonetech.cp.complete.NoSuchCompleteApplyMaterialException if a matching complete apply material could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.justonetech.cp.complete.model.CompleteApplyMaterial findByCompleteId_First(
		long completeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.justonetech.cp.complete.NoSuchCompleteApplyMaterialException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first complete apply material in the ordered set where completeId = &#63;.
	*
	* @param completeId the complete ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching complete apply material, or <code>null</code> if a matching complete apply material could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.justonetech.cp.complete.model.CompleteApplyMaterial fetchByCompleteId_First(
		long completeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last complete apply material in the ordered set where completeId = &#63;.
	*
	* @param completeId the complete ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching complete apply material
	* @throws com.justonetech.cp.complete.NoSuchCompleteApplyMaterialException if a matching complete apply material could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.justonetech.cp.complete.model.CompleteApplyMaterial findByCompleteId_Last(
		long completeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.justonetech.cp.complete.NoSuchCompleteApplyMaterialException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last complete apply material in the ordered set where completeId = &#63;.
	*
	* @param completeId the complete ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching complete apply material, or <code>null</code> if a matching complete apply material could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.justonetech.cp.complete.model.CompleteApplyMaterial fetchByCompleteId_Last(
		long completeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the complete apply materials before and after the current complete apply material in the ordered set where completeId = &#63;.
	*
	* @param materialId the primary key of the current complete apply material
	* @param completeId the complete ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next complete apply material
	* @throws com.justonetech.cp.complete.NoSuchCompleteApplyMaterialException if a complete apply material with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.justonetech.cp.complete.model.CompleteApplyMaterial[] findByCompleteId_PrevAndNext(
		long materialId, long completeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.justonetech.cp.complete.NoSuchCompleteApplyMaterialException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the complete apply materials where completeId = &#63; from the database.
	*
	* @param completeId the complete ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCompleteId(long completeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of complete apply materials where completeId = &#63;.
	*
	* @param completeId the complete ID
	* @return the number of matching complete apply materials
	* @throws SystemException if a system exception occurred
	*/
	public int countByCompleteId(long completeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the complete apply material in the entity cache if it is enabled.
	*
	* @param completeApplyMaterial the complete apply material
	*/
	public void cacheResult(
		com.justonetech.cp.complete.model.CompleteApplyMaterial completeApplyMaterial);

	/**
	* Caches the complete apply materials in the entity cache if it is enabled.
	*
	* @param completeApplyMaterials the complete apply materials
	*/
	public void cacheResult(
		java.util.List<com.justonetech.cp.complete.model.CompleteApplyMaterial> completeApplyMaterials);

	/**
	* Creates a new complete apply material with the primary key. Does not add the complete apply material to the database.
	*
	* @param materialId the primary key for the new complete apply material
	* @return the new complete apply material
	*/
	public com.justonetech.cp.complete.model.CompleteApplyMaterial create(
		long materialId);

	/**
	* Removes the complete apply material with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param materialId the primary key of the complete apply material
	* @return the complete apply material that was removed
	* @throws com.justonetech.cp.complete.NoSuchCompleteApplyMaterialException if a complete apply material with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.justonetech.cp.complete.model.CompleteApplyMaterial remove(
		long materialId)
		throws com.justonetech.cp.complete.NoSuchCompleteApplyMaterialException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.justonetech.cp.complete.model.CompleteApplyMaterial updateImpl(
		com.justonetech.cp.complete.model.CompleteApplyMaterial completeApplyMaterial)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the complete apply material with the primary key or throws a {@link com.justonetech.cp.complete.NoSuchCompleteApplyMaterialException} if it could not be found.
	*
	* @param materialId the primary key of the complete apply material
	* @return the complete apply material
	* @throws com.justonetech.cp.complete.NoSuchCompleteApplyMaterialException if a complete apply material with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.justonetech.cp.complete.model.CompleteApplyMaterial findByPrimaryKey(
		long materialId)
		throws com.justonetech.cp.complete.NoSuchCompleteApplyMaterialException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the complete apply material with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param materialId the primary key of the complete apply material
	* @return the complete apply material, or <code>null</code> if a complete apply material with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.justonetech.cp.complete.model.CompleteApplyMaterial fetchByPrimaryKey(
		long materialId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the complete apply materials.
	*
	* @return the complete apply materials
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.justonetech.cp.complete.model.CompleteApplyMaterial> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the complete apply materials.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.justonetech.cp.complete.model.impl.CompleteApplyMaterialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of complete apply materials
	* @param end the upper bound of the range of complete apply materials (not inclusive)
	* @return the range of complete apply materials
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.justonetech.cp.complete.model.CompleteApplyMaterial> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the complete apply materials.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.justonetech.cp.complete.model.impl.CompleteApplyMaterialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of complete apply materials
	* @param end the upper bound of the range of complete apply materials (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of complete apply materials
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.justonetech.cp.complete.model.CompleteApplyMaterial> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the complete apply materials from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of complete apply materials.
	*
	* @return the number of complete apply materials
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}