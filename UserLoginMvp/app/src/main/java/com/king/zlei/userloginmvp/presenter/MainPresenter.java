package com.king.zlei.userloginmvp.presenter;

import com.king.zlei.userloginmvp.model.User;
import com.king.zlei.userloginmvp.view.MainBaseView;

/**
 * <b>Create Date:</b> 2017/8/17<br>
 * <b>Author:</b> Zhanglei<br>
 * <b>Description:</b> <br>
 */

public interface MainPresenter extends BasePresenter<MainBaseView> {
    //单单是mainactivity的业务逻辑
    void login(User user);

}
