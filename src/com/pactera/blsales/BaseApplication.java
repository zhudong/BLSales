package com.pactera.blsales;

import android.app.Application;

public class BaseApplication extends Application {
	
	public static BaseApplication mApplication;

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		mApplication = (BaseApplication) getApplicationContext();
		super.onCreate();
	}

	@Override
	public void onLowMemory() {
		// TODO Auto-generated method stub
		super.onLowMemory();
	}

	@Override
	public void onTerminate() {
		// TODO Auto-generated method stub
		super.onTerminate();
	}

}
