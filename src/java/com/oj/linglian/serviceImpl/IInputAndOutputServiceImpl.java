/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oj.linglian.serviceImpl;

import com.oj.linglian.dao.IInputAndOutputDao;
import com.oj.linglian.daoImpl.IInputAndOutputDaoImpl;
import com.oj.linglian.entity.InputAndOutput;
import com.oj.linglian.service.IInputAndOutputService;
import java.util.List;

/**
 *
 * @author lol
 */
public class IInputAndOutputServiceImpl implements IInputAndOutputService {

    IInputAndOutputDao iiaod = null;

    public IInputAndOutputServiceImpl() {
        iiaod = new IInputAndOutputDaoImpl();
    }

    @Override
    public List<InputAndOutput> queryInputAndOutputs(String qid) {
        return iiaod.queryInputAndOutputs(qid);
    }

}
