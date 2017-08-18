package com.king.zlei.userloginmvp.model;

/**
 * <b>Create Date:</b> 2017/8/17<br>
 * <b>Author:</b> Zhanglei<br>
 * <b>Description:</b> <br>
 */

public class User {
    String name;
    String psd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPsd() {
        return psd;
    }

    public void setPsd(String psd) {
        this.psd = psd;
    }

    public User(String name, String psd) {

        this.name = name;
        this.psd = psd;
    }
}
