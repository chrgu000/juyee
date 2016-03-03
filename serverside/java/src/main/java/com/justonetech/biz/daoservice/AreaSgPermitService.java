package com.justonetech.biz.daoservice;

import com.justonetech.core.orm.hibernate.EntityService;
import com.justonetech.biz.domain.AreaSgPermit;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




/**
 * author:system
 * 注：此文件内容不需要修改
 */
@Service
public class AreaSgPermitService extends EntityService<AreaSgPermit,Long> {
    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        initDao(sessionFactory, AreaSgPermit.class);
    }
}