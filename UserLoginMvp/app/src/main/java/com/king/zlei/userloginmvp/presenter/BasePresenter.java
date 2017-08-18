package com.king.zlei.userloginmvp.presenter;

/**
 * <b>Create Date:</b> 2017/8/17<br>
 * <b>Author:</b> Zhanglei<br>
 * <b>Description:</b> <br>
 */

public interface BasePresenter<T> {

    void attchView(T view);

    void destroyView(T view);

//    void login(User user);

}
