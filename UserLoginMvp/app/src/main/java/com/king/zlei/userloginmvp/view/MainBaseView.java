package com.king.zlei.userloginmvp.view;

/**
 * <b>Create Date:</b> 2017/8/17<br>
 * <b>Author:</b> Zhanglei<br>
 * <b>Description:</b> 具体的界面模块实现接口<br>
 */

public interface MainBaseView extends BaseView {

    //此处的两个方法只是在mainActivity中的view逻辑
    //登录成功信息
    void onShowSuccess(String msg);

    //登录失败信息
    void
    onShowError(String msg);
}
