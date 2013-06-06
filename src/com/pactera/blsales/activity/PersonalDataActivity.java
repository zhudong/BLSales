package com.pactera.blsales.activity;

import com.pactera.blsales.R;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;

public class PersonalDataActivity extends BaseActivity implements OnClickListener{
	
	private LinearLayout backLayout;
	private TextView saveTV;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.personal_data);
		
		backLayout = (LinearLayout) findViewById(R.id.backLayout);
		backLayout.setOnClickListener(this);
		
		saveTV = (TextView) findViewById(R.id.saveTV);
		saveTV.setOnClickListener(this);
	}
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent intent = new Intent();
		switch(v.getId()){
		case R.id.backLayout:
			intent.setClass(PersonalDataActivity.this, PersonalActivity.class);
			startActivity(intent);
			finish();
			break;
		case R.id.saveTV:
			break;
		}
	}
	
}
