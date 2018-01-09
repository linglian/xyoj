/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oj.linglian.service;

import com.oj.linglian.entity.Status;

/**
 *
 * @author lol
 */
public interface IStatusService {
    public Status getStatus(String statusId);
}
