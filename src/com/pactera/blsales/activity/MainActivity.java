package com.pactera.blsales.activity;

import com.pactera.blsales.R;
import com.pactera.blsales.R.layout;
import com.pactera.blsales.R.menu;
import com.pactera.blsales.fragment.ClassFragment;
import com.pactera.blsales.fragment.HomeFragment;
import com.pactera.blsales.fragment.MoreFragment;
import com.pactera.blsales.fragment.NearbyFragment;
import com.pactera.blsales.fragment.PersonalFragment;

import android.os.Bundle;
import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends BaseActivity implements OnClickListener,
		OnTouchListener {
	private static final String TAG = "MainActivity";

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
		mTran.replace(R.id.home_content, homeFragment);
		mTran.commit();

		homeIV.setImageResource(R.drawable.home_btn_pressed);
		homeLayout.setOnClickListener(this);
		classLayout.setOnClickListener(this);
		nearbyLayout.setOnClickListener(this);
		moreLayout.setOnClickListener(this);
		// myIV.setOnClickListener(this);
		myIV.setOnTouchListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO 041291 Auto-generated method stub
		FragmentTransaction tran = getFragmentManager().beginTransaction();
		switch (v.getId()) {
		case R.id.home_layout:
			homeIV.setImageResource(R.drawable.home_btn_pressed);
			classIV.setImageResource(R.drawable.class_btn_normal);
			nearbyIV.setImageResource(R.drawable.nearby_btn_normal);
			moreIV.setImageResource(R.drawable.more_btn_normal);
			tran.replace(R.id.home_content, new HomeFragment());
			// tran.addToBackStack(null);
			tran.commit();
			break;
		case R.id.class_layout:
			homeIV.setImageResource(R.drawable.home_btn_normal);
			classIV.setImageResource(R.drawable.class_btn_pressed);
			nearbyIV.setImageResource(R.drawable.nearby_btn_normal);
			moreIV.setImageResource(R.drawable.more_btn_normal);
			tran.replace(R.id.home_content, new ClassFragment());
			// tran.addToBackStack(null);
			tran.commit();
			break;
		case R.id.nearby_layout:
//			homeIV.setImageResource(R.drawable.home_btn_normal);
//			classIV.setImageResource(R.drawable.class_btn_normal);
//			nearbyIV.setImageResource(R.drawable.nearby_btn_pressed);
//			moreIV.setImageResource(R.drawable.more_btn_normal);
//			tran.replace(R.id.home_content, new NearbyFragment());
//			// tran.addToBackStack(null);
//			tran.commit();
			Intent nearIntent = new Intent(MainActivity.this,
					NearbyActivity.class);
			startActivity(nearIntent);
			break;
		case R.id.more_layout:
			// homeIV.setImageResource(R.drawable.home_btn_normal);
			// classIV.setImageResource(R.drawable.class_btn_normal);
			// nearbyIV.setImageResource(R.drawable.nearby_btn_normal);
			Intent moreIntent = new Intent(MainActivity.this,
					MoreActivity.class);
			startActivity(moreIntent);
			break;
		case R.id.my_iv:
			// homeIV.setImageResource(R.drawable.home_btn_normal);
			// classIV.setImageResource(R.drawable.class_btn_normal);
			// nearbyIV.setImageResource(R.drawable.nearby_btn_normal);
			// moreIV.setImageResource(R.drawable.more_btn_normal);
			// tran.replace(R.id.home_content, new PersonalFragment());
			// tran.addToBackStack(null);
			// tran.commit();
			Intent intent = new Intent(MainActivity.this,
					PersonalActivity.class);
			startActivity(intent);
			break;
		default:
			break;
		}
	}

	private int currentX;

	private int currentY;
	private int beforeY;

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		// TODO 041291 Auto-generated method stub
		switch (event.getAction()) {
		case MotionEvent.ACTION_DOWN:
			currentX = (int) event.getRawX(); 
			currentY = (int) event.getRawY();
			beforeY = (int) v.getY();
			break;
		case MotionEvent.ACTION_UP:
			v.setY(beforeY);
			Intent intent = new Intent(MainActivity.this,
					PersonalActivity.class);
			startActivity(intent);
			break;
		case MotionEvent.ACTION_MOVE:
			int x2 = (int) event.getRawX();  
            int y2 = (int) event.getRawY();  
            currentX = x2;  
            currentY = y2; 
			int h = v.getHeight() / 2;
			if(y2 < 1000){
				y2 = 1000;
			}
			if(y2 > 1180){
				y2 = 1180;
			}
			myIV.setY(y2 - h - 50);  
//			int newY = (int) event.getY() - h;
			
//			if(newY < oldY){
//			}
			break;

		default:
			break;
		}
		return true;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
