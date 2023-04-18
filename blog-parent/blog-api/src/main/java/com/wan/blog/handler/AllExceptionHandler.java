package com.wan.blog.handler;

import com.wan.blog.vo.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

//拦截处理 AOP的实现
@ControllerAdvice
public class AllExceptionHandler {
    //异常处理
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result doException(Exception exception){
        exception.printStackTrace();
        return Result.fail(-999,"系统异常");
    }
}
