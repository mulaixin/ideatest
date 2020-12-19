package com.woniu.config;

import com.woniu.dto.Result;
import com.woniu.dto.StatusCode;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice//返回json格式
public class GlobalExceptionHandler {

    @ExceptionHandler({NullPointerException.class})
    public Result handlerNullPointException(){
        return new Result(false, StatusCode.ERROR,"空指针异常",null);
    }
    @ExceptionHandler({Exception.class})
    public Result handlerException(){
        return new Result(false, StatusCode.ERROR,"服务器异常",null);
    }

}