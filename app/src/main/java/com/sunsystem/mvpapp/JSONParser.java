package com.sunsystem.mvpapp;

import android.content.Context;
import timber.log.Timber;

/**
 * Created by steve on 6/15/16.
 */
public class JSONParser implements JSONParserContract {

    public JSONParser(Context context) {
        if(context != null) {
            Timber.d("mContext != null");
            /* Do some parsing here */
        }
        else {
            Timber.e("mContext == null");
        }
    }

    @Override
    public void parseJSONString() {
        /* Do parsing stuff here */
        Timber.d("parseJSONString");
    }
}
