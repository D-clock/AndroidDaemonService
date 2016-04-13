package com.clock.daemon.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

/**
 * 灰色保活手段，利用各大app之间做互相唤醒
 *
 * @author Clock
 * @since 2016-04-12
 */
public class BlackService extends Service {

    private final static String TAG = BlackService.class.getSimpleName();

    @Override
    public void onCreate() {
        Log.i(TAG, "BlackService->onCreate");
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i(TAG, "BlackService->onStartCommand");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onDestroy() {
        Log.i(TAG, "BlackService->onDestroy");
        super.onDestroy();
    }
}
