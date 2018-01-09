/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oj.linglian.serviceImpl;

import com.oj.linglian.dao.IStatusDao;
import com.oj.linglian.daoImpl.IStatusDaoImpl;
import com.oj.linglian.entity.Status;
import com.oj.linglian.service.IStatusService;

/**
 *
 * @author lol
 */
public class IStatusServiceImpl implements IStatusService {

    @Override
    public Status getStatus(String statusId) {
        IStatusDao isd = new IStatusDaoImpl();
        return isd.getStatus(statusId);
    }

}
