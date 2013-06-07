package com.pactera.blsales.activity;

import com.pactera.blsales.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class ProductDetailActivity extends BaseActivity implements OnClickListener{
	
	private LinearLayout backLayout;
	private ImageView shareImg;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.product_detail);
		backLayout = (LinearLayout) findViewById(R.id.product_detail_back_layout);
		
		backLayout.setOnClickListener(this);
		
		shareImg = (ImageView) findViewById(R.id.shareImg);
		shareImg.setOnClickListener(this);
	
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent intent = new Intent();
		if(v.getId()==R.id.shareImg){
			intent.setClass(ProductDetailActivity.this, ShareActivity.class);
			startActivity(intent);
		}else{
			
			this.finish();
		}
	}

}
