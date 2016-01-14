package com.peyo.leanback.shortcut;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;

public class Browser extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Intent intent = new Intent();
		intent.setComponent(new ComponentName("com.android.browser", "com.android.browser.BrowserActivity"));
		startActivity(intent);
		finish();
	}
}
