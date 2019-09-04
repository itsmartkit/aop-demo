package com.itsmartkit.aop.vo;

import java.io.Serializable;

/**
 * @author cyj
 * @name ResultVO
 * @description TODO 返回结果类
 * @date 2019/9/3 13:58
 * Version 1.0
 */
public class ResultVO<T> implements Serializable {

    private Boolean status;

    private String msg;

    private T data;

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResultVO{" +
                "status=" + status +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
