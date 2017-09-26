package com.project.ics.day0903coolweather.util;

/**
 * Created by Administrator on 2017/9/9.
 */

public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
