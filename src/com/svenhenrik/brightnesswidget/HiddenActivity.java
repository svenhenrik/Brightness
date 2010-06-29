package com.svenhenrik.brightnesswidget;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class HiddenActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.hidden);
		
		WindowManager.LayoutParams lp = getWindow().getAttributes();
		lp.screenBrightness = 1 / 255.0f;
		getWindow().setAttributes(lp);

	    Handler handler = new Handler(); 
	    handler.postDelayed(new Runnable() { 
	         public void run() { 
	        	 finish();
	         } 
	    }, 300); 

	}
}
