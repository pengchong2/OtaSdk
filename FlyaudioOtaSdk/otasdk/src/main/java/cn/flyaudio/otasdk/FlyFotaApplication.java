package cn.flyaudio.otasdk;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import androidx.annotation.NonNull;
import java.io.File;
import cn.flyaudio.otasdk.interfaces.IOtaSdkHelper;


public abstract class FlyFotaApplication extends Application {

    private static FlyFotaApplication application;
    private IOtaSdkHelper helper;
    private static File packageFile = null;

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
        initOtaService();
    }

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    public static FlyFotaApplication getApplication(){
        return application;
    }

    protected abstract void initService(IOtaSdkHelper helper);

    /**
     * 初始化Ota服务
     */
    public void initOtaService(){
        //TODO 初始化SDK服务
        helper = new FlyFotaSdkHelperImpl();
        initService(helper);
    }

    /**
     * 升级包的下载路径
     * @return
     */
    public static File getPackageFile() {
        return packageFile;
    }


}
