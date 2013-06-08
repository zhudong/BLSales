package com.pactera.blsales.fragment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pactera.blsales.R;
import com.pactera.blsales.activity.MainActivity;

import android.R.color;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.graphics.Color;
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
	private List<List<String>> listChild ;
	private List<Map<String, Object>> listGroup ;
	private List<String[]> listData;
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
		listChild = new ArrayList<List<String>>();
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
		listData= new ArrayList<String[]>(); 
		
		String []data1 ={"黄浦区","卢湾区","徐汇区","长宁区","静安区","普陀区"};
		String []data2={"可口可乐","ONLY","奥妙蓝","月亮","NIKE","苏泊尔"};
		String []data3 = {"膨化食品","干果炒货","果脯蜜饯","脯食品鱼片","饼干糕点","饼干","派类","糕点","曲奇","糖果","香口胶","巧克力","硬糖","软糖","果冻","冲调食品","奶/豆粉麦片/餐糊茶叶","夏凉饮品","功能糖","固体咖啡","藕粉/羹","参茸滋补浓缩保健","减肥食品"};
		String []data4 ={"饮料","碳酸饮料","饮用水茶饮/咖啡","果汁","功能饮料","常温奶品","国产白酒","葡萄/色酒","啤酒功能酒","进口酒","其他"};
		String []data5={"罐头","水果罐头","农产罐头","畜产罐头","水产罐头","果酱","沙拉酱","调味制品","味料","味汁","调味酱","土产干货","农产干货","水产干货","畜产干货","酱菜","酱菜","腐乳"};
		String []data6={"速食品","方便面","方便粥/饭","速食调理","米面类","杂粮类","粮食制品","花生油","调和油","色拉油","粟米油","菜籽油 "};
		String []data7={"猪肉及分割","猪肉加工品","牛肉及分割","牛肉加工品","羊肉及分割","羊肉及加工品","禽类及分割","禽类加工品","淡水鱼类","海水鱼类","虾蟹贝龟","水产制品","水发制品","蔬菜","水果","干菜","熟食制品","速食制品"};
		String []data8={"面包主食","面包西点","主食面点","熟食制品","豆制小菜","半成品","素食制品鲜奶","发酵奶","调味奶","奶油乳酪","蛋品类","速冻面点","微波食品","肉类制品","水产制品","蔬菜制品","冰棒雪糕","保鲜果汁","鲜果汁","鲜菜汁"};
		String []data9={"散装蜜饯","散装干果","散装糖果","散装干货","散装茶叶","散装糕点","散装粮","散装油 "};
		String []data10={"文具","纸张本册","档案用品","办公器材","通讯器材","工艺/礼品","相册相架","娱乐用品","球类球具","运动器材","塑料玩具","布绒玩具","拼装玩具","电动玩具","仿真玩具","童车童床","益智玩具"};
		String []data11={"灯具照明","电工电料","家用五金","汽摩用品","维修工具","随身听","游戏机","精品小家电","热水器","灶具"};
		String []data12={"家用厨具","餐具茶具","不锈钢制品","搪铝制品","玻璃制品","塑料制品","家用耗品","家用杂品","休闲用品","拼装家具","竹木藤具","室内装饰","雨具伞具","工艺盆栽","成人箱包","学生包","旅行箱包","休闲包","钥匙/钱包"};
		String []data13={"洗浴用品","洗发用品","美发护发","美容化妆润护品","个人洁护","功能液/皂","婴幼用品","洗衣粉","衣物护理","居室清洁剂","厨房清洁剂","浴厕清洁剂","皮革养护剂","洗衣皂","餐/面/湿巾","卫生巾护垫","家用卷纸","成人保健一次性用品","杀虫片/剂杀虫器/具","防虫用品","芳香剂","除湿用品"};
		String []data14={"寝具套件","床单被罩","床垫枕头","夏凉用具","被/褥/枕/垫","家装布艺","男内衣/裤","女内衣/裤","男/女睡衣","男袜","女袜","毛巾浴巾","儿童内衣","童袜","男式服装","女式服装","儿童服装","衬衫","御寒外套","应季时装","毛衣毛裤","皮带","领带","男式皮鞋","女式皮鞋","童鞋","拖鞋","旅游鞋便鞋","休闲鞋","功能鞋具"};
		listData.add(data1);
		listData.add(data2);
		listData.add(data3);
		listData.add(data4);
		listData.add(data5);
		listData.add(data6);
		listData.add(data7);
		listData.add(data8);
		listData.add(data9);
		listData.add(data10);
		listData.add(data11);
		listData.add(data12);
		listData.add(data13);
		listData.add(data14);
		for(int j = 0;j<listData.size();j++){
			String [] st = listData.get(j);
			List<String> li = new ArrayList<String>();
			for (int i = 0; i < st.length; i++) {
				li.add(st[i]);
			}
			listChild.add(li);
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
			gridAdapter = new MyGridViewAdapter(listChild.get(arg0));
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
			if(convertView==null){
				convertView = inflater.inflate(R.layout.product_kind_item, null);
			}
			((ImageView) convertView.findViewById(R.id.kindItemImg))
					.setImageResource((Integer) listGroup.get(groupPosition)
							.get("img"));
			((TextView) convertView.findViewById(R.id.bigKind)).setText(listGroup
					.get(groupPosition).get("title").toString());
			
			String[] con = listData.get(groupPosition);
			((TextView) convertView.findViewById(R.id.smallKind)).setText(arrayToString(con));
			if(isExpanded){
				convertView.setBackground(getResources().getDrawable(R.drawable.menu_open));
//				convertView.setBackgroundDrawable(background);
			}else{
				convertView.setBackgroundColor(Color.WHITE);
			}
			return convertView;
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
	
	public String arrayToString(String[] str){
		String s="";
		if(str!=null){
			for(int i=0;i<str.length;i++){
				if(i==0){
					s=s+str[i];
				}else{
					s=s+" \\ "+str[i];
				}
			}
		}
		return s;
	};
}
