package com.pactera.blsales.activity;

import java.util.ArrayList;
import java.util.List;

import com.pactera.blsales.R;
import com.pactera.blsales.adapter.CollectProductsAdapter;
import com.pactera.blsales.adapter.GetProductsAdapter;
import com.pactera.blsales.model.Product;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;
import android.widget.TextView;

public class PersonalMyGetActivity extends BaseActivity implements OnClickListener{
	
	private ListView productListGV;
	private GetProductsAdapter adapter;
	private TextView noExpiredTV;
	private TextView ExpiredTV;
	private boolean expiredState = false;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.personal_my_get);
		
		noExpiredTV = (TextView) findViewById(R.id.noExpiredTV);
		noExpiredTV.setOnClickListener(this);
		ExpiredTV = (TextView) findViewById(R.id.expiredTV);
		ExpiredTV.setOnClickListener(this);
		productListGV = (ListView) findViewById(R.id.productListView);
		adapter = new GetProductsAdapter(this, getList());
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
		switch(v.getId()){
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