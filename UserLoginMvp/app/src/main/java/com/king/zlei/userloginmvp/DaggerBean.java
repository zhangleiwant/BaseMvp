package com.king.zlei.userloginmvp;

import javax.inject.Inject;

/**
 * <b>Create Date:</b> 2017/8/21<br>
 * <b>Author:</b> Zhanglei<br>
 * <b>Description:</b> <br>
 */

public class DaggerBean {
    public String text;

    @Inject
    public DaggerBean() {
        text = "你好啊";
    }

    public String getText() {
        return text;
    }
}
