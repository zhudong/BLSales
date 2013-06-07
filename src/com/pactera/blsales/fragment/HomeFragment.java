package com.pactera.blsales.fragment;

import java.util.ArrayList;
import java.util.List;

import com.pactera.blsales.BaseApplication;
import com.pactera.blsales.R;
import com.pactera.blsales.activity.GetMaActivity;
import com.pactera.blsales.activity.MainActivity;
import com.pactera.blsales.adapter.HomeGalleryAdapter;
import com.pactera.blsales.adapter.IndexAdapter;
import com.pactera.blsales.model.Banner;
import com.pactera.blsales.model.Index;
import com.pactera.blsales.view.GalleryFlow;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Gallery;
import android.widget.GridView;
import android.widget.ImageView;

public class HomeFragment extends Fragment implements OnItemClickListener,
		OnClickListener {
	// private GalleryFlow mGallery;
	private static final String TAG = "HomeFragment";
	
	private Gallery mGallery;
	private HomeGalleryAdapter adapter;
	private IndexAdapter indexAdapter;
	private GridView mGridView;
	private ImageView getMaImg;
	private ImageView searchIV;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO 041291 Auto-generated method stub
		
		MainActivity.fragmentFlag = "HomeFragment";
		
		View view = inflater.inflate(R.layout.home, null);
		mGallery = (Gallery) view.findViewById(R.id.home_gallery);
		mGridView = (GridView) view.findViewById(R.id.home_index_gd);
		searchIV = (ImageView) view.findViewById(R.id.home_top_search_iv);
		getMaImg = (ImageView) view.findViewById(R.id.getMaImg);

		List<Banner> list = new ArrayList<Banner>();
		Banner banner = new Banner();
		list.add(banner);
		list.add(banner);
		list.add(banner);
		list.add(banner);
		list.add(banner);

		mGallery.setBackgroundColor(Color.TRANSPARENT);
		mGallery.setSpacing(-120);
		// mGallery.setMaxZoom(-60);
		// mGallery.setMaxRotationAngle(-60);
		mGallery.setFadingEdgeLength(0);
		mGallery.setGravity(Gravity.CENTER_VERTICAL);
		adapter = new HomeGalleryAdapter(getActivity(), list);
		mGallery.setAdapter(adapter);

		List<Index> indexList = new ArrayList<Index>();
		Index index0 = new Index();
		index0.setTagName("端午节");
		Index index1 = new Index();
		index1.setTagName("生鲜");
		Index index2 = new Index();
		index2.setTagName("猪肉");
		Index index3 = new Index();
		index3.setTagName("冰激凌");
		Index index4 = new Index();
		index4.setTagName("农夫山泉");
		Index index5 = new Index();
		index5.setTagName("粽子");
		Index index6 = new Index();
		index6.setTagName("卫浴用品");
		Index index7 = new Index();
		index7.setTagName("联合利华");
		indexList.add(index0);
		indexList.add(index1);
		indexList.add(index2);
		indexList.add(index3);
		indexList.add(index4);
		indexList.add(index5);
		indexList.add(index6);
		indexList.add(index7);

		indexAdapter = new IndexAdapter(getActivity(), indexList, this);
		mGridView.setAdapter(indexAdapter);
		mGridView.setOnItemClickListener(this);
		searchIV.setOnClickListener(this);
		getMaImg.setOnClickListener(this);
		return view;
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		Index index = (Index) indexAdapter.getItem(arg2);

		FragmentManager fMgr = getFragmentManager();
		FragmentTransaction fTran = fMgr.beginTransaction();
		ProductsFragment productsFragment = new ProductsFragment();
		fTran.replace(R.id.home_content, productsFragment);
		fTran.addToBackStack(null);
		fTran.commit();
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Log.d(TAG, "search click");
		Intent intent = new Intent();
		switch(v.getId()){
		case R.id.getMaImg:
			intent.setClass(getActivity(), GetMaActivity.class);
			startActivity(intent);
			break;
		case R.id.home_top_search_iv:
			FragmentManager fMgr = getFragmentManager();
			FragmentTransaction fTran = fMgr.beginTransaction();
			SearchResultFragment searchFragment = new SearchResultFragment();
			fTran.replace(R.id.home_content, searchFragment);
			fTran.addToBackStack(null);
			fTran.commit();
			break;
		}
		
	}

}
