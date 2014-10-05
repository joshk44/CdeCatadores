package com.clubdecatatores.reader;

import java.util.Timer;
import java.util.TimerTask;

import com.clubdecatatores.reader.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash_activity);

		new Timer().schedule(new TimerTask() {
			public void run() {
				// startActivity(new Intent(SplashActivity.this,
				// SignInActivity.class));
				startActivity(new Intent(SplashActivity.this,
						StandaloneExample.class));
				
			}
		}, 3000);
	}
	
}
