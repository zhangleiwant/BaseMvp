package com.king.zlei.userloginmvp.view;

/**
 * <b>Create Date:</b> 2017/8/17<br>
 * <b>Author:</b> Zhanglei<br>
 * <b>Description:</b> 所有的view都会实现的基类<br>
 */

public interface BaseView {

    //共有的弹吐司的逻辑
    //弹出信息
    void onShowMSg(String msg);
//
//    //登录成功信息
//    void onShowSuccess(String msg);
//
//    //登录失败信息
//    void onShowError(String msg);
}
