package com.m_diary.wechatlogindemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.tencent.mm.sdk.modelmsg.SendAuth;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button wxLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wxLogin = (Button)findViewById(R.id.wxLogin);

        wxLogin.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.wxLogin:
                SendAuth.Req req = new SendAuth.Req();
                req.scope = "snsapi_userinfo";
                req.state = "wechat_sdk_demo_test";
                ((MainApplication)getApplication()).getWxAPI().sendReq(req);
                Toast.makeText(MainActivity.this, "请求微信登录", Toast.LENGTH_SHORT).show();
            break;
        }
    }
}
