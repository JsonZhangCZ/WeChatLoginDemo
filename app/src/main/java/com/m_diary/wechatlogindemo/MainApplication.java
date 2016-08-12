package com.m_diary.wechatlogindemo;

import android.app.Application;

import com.tencent.mm.sdk.openapi.IWXAPI;
import com.tencent.mm.sdk.openapi.WXAPIFactory;

/**
 * Created by zhou on 2016/8/11 0011.
 */
public class MainApplication extends Application{
    private IWXAPI wxAPI;
    @Override
    public void onCreate() {
        super.onCreate();
        wxAPI = WXAPIFactory.createWXAPI(this,"wx77b4e5ed16f3ebc0",true);
        wxAPI.registerApp("wx77b4e5ed16f3ebc0");
    }
}
