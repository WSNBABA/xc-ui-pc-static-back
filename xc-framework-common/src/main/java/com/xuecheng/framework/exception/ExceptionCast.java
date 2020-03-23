package com.xuecheng.framework.exception;

import com.xuecheng.framework.model.response.ResultCode;

/**
 * @AUTHOR LZG
 * @DATE 2020/1/4 12:01
 * @VERSION 1.0
 */

public class ExceptionCast {

    public static void cast(ResultCode resultCode) {
         throw new CustomException(resultCode);
    }
}
