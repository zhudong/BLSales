package com.pactera.blsales.activity;

import com.pactera.blsales.R;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;

public class SettingsActivity extends BaseActivity implements OnClickListener{
	
	private LinearLayout backLayout;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.settings);
		
		backLayout = (LinearLayout) findViewById(R.id.backLayout);
		backLayout.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.backLayout:
			this.finish();
			break;

		default:
			break;
		}
	}

	
}
