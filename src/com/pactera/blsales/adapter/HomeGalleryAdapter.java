package com.pactera.blsales.adapter;

import java.util.List;

import com.pactera.blsales.R;
import com.pactera.blsales.model.Banner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class HomeGalleryAdapter extends BaseAdapter {

	private Context ctx;
	private LayoutInflater mInflater;
	private List<Banner> list;
	
	public HomeGalleryAdapter(Context context, List<Banner> list){
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
		ViewHolder holder = null;
		if (conView == null) {
			holder = new ViewHolder();
			conView = mInflater.inflate(R.layout.home_gallery_item, null);
			
			holder.banner = (ImageView) conView.findViewById(R.id.home_gallery_banner);
			holder.tag = (ImageView) conView.findViewById(R.id.home_gallery_active);
			conView.setTag(holder);
		}else{
			conView = (View) conView.getTag();
		}
		
		Banner banner = list.get(arg0);
		holder.banner.setImageDrawable(ctx.getResources().getDrawable(R.drawable.banner01));
		holder.tag.setImageDrawable(ctx.getResources().getDrawable(R.drawable.tag));
		return conView;
	}

	class ViewHolder{
		ImageView banner;
		ImageView tag;
	}
}
