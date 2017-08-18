package com.king.zlei.userloginmvp.view;

import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * <b>Create Date:</b> 2017/8/18<br>
 * <b>Author:</b> Zhanglei<br>
 * <b>Description:</b> <br>
 */

public class BaseActivity extends AppCompatActivity implements BaseView{

    @Override
    public void onShowMSg(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
