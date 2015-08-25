package com.yystar.hoola.app;

import android.content.Context;
import android.widget.Toast;

public final class ActivityUtils {
	
	public static void showMessage(Context context, String msg) {
		Toast.makeText(context, msg, Toast.LENGTH_SHORT);
	}
}
