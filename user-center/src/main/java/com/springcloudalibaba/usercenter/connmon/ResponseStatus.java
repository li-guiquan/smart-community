package com.springcloudalibaba.usercenter.connmon;

/**
 * @author www
 */

public enum ResponseStatus {
    SUCCESS(2000,"SUCCESS"),ERROR(4000,"ERROR");

    private Integer status;
    private String msg;

    ResponseStatus(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
