package com.king.zlei.userloginmvp.view;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.king.zlei.userloginmvp.R;
import com.king.zlei.userloginmvp.model.User;
import com.king.zlei.userloginmvp.presenter.MainPresenterIml;

public class MainActivity extends BaseActivity implements MainBaseView {

    private MainPresenterIml iml;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iml = new MainPresenterIml();
        iml.attchView(this);


        final EditText name = (EditText) findViewById(R.id.user_name);
        final EditText pwd = (EditText) findViewById(R.id.user_psd);
        findViewById(R.id.login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                User u = new User(name.getText()+"",pwd.getText()+"");
                iml.login(u);
            }
        });

    }

    @Override
    public void onShowSuccess(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onShowError(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        iml.destroyView(this);
    }
}
