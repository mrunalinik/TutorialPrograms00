package com.example.b19_activity1;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;

public class MainActivity extends ActionBarActivity {

	private final String TAG = "MainActivity";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//Loading the UI
		setContentView(R.layout.activity_main);
		
		Log.i(TAG, "oncreate is called");
	}
	
	@Override
	protected void onPause(){
		super.onPause();
		Log.i(TAG,"onPause is called");
	}
	
	@Override
	protected void onStop(){
		super.onStop();
		Log.i(TAG,"onStop is called");
	}

	
}
