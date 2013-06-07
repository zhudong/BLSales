package com.pactera.blsales.activity;

import com.pactera.blsales.R;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ShareDetailActivity extends BaseActivity implements OnClickListener{
	
	private LinearLayout backLayout;
	private EditText contentET;
	private TextView titleTV;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.share_detail);
		
		
		backLayout = (LinearLayout) findViewById(R.id.backLayout);
		backLayout.setOnClickListener(this);
		
		Intent intent = getIntent();
		Bundle bundle = intent.getExtras();
		
		titleTV = (TextView) findViewById(R.id.textView1);
		titleTV.setText(bundle.getString("kind"));
		
		contentET = (EditText) findViewById(R.id.shareContent);

//		InputMethodManager imm = (InputMethodManager) getApplicationContext().getSystemService(Context.INPUT_METHOD_SERVICE); 
//		imm.toggleSoftInput(0, InputMethodManager.SHOW_FORCED); 
		
		contentET.setFocusable(true);
		contentET.setFocusableInTouchMode(true);
		contentET.requestFocus();
	}
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent intent = new Intent();
		switch(v.getId()){
		case R.id.backLayout:
			intent.setClass(ShareDetailActivity.this, ShareActivity.class);
			startActivity(intent);
			finish();
			break;
		}
	}

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		Intent intent = new Intent();
		intent.setClass(ShareDetailActivity.this, ShareActivity.class);
		startActivity(intent);
		finish();
	}
	
	
}
