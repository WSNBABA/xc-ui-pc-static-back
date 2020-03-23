package com.xuecheng.framework.exception;

import com.xuecheng.framework.model.response.ResultCode;

/**
 * 自定义异常类
 * @AUTHOR LZG
 * @DATE 2020/1/4 11:57
 * @VERSION 1.0
 */

public class CustomException extends RuntimeException{

    //错误代码
    ResultCode resultCode;

    public CustomException(ResultCode resultCode){
        this.resultCode = resultCode;
    }

    public ResultCode getResultCode(){
        return resultCode;
    }
}
