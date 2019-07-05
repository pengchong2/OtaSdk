package cn.flyaudio.otasdk;

import android.content.Context;
import android.content.res.Configuration;
import cn.flyaudio.otasdk.interfaces.IOtaSdkHelper;

public class FlyFotaApplicationInit {

    private static FlyFotaApplicationInit.IOtaListener listener;
    private static Context mContext;

    public FlyFotaApplicationInit() {

    }

    public static void attachBaseContext(Context context, FlyFotaApplicationInit.IOtaListener iOtaListener) {
        listener = iOtaListener;
        mContext = context;
    }

    public static void onCreate() {
        IOtaSdkHelper helper = new FlyFotaSdkHelperImpl();
        if (listener != null){
            listener.initService(helper);
        }
    }

    public static void onConfigurationChanged(Configuration newConfig) {

    }

    public interface IOtaListener {
        void initService(IOtaSdkHelper helpr);
    }

}
