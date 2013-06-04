package com.pactera.blsales.fragment;

import java.util.ArrayList;
import java.util.List;

import com.pactera.blsales.BaseApplication;
import com.pactera.blsales.R;
import com.pactera.blsales.adapter.HomeGalleryAdapter;
import com.pactera.blsales.model.Banner;
import com.pactera.blsales.view.GalleryFlow;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HomeFragment extends Fragment {
	private GalleryFlow mGallery;
	private HomeGalleryAdapter adapter;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO 041291 Auto-generated method stub

		View view = inflater.inflate(R.layout.home, null);
		mGallery = (GalleryFlow) view.findViewById(R.id.home_gallery);
		

		List<Banner> list = new ArrayList<Banner>();
		Banner banner = new Banner();
		list.add(banner);
		list.add(banner);
		list.add(banner);
		list.add(banner);
		list.add(banner);
		
		mGallery.setBackgroundColor(Color.TRANSPARENT);
		mGallery.setSpacing(-120);
		mGallery.setMaxZoom(120);
		mGallery.setMaxRotationAngle(-60);
		mGallery.setFadingEdgeLength(0);
		mGallery.setGravity(Gravity.CENTER_VERTICAL);
		adapter = new HomeGalleryAdapter(getActivity(), list);
		mGallery.setAdapter(adapter);
		return view;
	}

}
