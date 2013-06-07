package com.pactera.blsales.activity;

import com.pactera.blsales.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;

public class PersonalActivity extends BaseActivity implements OnClickListener{
	private LinearLayout backTV;
	private LinearLayout myData;
	private LinearLayout changePassword;
	private LinearLayout myCollect;
	private LinearLayout myCare;
	private LinearLayout myGet;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.personal);
		
		backTV = (LinearLayout) findViewById(R.id.backInMe);
		backTV.setOnClickListener(this);
		
		myData = (LinearLayout)findViewById(R.id.myData);
		myData.setOnClickListener(this);
		
		changePassword = (LinearLayout) findViewById(R.id.changePassword);
		changePassword.setOnClickListener(this);
		
		myCollect = (LinearLayout) findViewById(R.id.myCollection);
		myCollect.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(PersonalActivity.this,PersonalMyCollectActivity.class);
				startActivity(intent);
			}
		});
		
		myCollect = (LinearLayout) findViewById(R.id.myCare);
		myCollect.setOnClickListener(this);
		myCollect = (LinearLayout) findViewById(R.id.myGet);
		myCollect.setOnClickListener(this);
		
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent intent = new Intent();
		switch(v.getId()){
		case R.id.backInMe:
			intent.setClass(PersonalActivity.this,MainActivity.class);
			startActivity(intent);
			finish();
			break;
		case R.id.myData:
			intent.setClass(PersonalActivity.this,PersonalDataActivity.class);
			startActivity(intent);
			break;
		case R.id.changePassword:
			intent.setClass(PersonalActivity.this,ChangePasswordActivity.class);
			startActivity(intent);
			break;
		case R.id.myCollection:
			intent.setClass(PersonalActivity.this,PersonalMyCollectActivity.class);
			startActivity(intent);
			break;
		case R.id.myCare:
			intent.setClass(PersonalActivity.this, PersonalMyCareActivity.class);
			startActivity(intent);
			break;
		case R.id.myGet:
			intent.setClass(PersonalActivity.this, PersonalMyGetActivity.class);
			startActivity(intent);
			break;
		}
	}
	
}
