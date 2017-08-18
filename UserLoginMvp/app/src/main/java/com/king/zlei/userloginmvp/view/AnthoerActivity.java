package com.king.zlei.userloginmvp.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.king.zlei.userloginmvp.presenter.AnthoerPresenterIml;

/**
 * <b>Create Date:</b> 2017/8/17<br>
 * <b>Author:</b> Zhanglei<br>
 * <b>Description:</b> 别个activity<br>
 */

public class AnthoerActivity extends AppCompatActivity implements AnthoerBaseView {

    private AnthoerPresenterIml mAnthoerPresenterIml;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mAnthoerPresenterIml.attchView(this);

        mAnthoerPresenterIml.load();

    }

    @Override
    public void onShowLoading() {

    }

    @Override
    public void onShowProgress() {

    }

    @Override
    public void onShowMSg(String msg) {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mAnthoerPresenterIml.destroyView(this);
    }
}
