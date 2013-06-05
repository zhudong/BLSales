package com.pactera.blsales.activity;

import com.pactera.blsales.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;

public class PersonalActivity extends Activity{
	private LinearLayout backTV;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.personal);
		
		backTV = (LinearLayout) findViewById(R.id.backInMe);
		backTV.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(PersonalActivity.this,MainActivity.class);
				startActivity(intent);
			}
		});
	}
	
}
