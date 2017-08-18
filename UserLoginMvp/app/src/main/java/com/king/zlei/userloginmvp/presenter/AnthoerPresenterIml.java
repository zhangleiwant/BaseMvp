package com.king.zlei.userloginmvp.presenter;

import com.king.zlei.userloginmvp.view.AnthoerBaseView;

/**
 * <b>Create Date:</b> 2017/8/17<br>
 * <b>Author:</b> Zhanglei<br>
 * <b>Description:</b> <br>
 */

public class AnthoerPresenterIml implements AnthoerPresenter {
    private AnthoerBaseView mAnthoerBaseView;

    @Override
    public void load() {
        //处理逻辑
    }

    @Override
    public void attchView(AnthoerBaseView view) {
        this.mAnthoerBaseView = view;
    }

    @Override
    public void destroyView(AnthoerBaseView view) {
        mAnthoerBaseView = null;
    }
}
