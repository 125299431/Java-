package 集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test2 extends Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2.2	Iterator迭代方式
		test2();
	}
	
	static void  test2() {
		Collection<String> collection = new ArrayList<>();
		collection.add("abc1");
		collection.add("abc1");
		collection.add("abc1");
		collection.add("abc1");
		
		//获取迭代器对象
		Iterator iterator = collection.iterator();
		
		//使用迭代器对象 获取数组中的元素
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		
		for(Iterator iterator2 = collection.iterator(); iterator2.hasNext();) {
			System.out.println(iterator2.next());
		}
	}

}
