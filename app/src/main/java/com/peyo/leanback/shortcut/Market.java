package com.peyo.leanback.shortcut;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;

public class Market extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Intent intent = new Intent();
		intent.setComponent(new ComponentName("com.android.vending", "com.android.vending.AssetBrowserActivity"));
		startActivity(intent);
		finish();
	}
}
