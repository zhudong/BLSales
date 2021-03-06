package com.pactera.blsales.activity;

import com.pactera.blsales.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;

public class ChangePasswordActivity extends BaseActivity implements OnClickListener{
	
	private LinearLayout backLayout;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.change_password);
		
		backLayout = (LinearLayout) findViewById(R.id.backLayout);
		backLayout.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent intent = new Intent();
		switch(v.getId()){
		case R.id.backLayout:
			intent.setClass(ChangePasswordActivity.this, PersonalActivity.class);
			startActivity(intent);
			finish();
			break;
		}
	}
	
}
