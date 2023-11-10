package com.rnautomatictimedetection;

import androidx.annotation.NonNull;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;

import android.provider.Settings;
import android.os.Build;

public class RNAutomaticTimeDetectionModule extends NativeAutomaticTimeDetectionSpec {

    public static String NAME = "RNAutomaticTimeDetection";

    RNAutomaticTimeDetectionModule(ReactApplicationContext context) {
        super(context);
    }

    @Override
    @NonNull
    public String getName() {
        return NAME;
    }

    @Override
    public void isAutomaticTimeEnabled(Promise promise) {
        boolean enabled;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            enabled = Settings.Global.getInt(getReactApplicationContext().getContentResolver(), Settings.Global.AUTO_TIME, 0) == 1;
        } else {
            enabled = Settings.System.getInt(getReactApplicationContext().getContentResolver(), Settings.System.AUTO_TIME, 0) == 1;
        }
        promise.resolve(enabled);
    }

    @Override
    public void isAutomaticTimeZoneEnabled(Promise promise) {
        boolean enabled;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            enabled = Settings.Global.getInt(getReactApplicationContext().getContentResolver(), Settings.Global.AUTO_TIME_ZONE, 0) == 1;
        } else {
            enabled = android.provider.Settings.System.getInt(getReactApplicationContext().getContentResolver(), android.provider.Settings.System.AUTO_TIME_ZONE, 0) == 1;
        }
        promise.resolve(enabled);
    }
}