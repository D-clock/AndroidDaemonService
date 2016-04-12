package com.clock.daemon.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class WakeReceiver extends BroadcastReceiver {

    private final static String TAG = WakeReceiver.class.getSimpleName();

    public final static String WAKE_ACTION = "com.clock.wake";

    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (WAKE_ACTION.equals(action)) {
            Log.i(TAG, "wake !! wake !! ");
        }
    }
}
