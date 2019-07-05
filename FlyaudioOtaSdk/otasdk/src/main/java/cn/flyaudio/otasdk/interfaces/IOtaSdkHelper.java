package cn.flyaudio.otasdk.interfaces;

public interface IOtaSdkHelper {

    /**
     * 初始化传入的系统信息
     * @param deviceid
     * @param systeminfo
     */
    void init(String deviceid,ISystemInfo systeminfo);

    /**
     * 设置升级包下载存储路径
     * 注明：建议使用API获取到这个路径
     *      若不设置，默认为/cache分区路径，android 8.1以后为/data/cache
     * @param path 路径
     */
    void setUpgradePath(String path);

    /**
     * 设置升级过程日志信息的生成路径
     * @param path 日志路径
     */
    void setLogPath(String path);

    /**
     * 设置日志级别
     * @param level 级别
     */
    void setLogLevel(int level);

    /**
     * 设置是否要进行自动检测
     * @param check 自动检查更新
     */
    void setAutoCheck(boolean check);

    /**
     * 设置静默升级时间段
     * @param starttime 开始时间
     * @param endtime 结束时间
     */
    void setSlientUpgradeTime(String starttime,String endtime);

}
