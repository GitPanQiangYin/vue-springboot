package com.web.mall.api;

/**
 * @author Administrator
 * @date 2020/8/31 13:20
 */
public class Result {

    //响应码
    private int code;

    public Result(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
