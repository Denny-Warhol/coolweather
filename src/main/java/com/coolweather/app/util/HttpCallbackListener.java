package com.coolweather.app.util;

/**
 * Created by doubled on 16/8/17.
 */
public interface HttpCallbackListener {

    void onFinish(String response);

    void onError(Exception e);
}
