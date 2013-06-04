package com.pactera.blsales.fragment;

import com.pactera.blsales.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Gallery;


public class HomeFragment extends Fragment {
	private Gallery mGallery;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO 041291 Auto-generated method stub
		
		View view = inflater.inflate(R.layout.home, null);
		mGallery = (Gallery) view.findViewById(R.id.home_gallery);
		
//		mGallery.setAdapter(adapter)
		return view;
	}

}
