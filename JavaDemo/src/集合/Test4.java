package 集合;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//泛型
//		test1();
		test2();
	}
	
	static void test1() {
//		List list = new ArrayList();
//		list.add("abc");
//		list.add("ffnejw");
//		list.add(5);
		//toArray该方法，用来把集合元素存储到指定数据类型的数组中，返回已存储集合元素的数组
		ArrayList<String> list = new ArrayList<String>();
		String[] stringArr = new String[100];
		String[] result = list.toArray(stringArr);//此时的元素是String类型
		
		Integer[] intArr = new Integer[100];
		Integer[] result2 = list.toArray(intArr); //此时的元素是Integer类型
		
	}
	
	static void test2() {
		/*
		 * 	将运行时期的ClassCastException，转移到了编译时期变成了编译失败。
			避免了类型强转的麻烦。
		 */
		List<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("fesd");
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	//泛型的通配符<?>
	static void printCollection(Collection<?> list){
		Iterator<?> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
