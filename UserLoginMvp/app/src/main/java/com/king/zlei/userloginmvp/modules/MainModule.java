package com.king.zlei.userloginmvp.modules;

import com.king.zlei.userloginmvp.view.MainBaseView;

import dagger.Module;
import dagger.Provides;

/**
 * <b>Create Date:</b> 2017/8/22<br>
 * <b>Author:</b> Zhanglei<br>
 * <b>Description:</b> 提供参数<br>
 */

@Module
public class MainModule {
    private MainBaseView mBaseView;

    public MainModule(MainBaseView baseView) {
        mBaseView = baseView;
    }

    @Provides
    public MainBaseView provideMainBase() {//提供需要的参数
        return mBaseView;
    }
}
