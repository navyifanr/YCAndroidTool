package com.yc.appstatuslib.listener;

public class BaseStatusListener implements AppStatusListener{

    /**
     * wifi状态监听
     * @param isWifiOn              true表示Wi-Fi可以打开，false表示关闭
     */
    @Override
    public void wifiStatusChange(boolean isWifiOn) {

    }

    /**
     * gps状态监听
     * @param isGpsOn               true表示gps可以打开，false表示关闭
     */
    @Override
    public void gpsStatusChange(boolean isGpsOn) {

    }

    /**
     * 网络状态监听
     * @param isConnect             true表示网络可以打开，false表示关闭
     */
    @Override
    public void networkStatusChange(boolean isConnect) {

    }

    /**
     * 屏幕状态监听
     * @param isScreenOn            true表示屏幕打开，false表示屏幕锁屏
     */
    @Override
    public void screenStatusChange(boolean isScreenOn) {

    }

    /**
     * 屏幕状态监听，userPresent表示屏幕打开并且使用呢
     */
    @Override
    public void screenUserPresent() {

    }

    /**
     * 蓝牙状态监听
     * @param isBluetoothOn         true表示蓝牙打开，false表示蓝牙断开连接
     */
    @Override
    public void bluetoothStatusChange(boolean isBluetoothOn) {

    }

    /**
     * app前后台状态监听
     * @param isBack                true表示在推到后台，false表示回到前台
     */
    @Override
    public void appOnFrontOrBackChange(boolean isBack) {

    }
}