package 集合;

import java.util.ArrayList;
import java.util.Collection;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		test1();
		test2();
	}
	
	static void test1() {
		//遍历数字
		int[] arr = new int[]{1,22,333};
		for(int i : arr){
			System.out.println(i);
		}
	}
	
	static void test2() {
		//遍历集合
		Collection<String> collection = new ArrayList<String>();
		collection.add("aaa");
		collection.add("bbb");
		collection.add("ccc");
		for(String string : collection) {
			System.out.println(string);
		}
	}

}
