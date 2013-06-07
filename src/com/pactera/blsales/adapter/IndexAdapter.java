package com.pactera.blsales.adapter;

import java.util.List;

import com.pactera.blsales.R;
import com.pactera.blsales.fragment.ProductsFragment;
import com.pactera.blsales.model.Index;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

public class IndexAdapter extends BaseAdapter implements OnClickListener{
	private Context ctx;
	private List<Index> list;
	private LayoutInflater mInflater;
	private Fragment fragment;
	
	public IndexAdapter(Context context, List<Index> list, Fragment fragment){
		this.ctx = context;
		this.list = list;
		this.fragment = fragment;
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
		
//		AbsListView.LayoutParams p = new AbsListView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 70);
//		conView.setLayoutParams(p);
		
		Index index = list.get(arg0);
		holder.indexBtn.setText(index.getTagName());
		holder.indexBtn.setOnClickListener(this);
		return conView;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		FragmentManager fMgr = fragment.getFragmentManager();
		FragmentTransaction fTran = fMgr.beginTransaction();
		ProductsFragment productsFragment = new ProductsFragment();
		fTran.replace(R.id.home_content, productsFragment);
		fTran.addToBackStack(null);
		fTran.commit();
	}

	class ViewHolder{
		Button indexBtn;
	}
}
