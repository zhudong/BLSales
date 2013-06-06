package com.pactera.blsales.activity;

import com.pactera.blsales.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;

public class MoreActivity extends BaseActivity implements OnClickListener {

	private LinearLayout settingsLayout;
	private LinearLayout backLayout;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.more);

		settingsLayout = (LinearLayout) findViewById(R.id.more_settings_layout);
		backLayout = (LinearLayout) findViewById(R.id.backLayout);

		settingsLayout.setOnClickListener(this);
		backLayout.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.more_settings_layout:
			Intent intent = new Intent();
			intent.setClass(this, SettingsActivity.class);
			startActivity(intent);
			break;
		case R.id.backLayout:
			this.finish();
			break;
		default:
			break;
		}

	}

}
