package com.adnan.logutil;

import android.util.Log;

public class LogDebug {
    private static final String TAG = "Tag";

    public static void d(String message) {
        Log.d(TAG, message);
    }
}
