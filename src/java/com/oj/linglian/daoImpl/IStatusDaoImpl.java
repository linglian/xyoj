package com.oj.linglian.daoImpl;

import java.util.List;

import com.oj.linglian.entity.Status;

import com.oj.linglian.dao.IStatusDao;
import db.DBMan;

public class IStatusDaoImpl implements IStatusDao {
    public int update(Status status, Status keyStatus) {
        return DBMan.getInstance().updateNoSqlWithoutThrow(status, keyStatus, "status");
    }
    public int updateOfStatusId(Status status, String statusId) {
        Status kStatus = new Status();
        kStatus.setStatusId(statusId);
        return update(status, kStatus);
    }
    public int updateOfName(Status status, String name) {
        Status kStatus = new Status();
        kStatus.setName(name);
        return update(status, kStatus);
    }
    public int updateOfBody(Status status, String body) {
        Status kStatus = new Status();
        kStatus.setBody(body);
        return update(status, kStatus);
    }
    public int updateOfStatusIdAndName(Status status, String statusId, String name) {
        Status kStatus = new Status();
        kStatus.setStatusId(statusId);
        kStatus.setName(name);
        return update(status, kStatus);
    }
    public int updateOfStatusIdAndBody(Status status, String statusId, String body) {
        Status kStatus = new Status();
        kStatus.setStatusId(statusId);
        kStatus.setBody(body);
        return update(status, kStatus);
    }
    public int updateOfNameAndBody(Status status, String name, String body) {
        Status kStatus = new Status();
        kStatus.setName(name);
        kStatus.setBody(body);
        return update(status, kStatus);
    }
    public int remove(Status status) {
        return DBMan.getInstance().deleteNoSqlWithoutThrow(status, "status");
    }
    public int removeOfStatusId(String statusId) {
        Status status = new Status();
        status.setStatusId(statusId);
        return remove(status);
    }
    public int removeOfName(String name) {
        Status status = new Status();
        status.setName(name);
        return remove(status);
    }
    public int removeOfBody(String body) {
        Status status = new Status();
        status.setBody(body);
        return remove(status);
    }
    public int removeOfStatusIdAndName(String statusId, String name) {
        Status status = new Status();
        status.setStatusId(statusId);
        status.setName(name);
        return remove(status);
    }
    public int removeOfStatusIdAndBody(String statusId, String body) {
        Status status = new Status();
        status.setStatusId(statusId);
        status.setBody(body);
        return remove(status);
    }
    public int removeOfNameAndBody(String name, String body) {
        Status status = new Status();
        status.setName(name);
        status.setBody(body);
        return remove(status);
    }
    public int insert(Status status) {
        return DBMan.getInstance().insertNoSqlWithoutThrow(status, "status");
    }
    public int insertOfStatusId(String statusId) {
        Status status = new Status();
        status.setStatusId(statusId);
        return insert(status);
    }
    public int insertOfName(String name) {
        Status status = new Status();
        status.setName(name);
        return insert(status);
    }
    public int insertOfBody(String body) {
        Status status = new Status();
        status.setBody(body);
        return insert(status);
    }
    public int insertOfStatusIdAndName(String statusId, String name) {
        Status status = new Status();
        status.setStatusId(statusId);
        status.setName(name);
        return insert(status);
    }
    public int insertOfStatusIdAndBody(String statusId, String body) {
        Status status = new Status();
        status.setStatusId(statusId);
        status.setBody(body);
        return insert(status);
    }
    public int insertOfNameAndBody(String name, String body) {
        Status status = new Status();
        status.setName(name);
        status.setBody(body);
        return insert(status);
    }
    public Status getStatus(Status status) {
        return DBMan.getInstance().queryByIdNoSqlWithoutThrow(status, "status");
    }
    public Status getStatusOfStatusId(String statusId) {
        Status status = new Status();
        status.setStatusId(statusId);
        return getStatus(status);
    }
    public Status getStatusOfName(String name) {
        Status status = new Status();
        status.setName(name);
        return getStatus(status);
    }
    public Status getStatusOfBody(String body) {
        Status status = new Status();
        status.setBody(body);
        return getStatus(status);
    }
    public Status getStatusOfStatusIdAndName(String statusId, String name) {
        Status status = new Status();
        status.setStatusId(statusId);
        status.setName(name);
        return getStatus(status);
    }
    public Status getStatusOfStatusIdAndBody(String statusId, String body) {
        Status status = new Status();
        status.setStatusId(statusId);
        status.setBody(body);
        return getStatus(status);
    }
    public Status getStatusOfNameAndBody(String name, String body) {
        Status status = new Status();
        status.setName(name);
        status.setBody(body);
        return getStatus(status);
    }
    public List<Status> getStatuss(Status status) {
        return DBMan.getInstance().queryNoSqlWithoutThrow(status, "status");
    }
    public List<Status> getStatussOfStatusId(String statusId) {
        Status status = new Status();
        status.setStatusId(statusId);
        return getStatuss(status);
    }
    public List<Status> getStatussOfName(String name) {
        Status status = new Status();
        status.setName(name);
        return getStatuss(status);
    }
    public List<Status> getStatussOfBody(String body) {
        Status status = new Status();
        status.setBody(body);
        return getStatuss(status);
    }
    public List<Status> getStatussOfStatusIdAndName(String statusId, String name) {
        Status status = new Status();
        status.setStatusId(statusId);
        status.setName(name);
        return getStatuss(status);
    }
    public List<Status> getStatussOfStatusIdAndBody(String statusId, String body) {
        Status status = new Status();
        status.setStatusId(statusId);
        status.setBody(body);
        return getStatuss(status);
    }
    public List<Status> getStatussOfNameAndBody(String name, String body) {
        Status status = new Status();
        status.setName(name);
        status.setBody(body);
        return getStatuss(status);
    }
}
