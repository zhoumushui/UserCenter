package com.tchip.usercenter.util;

import com.tchip.usercenter.Constant;

import android.util.Log;

public class MyLog {
	private static boolean isDebug = Constant.isDebug;

	public static void e(String log) {
		if (isDebug)
			Log.e(Constant.TAG, log);
	}

	public static void v(String log) {
		if (isDebug)
			Log.v(Constant.TAG, log);
	}

	public static void d(String log) {
		if (isDebug)
			Log.d(Constant.TAG, log);
	}

	public static void i(String log) {
		if (isDebug)
			Log.i(Constant.TAG, log);
	}

	public static void w(String log) {
		if (isDebug)
			Log.w(Constant.TAG, log);
	}

}
