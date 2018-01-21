package com.oj.linglian.service;

import java.util.List;

import com.oj.linglian.entity.Status;

public interface IStatusService {
    public int update(Status status, Status keyStatus);
    public int updateOfStatusId(Status status, String statusId);
    public int updateOfName(Status status, String name);
    public int updateOfBody(Status status, String body);
    public int updateOfStatusIdAndName(Status status, String statusId, String name);
    public int updateOfStatusIdAndBody(Status status, String statusId, String body);
    public int updateOfNameAndBody(Status status, String name, String body);
    public int remove(Status status);
    public int removeOfStatusId(String statusId);
    public int removeOfName(String name);
    public int removeOfBody(String body);
    public int removeOfStatusIdAndName(String statusId, String name);
    public int removeOfStatusIdAndBody(String statusId, String body);
    public int removeOfNameAndBody(String name, String body);
    public int insert(Status status);
    public int insertOfStatusId(String statusId);
    public int insertOfName(String name);
    public int insertOfBody(String body);
    public int insertOfStatusIdAndName(String statusId, String name);
    public int insertOfStatusIdAndBody(String statusId, String body);
    public int insertOfNameAndBody(String name, String body);
    public Status getStatus(Status status);
    public Status getStatusOfStatusId(String statusId);
    public Status getStatusOfName(String name);
    public Status getStatusOfBody(String body);
    public Status getStatusOfStatusIdAndName(String statusId, String name);
    public Status getStatusOfStatusIdAndBody(String statusId, String body);
    public Status getStatusOfNameAndBody(String name, String body);
    public List<Status> getStatuss(Status status);
    public List<Status> getStatussOfStatusId(String statusId);
    public List<Status> getStatussOfName(String name);
    public List<Status> getStatussOfBody(String body);
    public List<Status> getStatussOfStatusIdAndName(String statusId, String name);
    public List<Status> getStatussOfStatusIdAndBody(String statusId, String body);
    public List<Status> getStatussOfNameAndBody(String name, String body);
}
