package com.pactera.blsales.adapter;

import java.util.List;

import com.pactera.blsales.R;
import com.pactera.blsales.model.Product;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ProductsAdapter extends BaseAdapter {
	
	private Context ctx;
	private List<Product> list;
	private LayoutInflater mInflater;
	
	public ProductsAdapter(Context context, List<Product> list){
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
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		ViewHolder holder = new ViewHolder();
		if(convertView == null){
			convertView = mInflater.inflate(R.layout.products_item, null);
			
			holder.productIV = (ImageView) convertView.findViewById(R.id.products_item_product_iv);
			holder.productTag = (ImageView) convertView.findViewById(R.id.products_item_tag_iv);
			convertView.setTag(holder);
		}else{
			holder = (ViewHolder) convertView.getTag();
		}
		
		holder.productIV.setImageDrawable(ctx.getResources().getDrawable(R.drawable.list_img));
		return convertView;
	}

	class ViewHolder {
		ImageView productIV;
		ImageView productTag;
	}

}
