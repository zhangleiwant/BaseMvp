package com.king.zlei.userloginmvp.presenter;

import android.text.TextUtils;

import com.king.zlei.userloginmvp.model.User;
import com.king.zlei.userloginmvp.view.MainBaseView;

import javax.inject.Inject;

/**
 * <b>Create Date:</b> 2017/8/18<br>
 * <b>Author:</b> Zhanglei<br>
 * <b>Description:</b> <br>
 */

public class MainPresenterIml extends BasePresenterIml<MainBaseView> implements MainPresenter {

    @Inject
    public MainPresenterIml(MainBaseView view) {//需要什么参数

    }

    @Override
    public void login(User user) {
        if (!TextUtils.isEmpty(user.getName())) {
            if (user.getName().equals("zhang") && user.getPsd().equals("123456")) {
                mBaseView.onShowSuccess("登陆成功");
            } else {
                mBaseView.onShowError("登录失败");
            }
        } else {
            mBaseView.onShowMSg("没有输入用户名和密码");
        }
    }
}
