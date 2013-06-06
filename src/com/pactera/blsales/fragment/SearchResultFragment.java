package com.pactera.blsales.fragment;

import java.util.ArrayList;
import java.util.List;

import com.pactera.blsales.R;
import com.pactera.blsales.adapter.SearchAdapter;
import com.pactera.blsales.model.SearchResult;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class SearchResultFragment extends Fragment implements OnItemClickListener{
	
	private ListView searchList;
	private SearchAdapter searchAdapter;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.search_result, null);
		
		searchList = (ListView) view.findViewById(R.id.search_listview);
		
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
		return view;
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		
	}

}

