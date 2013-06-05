package com.pactera.blsales.fragment;

import com.pactera.blsales.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;

public class PersonalFragment extends Fragment {
	
	private TextView backTV;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.personal, null);
		
		backTV = (TextView) view.findViewById(R.id.backInMe);
		backTV.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
			
		});
		return view;
	}

}
