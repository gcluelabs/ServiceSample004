package com.example.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Broadcast Receiver
 */
public class ServiceSampleReceiver extends BroadcastReceiver {
	
	@Override
	public void onReceive(Context context,Intent intent) {				
		String msg = intent.getStringExtra("VALUE");
		Toast.makeText(context,msg,Toast.LENGTH_SHORT).show();
	}
}