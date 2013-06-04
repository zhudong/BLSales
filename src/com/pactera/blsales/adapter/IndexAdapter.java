package com.pactera.blsales.adapter;

import java.util.List;

import com.pactera.blsales.R;
import com.pactera.blsales.model.Index;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

public class IndexAdapter extends BaseAdapter {
	private Context ctx;
	private List<Index> list;
	private LayoutInflater mInflater;
	
	public IndexAdapter(Context context, List<Index> list){
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
			conView = mInflater.inflate(R.layout.index_item, null);
			
			holder.indexBtn = (Button) conView.findViewById(R.id.home_index_ib);
			conView.setTag(holder);
		}else{
			holder = (ViewHolder) conView.getTag();
		}
		
		Index index = list.get(arg0);
		holder.indexBtn.setText(index.getTagName());
		return conView;
	}

	class ViewHolder{
		Button indexBtn;
	}
}
