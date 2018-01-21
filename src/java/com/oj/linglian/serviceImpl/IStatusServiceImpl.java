package com.oj.linglian.serviceImpl;

import java.util.List;

import com.oj.linglian.entity.Status;

import com.oj.linglian.dao.IStatusDao;
import com.oj.linglian.daoImpl.IStatusDaoImpl;
import com.oj.linglian.service.IStatusService;

public class IStatusServiceImpl implements IStatusService {
	IStatusDao dao = null;

	public IStatusServiceImpl() {
		dao = new IStatusDaoImpl();
	}
    public int update(Status status, Status keyStatus) {
        return dao.update(status, keyStatus);
    }
    public int updateOfStatusId(Status status, String statusId) {
        return dao.updateOfStatusId(status, statusId);
    }
    public int updateOfName(Status status, String name) {
        return dao.updateOfName(status, name);
    }
    public int updateOfBody(Status status, String body) {
        return dao.updateOfBody(status, body);
    }
    public int updateOfStatusIdAndName(Status status, String statusId, String name) {
        return dao.updateOfStatusIdAndName(status, statusId, name);
    }
    public int updateOfStatusIdAndBody(Status status, String statusId, String body) {
        return dao.updateOfStatusIdAndBody(status, statusId, body);
    }
    public int updateOfNameAndBody(Status status, String name, String body) {
        return dao.updateOfNameAndBody(status, name, body);
    }
    public int remove(Status status) {
        return dao.remove(status);
    }
    public int removeOfStatusId(String statusId) {
        return dao.removeOfStatusId(statusId);
    }
    public int removeOfName(String name) {
        return dao.removeOfName(name);
    }
    public int removeOfBody(String body) {
        return dao.removeOfBody(body);
    }
    public int removeOfStatusIdAndName(String statusId, String name) {
        return dao.removeOfStatusIdAndName(statusId, name);
    }
    public int removeOfStatusIdAndBody(String statusId, String body) {
        return dao.removeOfStatusIdAndBody(statusId, body);
    }
    public int removeOfNameAndBody(String name, String body) {
        return dao.removeOfNameAndBody(name, body);
    }
    public int insert(Status status) {
        return dao.insert(status);
    }
    public int insertOfStatusId(String statusId) {
        return dao.insertOfStatusId(statusId);
    }
    public int insertOfName(String name) {
        return dao.insertOfName(name);
    }
    public int insertOfBody(String body) {
        return dao.insertOfBody(body);
    }
    public int insertOfStatusIdAndName(String statusId, String name) {
        return dao.insertOfStatusIdAndName(statusId, name);
    }
    public int insertOfStatusIdAndBody(String statusId, String body) {
        return dao.insertOfStatusIdAndBody(statusId, body);
    }
    public int insertOfNameAndBody(String name, String body) {
        return dao.insertOfNameAndBody(name, body);
    }
    public Status getStatus(Status status) {
        return dao.getStatus(status);
    }
    public Status getStatusOfStatusId(String statusId) {
        return dao.getStatusOfStatusId(statusId);
    }
    public Status getStatusOfName(String name) {
        return dao.getStatusOfName(name);
    }
    public Status getStatusOfBody(String body) {
        return dao.getStatusOfBody(body);
    }
    public Status getStatusOfStatusIdAndName(String statusId, String name) {
        return dao.getStatusOfStatusIdAndName(statusId, name);
    }
    public Status getStatusOfStatusIdAndBody(String statusId, String body) {
        return dao.getStatusOfStatusIdAndBody(statusId, body);
    }
    public Status getStatusOfNameAndBody(String name, String body) {
        return dao.getStatusOfNameAndBody(name, body);
    }
    public List<Status> getStatuss(Status status) {
        return dao.getStatuss(status);
    }
    public List<Status> getStatussOfStatusId(String statusId) {
        return dao.getStatussOfStatusId(statusId);
    }
    public List<Status> getStatussOfName(String name) {
        return dao.getStatussOfName(name);
    }
    public List<Status> getStatussOfBody(String body) {
        return dao.getStatussOfBody(body);
    }
    public List<Status> getStatussOfStatusIdAndName(String statusId, String name) {
        return dao.getStatussOfStatusIdAndName(statusId, name);
    }
    public List<Status> getStatussOfStatusIdAndBody(String statusId, String body) {
        return dao.getStatussOfStatusIdAndBody(statusId, body);
    }
    public List<Status> getStatussOfNameAndBody(String name, String body) {
        return dao.getStatussOfNameAndBody(name, body);
    }
}
