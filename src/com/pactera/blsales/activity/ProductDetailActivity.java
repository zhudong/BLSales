package com.pactera.blsales.activity;

import com.pactera.blsales.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;

public class ProductDetailActivity extends Activity implements OnClickListener{
	
	private LinearLayout backLayout;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.product_detail);
		backLayout = (LinearLayout) findViewById(R.id.product_detail_back_layout);
		
		backLayout.setOnClickListener(this);
	
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		this.finish();
	}

}
