package com.pactera.blsales.activity;

import java.util.ArrayList;
import java.util.List;

import com.pactera.blsales.R;
import com.pactera.blsales.adapter.CollectProductsAdapter;
import com.pactera.blsales.model.Product;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class PersonalMyCollectActivity extends BaseActivity implements
		OnClickListener {
	private LinearLayout backLayout;
	private ListView productListGV;
	private CollectProductsAdapter adapter;
	private TextView noExpiredTV;
	private TextView ExpiredTV;
	private boolean expiredState = false;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.personal_my_collect);
		
		backLayout = (LinearLayout) findViewById(R.id.backLayout);
		backLayout.setOnClickListener(this);
		noExpiredTV = (TextView) findViewById(R.id.noExpiredTV);
		noExpiredTV.setOnClickListener(this);
		ExpiredTV = (TextView) findViewById(R.id.expiredTV);
		ExpiredTV.setOnClickListener(this);
		productListGV = (ListView) findViewById(R.id.productListView);
		adapter = new CollectProductsAdapter(this, getList());
		productListGV.setAdapter(adapter);

	}

	public List<Product> getList() {
		List<Product> list = new ArrayList<Product>();
		Product p = new Product();
		for (int i = 0; i < 20; i++) {
			list.add(p);
		}
		return list;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent intent = new Intent();
		switch(v.getId()){
		case R.id.backLayout:
			intent.setClass(PersonalMyCollectActivity.this, PersonalActivity.class);
			startActivity(intent);
			finish();
			break;
		case R.id.noExpiredTV:
			if(expiredState){
				v.setBackgroundColor(getResources().getColor(android.R.color.white));
				((TextView)findViewById(R.id.expiredTV)).setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
			}
			expiredState = false;
			break;
		case R.id.expiredTV:
			if(!expiredState){
				v.setBackgroundColor(getResources().getColor(android.R.color.white));
				((TextView)findViewById(R.id.noExpiredTV)).setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
			}
			expiredState = true;
			break;
		}
	}
}
