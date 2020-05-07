package com.relax.framework.model.response;

/**
 * @author Gejianping
 * @version 1.0
 * @date 2020/5/7 15:07
 * *************************
 * 10000-- 通用错误代码
 * 22000-- 媒资错误代码
 * 23000-- 用户中心错误代码
 * 24000-- cms错误代码
 * 25000-- 文件系统
 */
public interface ResultCode {
    /** 操作是否成功,true为成功，false操作失败
     * @return true为成功，false操作失败*/
    boolean success();
    /** 操作代码
     * @return 返回代表 成功 或者 不同类型错误 的代码*/
    int code();
    /** 提示信息
     * @return 返回该状态下 的 提示信息*/
    String message();
}
