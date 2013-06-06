package com.pactera.blsales.activity;

import com.pactera.blsales.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;

public class ShareActivity extends BaseActivity implements OnClickListener{
	
	private LinearLayout xinLangLayout;
	private LinearLayout tencentLayout;
	private LinearLayout weixinLayout;
	private LinearLayout kaixinLayout;
	private LinearLayout renrenLayout;
	private LinearLayout duanxinLayout;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.share);
		
		xinLangLayout = (LinearLayout) findViewById(R.id.xinLangLayout);
		xinLangLayout.setOnClickListener(this);
		tencentLayout = (LinearLayout) findViewById(R.id.tencentLayout);
		tencentLayout.setOnClickListener(this);
		weixinLayout = (LinearLayout) findViewById(R.id.weixinLayout);
		weixinLayout.setOnClickListener(this);
		kaixinLayout = (LinearLayout) findViewById(R.id.kaixinLayout);
		kaixinLayout.setOnClickListener(this);
		renrenLayout = (LinearLayout) findViewById(R.id.renrenLayout);
		renrenLayout.setOnClickListener(this);
		duanxinLayout = (LinearLayout) findViewById(R.id.duanxinLayout);
		duanxinLayout.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent intent = new Intent(ShareActivity.this,ShareDetailActivity.class);
		Bundle bundle = new Bundle();
		switch(v.getId()){
		case R.id.xinLangLayout:
			bundle.putString("kind", getString(R.string.xinlange_weibo));
			break;
		case R.id.tencentLayout:
			bundle.putString("kind", getString(R.string.tencent_weibo));
			break;
		case R.id.weixinLayout:
			bundle.putString("kind", getString(R.string.weixin));
			break;
		case R.id.kaixinLayout:
			bundle.putString("kind", getString(R.string.kaixin_web));
			break;
		case R.id.renrenLayout:
			bundle.putString("kind", getString(R.string.renren_web));
			break;
		case R.id.duanxinLayout:
			bundle.putString("kind", getString(R.string.duanxin));
			break;
		}
		intent.putExtras(bundle);
		startActivity(intent);
		
	}
	
}
