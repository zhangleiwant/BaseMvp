package com.king.zlei.userloginmvp;

import com.king.zlei.userloginmvp.view.MainActivity;

import dagger.Component;

/**
 * <b>Create Date:</b> 2017/8/21<br>
 * <b>Author:</b> Zhanglei<br>
 * <b>Description:</b> <br>
 */

@Component
public interface MainComponent {

    void inject(MainActivity activity);
}
