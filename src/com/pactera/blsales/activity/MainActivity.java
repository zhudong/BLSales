package com.pactera.blsales.activity;

import com.pactera.blsales.R;
import com.pactera.blsales.R.layout;
import com.pactera.blsales.R.menu;
import com.pactera.blsales.fragment.HomeFragment;

import android.os.Bundle;
import android.app.Activity;
import android.app.FragmentTransaction;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends BaseActivity implements OnClickListener {

	private LinearLayout homeLayout;
	private LinearLayout classLayout;
	private LinearLayout nearbyLayout;
	private LinearLayout moreLayout;

	private ImageView homeIV;
	private ImageView classIV;
	private ImageView nearbyIV;
	private ImageView moreIV;
	private ImageView myIV;
	
	private FragmentTransaction mTran;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		homeLayout = (LinearLayout) findViewById(R.id.home_layout);
		classLayout = (LinearLayout) findViewById(R.id.class_layout);
		nearbyLayout = (LinearLayout) findViewById(R.id.nearby_layout);
		moreLayout = (LinearLayout) findViewById(R.id.more_layout);
		homeIV = (ImageView) findViewById(R.id.home_iv);
		classIV = (ImageView) findViewById(R.id.class_iv);
		nearbyIV = (ImageView) findViewById(R.id.nearby_iv);
		moreIV = (ImageView) findViewById(R.id.more_iv);
		myIV = (ImageView) findViewById(R.id.my_iv);

		mTran = getFragmentManager().beginTransaction();
		HomeFragment homeFragment = new HomeFragment();
		mTran.add(homeFragment, "home");
		mTran.addToBackStack(null);
		mTran.commit();
		
		homeLayout.setOnClickListener(this);
		classLayout.setOnClickListener(this);
		nearbyLayout.setOnClickListener(this);
		moreLayout.setOnClickListener(this);
		myIV.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO 041291 Auto-generated method stub
		switch (v.getId()) {
		case R.id.home_layout:
			homeIV.setImageResource(R.drawable.home_btn_pressed);
			classIV.setImageResource(R.drawable.class_btn_normal);
			nearbyIV.setImageResource(R.drawable.nearby_btn_normal);
			moreIV.setImageResource(R.drawable.more_btn_normal);
			break;
		case R.id.class_layout:
			homeIV.setImageResource(R.drawable.home_btn_normal);
			classIV.setImageResource(R.drawable.class_btn_pressed);
			nearbyIV.setImageResource(R.drawable.nearby_btn_normal);
			moreIV.setImageResource(R.drawable.more_btn_normal);
			break;
		case R.id.nearby_layout:
			homeIV.setImageResource(R.drawable.home_btn_normal);
			classIV.setImageResource(R.drawable.class_btn_normal);
			nearbyIV.setImageResource(R.drawable.nearby_btn_pressed);
			moreIV.setImageResource(R.drawable.more_btn_normal);
			break;
		case R.id.more_layout:
			homeIV.setImageResource(R.drawable.home_btn_normal);
			classIV.setImageResource(R.drawable.class_btn_normal);
			nearbyIV.setImageResource(R.drawable.nearby_btn_normal);
			moreIV.setImageResource(R.drawable.more_btn_pressed);
			break;
		case R.id.my_iv:
			homeIV.setImageResource(R.drawable.home_btn_normal);
			classIV.setImageResource(R.drawable.class_btn_normal);
			nearbyIV.setImageResource(R.drawable.nearby_btn_normal);
			moreIV.setImageResource(R.drawable.more_btn_normal);
			break;
		default:
			break;
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
