package com.pactera.blsales.activity;

import java.util.ArrayList;
import java.util.List;

import com.pactera.blsales.R;
import com.pactera.blsales.adapter.ProductsAdapter;
import com.pactera.blsales.fragment.HomeFragment;
import com.pactera.blsales.model.Product;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.AdapterView.OnItemClickListener;

public class NearbyActivity extends BaseActivity implements OnItemClickListener, OnClickListener {
	
	private GridView mGridView;
	private ProductsAdapter productAdapter;
	private LinearLayout backLayout;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.nearby);
		
		mGridView = (GridView) findViewById(R.id.products_gridview);
		backLayout = (LinearLayout) findViewById(R.id.backLayout);
		
		List<Product> list = new ArrayList<Product>();
		list.add(new Product());
		list.add(new Product());
		list.add(new Product());
		list.add(new Product());
		list.add(new Product());
		list.add(new Product());
		list.add(new Product());
		list.add(new Product());
		list.add(new Product());
		list.add(new Product());
		list.add(new Product());
		list.add(new Product());
		list.add(new Product());
		
		productAdapter = new ProductsAdapter(NearbyActivity.this, list);
		mGridView.setAdapter(productAdapter);
		mGridView.setOnItemClickListener(this);
		backLayout.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent intent = new Intent();
		intent.setClass(NearbyActivity.this, MainActivity.class);
		startActivity(intent);
		finish();
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		Intent intent = new Intent();
		intent.setClass(NearbyActivity.this, ProductDetailActivity.class);
		startActivity(intent);
	}
	
}
