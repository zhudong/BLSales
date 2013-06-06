package com.pactera.blsales.fragment;

import java.util.ArrayList;
import java.util.List;

import com.pactera.blsales.R;
import com.pactera.blsales.activity.MainActivity;
import com.pactera.blsales.activity.ProductDetailActivity;
import com.pactera.blsales.adapter.ProductsAdapter;
import com.pactera.blsales.model.Product;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.LinearLayout;

public class ProductsFragment extends Fragment implements OnItemClickListener, OnClickListener{
	
	private static final String TAG = "ProductsFragment";
	
	private GridView mGridView;
	private ProductsAdapter productAdapter;
	private LinearLayout backLayout;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.products_fragment, null);
		
		mGridView = (GridView) view.findViewById(R.id.products_gridview);
		backLayout = (LinearLayout) view.findViewById(R.id.backLayout);
		
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
		
		productAdapter = new ProductsAdapter(getActivity(), list);
		mGridView.setAdapter(productAdapter);
		mGridView.setOnItemClickListener(this);
		backLayout.setOnClickListener(this);
		return view;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		FragmentManager fMgr = getFragmentManager();
		FragmentTransaction fTran = fMgr.beginTransaction();
		HomeFragment homeFragment = new HomeFragment();
		fTran.replace(R.id.home_content, homeFragment);
		fTran.commit();
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		Log.d(TAG, "ProductsFragment item click");
		Intent intent = new Intent();
		intent.setClass(getActivity(), ProductDetailActivity.class);
		getActivity().startActivity(intent);
	}

}
