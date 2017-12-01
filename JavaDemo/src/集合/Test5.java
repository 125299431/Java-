package 集合;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
	}
	
	static void test1() {
		List<String> list = new ArrayList<String>();
		//添加
		list.add("小花");
		list.add("小猫");
		list.add("老王");
		
		//插入
		list.add(1, "老李");
		
		//删除元素
		list.remove(2);
		
		//修改元素
		list.set(0, "小欧");
		
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String next =  iterator.next();
			//在迭代过程中，使用了集合的方法对元素进行操作。导致迭代器并不知道集合中的变化，容易引发数据的不确定性。
//			if (next.equals("小欧")) {
//				list.add("小猴");
//			}
			System.out.println(next);
		}
		
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
	}

}
