package com.pactera.blsales.fragment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pactera.blsales.R;
import com.pactera.blsales.activity.MainActivity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class ClassFragment extends Fragment {

	private ExpandableListView kindListView;
	private MyExpandableListViewAdapter adapter;
	private List<String> listChild ;
	private List<Map<String, Object>> listGroup ;
	private String contentStr = "";

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		MainActivity.fragmentFlag = "ClassFragment";
		
		View view = inflater.inflate(R.layout.classic, null);
		kindListView = (ExpandableListView) view
				.findViewById(R.id.productKindListView);
		init();
		adapter = new MyExpandableListViewAdapter();
		kindListView.setAdapter(adapter);
		return view;
	}

	public void init() {
		listChild = new ArrayList<String>();
		listGroup = new ArrayList<Map<String, Object>>();
		String[] childData = { "全部", "寝具套件", "床单被罩", "床垫枕头", "夏凉用具", "家装布艺",
				"针棉制品", "男内衣", "女内衣", "男/女睡衣", "男袜", "女袜", "毛巾浴衣", "儿童内衣",
				"童袜", "服装服饰", "男式服装", "女式服装", "儿童服装", "衬衫", "御寒外套", "应季时装",
				"毛衣毛裤", "皮带", "领带" };
		int[] imgArrays = { R.drawable.menu01, R.drawable.menu02,
				R.drawable.menu03, R.drawable.menu04, R.drawable.menu05,
				R.drawable.menu06, R.drawable.menu07, R.drawable.menu08,
				R.drawable.menu09, R.drawable.menu10, R.drawable.menu11,
				R.drawable.menu12, R.drawable.menu13, R.drawable.menu14 };
		String[] titles = { "商圈选择", "品牌", "包装食品", "饮料烟酒", "副食", "粮油", "生鲜",
				"日配", "散装加工", "文体办公", "五金家电", "家居百货", "洗涤日化", "针纺服饰" };
		String[] contents = { "尼玛副食", "尼玛副食", "尼玛副食", "尼玛副食", "尼玛副食", "尼玛副食",
				"尼玛副食", "尼玛副食", "尼玛副食", "尼玛副食", "尼玛副食", "尼玛副食", "尼玛副食", "尼玛副食" };

		for (int i = 0; i < childData.length; i++) {
			listChild.add(childData[i]);
		}
		for (int i = 0; i < titles.length; i++) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("img", imgArrays[i]);
			map.put("title", titles[i]);
			map.put("content", contents[i]);
			listGroup.add(map);
		}

	}

	class MyExpandableListViewAdapter extends BaseExpandableListAdapter {

		private LayoutInflater inflater = (LayoutInflater) getActivity()
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		private MyGridViewAdapter gridAdapter;

		public Object getChild(int arg0, int arg1) {
			// TODO Auto-generated method stub
			return listChild.get(arg1);
		}

		public long getChildId(int arg0, int arg1) {
			// TODO Auto-generated method stub
			return arg1;
		}

		public View getChildView(int arg0, int arg1, boolean arg2, View arg3,
				ViewGroup arg4) {
			// TODO Auto-generated method stub
			View view = inflater.inflate(R.layout.product_kind_gridview, null);
			GridView gridView = (GridView) view.findViewById(R.id.gridView);
			gridAdapter = new MyGridViewAdapter(listChild);
			int count = gridAdapter.getCount();
			int row = 0;
			if(count % 5 == 0){
				row = count / 5;
			}else{
				row = count / 5 + 1;
			}
			AbsListView.LayoutParams lp = new AbsListView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, row * 85);
			view.setLayoutParams(lp);
			gridView.setAdapter(gridAdapter);
			return view;
		}

		public int getChildrenCount(int arg0) {
			// TODO Auto-generated method stub
			return 1;
		}

		public Object getGroup(int groupPosition) {
			// TODO Auto-generated method stub
			return listGroup.get(groupPosition);
		}

		public int getGroupCount() {
			// TODO Auto-generated method stub
			return listGroup.size();
		}

		public long getGroupId(int groupPosition) {
			// TODO Auto-generated method stub
			return groupPosition;
		}

		public View getGroupView(int groupPosition, boolean isExpanded,
				View convertView, ViewGroup parent) {
			// TODO Auto-generated method stub
			View view = inflater.inflate(R.layout.product_kind_item, null);
			((ImageView) view.findViewById(R.id.kindItemImg))
					.setImageResource((Integer) listGroup.get(groupPosition)
							.get("img"));
			((TextView) view.findViewById(R.id.bigKind)).setText(listGroup
					.get(groupPosition).get("title").toString());
			((TextView) view.findViewById(R.id.smallKind)).setText(listGroup
					.get(groupPosition).get("content").toString());
			return view;
		}

		public boolean hasStableIds() {
			// TODO Auto-generated method stub
			return false;
		}

		public boolean isChildSelectable(int groupPosition, int childPosition) {
			// TODO Auto-generated method stub
			return true;
		}

	}

	class MyGridViewAdapter extends BaseAdapter {

		private List<String> list;

		public MyGridViewAdapter(List<String> list) {
			super();
			this.list = list;
		}

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return list.size();
		}

		@Override
		public Object getItem(int arg0) {
			// TODO Auto-generated method stub
			return list.get(arg0);
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// TODO Auto-generated method stub
			LayoutInflater inflater = (LayoutInflater) getActivity()
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			if (convertView == null) {
				convertView = inflater.inflate(
						R.layout.product_kind_child_item, null);
			}
			TextView tv = (TextView) convertView
					.findViewById(R.id.childKindName);
			tv.setText(list.get(position).toString());
			tv.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					FragmentManager fMgr = getFragmentManager();
					FragmentTransaction fTran = fMgr.beginTransaction();
					ProductsFragment productsFragment = new ProductsFragment();
					fTran.replace(R.id.home_content, productsFragment);
					fTran.addToBackStack(null);
					fTran.commit();
				}
			});
			return convertView;
		}

	}
}
