package cn.flyaudio.app;

import cn.flyaudio.otasdk.FlyFotaApplication;
import cn.flyaudio.otasdk.interfaces.IOtaSdkHelper;

/**
 * SDK初始化方式一：自定义Application类，继承OtaApplication类，然后实现initService方法
 * @author weifule
 * @date 19-7-1
 */
public class MyApplication extends FlyFotaApplication {


    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected void initService(IOtaSdkHelper helper) {

    }
}
