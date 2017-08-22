package com.king.zlei.userloginmvp.component;

import com.king.zlei.userloginmvp.modules.MainModule;
import com.king.zlei.userloginmvp.view.MainActivity;

import dagger.Component;

/**
 * <b>Create Date:</b> 2017/8/22<br>
 * <b>Author:</b> Zhanglei<br>
 * <b>Description:</b>提供注入 <br>
 */

@Component(modules = MainModule.class)
public interface MainComponent {
    void inject(MainActivity activity);//在哪个地方注入的
}
