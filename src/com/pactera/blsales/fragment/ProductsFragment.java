package com.pactera.blsales.fragment;

import java.util.ArrayList;
import java.util.List;

import com.pactera.blsales.R;
import com.pactera.blsales.adapter.ProductsAdapter;
import com.pactera.blsales.model.Product;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

public class ProductsFragment extends Fragment implements OnItemClickListener{
	
	private static final String TAG = "ProductsFragment";
	
	private GridView mGridView;
	private ProductsAdapter productAdapter;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.products_fragment, null);
		
		mGridView = (GridView) view.findViewById(R.id.products_gridview);
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
		return view;
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		Log.d(TAG, "ProductsFragment item click");
	}

}
