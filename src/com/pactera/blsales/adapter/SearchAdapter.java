package com.pactera.blsales.adapter;

import java.util.List;

import com.pactera.blsales.R;
import com.pactera.blsales.model.SearchResult;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class SearchAdapter extends BaseAdapter {
	
	private Context ctx;
	private List<SearchResult> list;
	private LayoutInflater mInflater;
	
	public SearchAdapter(Context context, List<SearchResult> list){
		this.ctx = context;
		this.list = list;
		this.mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list != null ? list.size() : 0;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return list.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	public View getView(int arg0, View conView, ViewGroup arg2) {
		// TODO Auto-generated method stub
		ViewHolder holder = new ViewHolder();
		if(conView == null){
			conView = mInflater.inflate(R.layout.search_item, null);
			
			holder.searchProductName = (TextView) conView.findViewById(R.id.search_product_name);
			holder.searchProductCount = (TextView) conView.findViewById(R.id.search_product_count);
			
			conView.setTag(holder);
		}else{
			holder = (ViewHolder) conView.getTag();
		}
		
		SearchResult result = list.get(arg0);
		holder.searchProductName.setText(result.getProductName());
		holder.searchProductCount.setText(result.getProductCount());
		return conView;
	}

	class ViewHolder{
		TextView searchProductName;
		TextView searchProductCount;
	}
	
}
