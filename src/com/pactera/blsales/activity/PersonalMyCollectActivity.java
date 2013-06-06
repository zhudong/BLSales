package com.pactera.blsales.activity;

import java.util.ArrayList;
import java.util.List;

import com.pactera.blsales.R;
import com.pactera.blsales.adapter.CollectProductsAdapter;
import com.pactera.blsales.model.Product;

import android.os.Bundle;
import android.widget.ListView;

public class PersonalMyCollectActivity extends BaseActivity {
	
	private ListView productListGV;
	private CollectProductsAdapter adapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.personal_my_collect);
		
		productListGV = (ListView) findViewById(R.id.productListView);
		adapter = new CollectProductsAdapter(this, getList());
		productListGV.setAdapter(adapter);
		
	}
	
	public List<Product> getList(){
		List<Product> list = new ArrayList<Product>();
		Product p = new Product();
		for(int i=0;i<20;i++){
			list.add(p);
		}
		return list;
	}
}
