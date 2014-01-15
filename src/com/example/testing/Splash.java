package com.example.testing;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Splash extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		Thread timer = new Thread(){
		                  @Override
						public void run(){
		                try {
							sleep(5000);
						} catch (InterruptedException e) {
							// TODO: handle exception
							e.printStackTrace();
						}finally {
							Intent openStartingPoint = new Intent("com.example.testing.MainActivity");
							startActivity(openStartingPoint);
						}
		                	  }          
		};
			timer.start();	
		
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}

	
	
	
}
