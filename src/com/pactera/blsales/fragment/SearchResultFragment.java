package com.pactera.blsales.fragment;

import java.util.ArrayList;
import java.util.List;

import com.pactera.blsales.R;
import com.pactera.blsales.adapter.SearchAdapter;
import com.pactera.blsales.model.SearchResult;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.LinearLayout;
import android.widget.ListView;

public class SearchResultFragment extends Fragment implements OnItemClickListener, OnClickListener{
	
	private ListView searchList;
	private SearchAdapter searchAdapter;
	private LinearLayout backLayout;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.search_result, null);
		
		searchList = (ListView) view.findViewById(R.id.search_listview);
		backLayout = (LinearLayout) view.findViewById(R.id.backLayout);
		
		List<SearchResult> list = new ArrayList<SearchResult>();
		SearchResult result = new SearchResult();
		result.setProductName("测试数据");
		result.setProductCount("120个结果（测试数据）");
		list.add(result);
		list.add(result);
		list.add(result);
		list.add(result);
		list.add(result);
		list.add(result);
		list.add(result);
		
		searchAdapter = new SearchAdapter(getActivity(), list);
		searchList.setAdapter(searchAdapter);
		searchList.setOnItemClickListener(this);
		backLayout.setOnClickListener(this);
		return view;
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
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
		FragmentManager fMgr = getFragmentManager();
		FragmentTransaction fTran = fMgr.beginTransaction();
		HomeFragment homeFragment = new HomeFragment();
		fTran.replace(R.id.home_content, homeFragment);
		fTran.commit();
	}

}

