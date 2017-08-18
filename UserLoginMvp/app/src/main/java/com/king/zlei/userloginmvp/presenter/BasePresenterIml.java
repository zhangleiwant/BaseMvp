package com.king.zlei.userloginmvp.presenter;

import com.king.zlei.userloginmvp.view.BaseView;

/**
 * <b>Create Date:</b> 2017/8/17<br>
 * <b>Author:</b> Zhanglei<br>
 * <b>Description:</b> 绑定和解绑都是所有的presenter都有的，所以定义该类<br>
 */

public class BasePresenterIml<T extends BaseView> implements BasePresenter<T> {

    public T mBaseView;

    @Override
    public void attchView(T view) {
        this.mBaseView = view;
    }

    @Override
    public void destroyView(T view) {
        mBaseView = null;
    }
//    private MainBaseView mBaseView;
//
//    @Override
//    public void attchView(MainBaseView view) {
//        this.mBaseView = view;
//    }
//
//    @Override
//    public void destroyView(MainBaseView view) {
//        mBaseView = null;
//    }
//
//    @Override
//    public void login(User user) {
//        if (!TextUtils.isEmpty(user.getName())) {
//            if (user.getName().equals("zhang") && user.getPsd().equals("123456")) {
//                mBaseView.onShowSuccess("登陆成功");
//            } else {
//                mBaseView.onShowError("登录失败");
//            }
//        } else {
//            mBaseView.onShowMSg("没有输入用户名和密码");
//        }
//    }


}
