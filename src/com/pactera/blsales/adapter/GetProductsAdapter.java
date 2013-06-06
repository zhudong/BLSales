package com.pactera.blsales.adapter;

import java.util.List;

import com.pactera.blsales.R;
import com.pactera.blsales.model.Product;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class GetProductsAdapter extends BaseAdapter {
	
	private Context ctx;
	private LayoutInflater inflater;
	private List<Product> list;
	
	
	
	public GetProductsAdapter(Context ctx, List<Product> list) {
		super();
		this.ctx = ctx;
		this.list = list;
		this.inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	public View getView(int arg0, View view, ViewGroup viewGroup) {
		// TODO Auto-generated method stub
		if(view==null){
			view = inflater.inflate(R.layout.product_detail_item_get, null);
		}
		
		return view;
	}

}
