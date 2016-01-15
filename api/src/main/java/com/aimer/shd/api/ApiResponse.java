package com.aimer.shd.api;

/**
 * Created by shd on 2016/1/15.
 */
public class ApiResponse<T> {
    private String status;
    private String msg;
    private T data;
    private String tag;

    public ApiResponse(String status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public boolean isSuccess() {
        return status.equals(1);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
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

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
