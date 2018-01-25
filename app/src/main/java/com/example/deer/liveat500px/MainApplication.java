package com.example.deer.liveat500px;

import android.app.Application;

import com.inthecheesefactory.thecheeselibrary.manager.Contextor;

/**
 * Created by Deer on 4/5/2017 AD.
 */

public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Initialize thing(s) here
        Contextor.getInstance().init(getApplicationContext());
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
