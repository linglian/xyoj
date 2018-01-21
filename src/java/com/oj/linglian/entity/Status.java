package com.oj.linglian.entity;

public class Status {
    private String statusId;
    private String name;
    private String body;

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Status [statusId=" + statusId + ", name=" + name + ", body=" + body + ", ]";
    }

}
