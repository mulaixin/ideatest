package com.woniu.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class Result<T> implements Serializable {
    private boolean flag;
    private Integer code;
    private String message;
    private T data;//返回数据

    public Result(boolean flag, Integer code, String message, Object data) {
        this.flag = flag;
        this.code = code;
        this.message = message;
        this.data = (T) data;
    }

    public Result(boolean flag, Integer code, String message) {
        this.flag = flag;
        this.code = code;
        this.message = message;
    }

    public Result() {

    }


}
