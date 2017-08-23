import java.awt.List;
import java.util.ArrayList;
public class Demo7 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
//		ArrayList<Phone> list = new ArrayList<Phone>();
		/*
		 * add()添加
		 * get()获取
		 * size()获取数组大小
		 * */
		list.add("one");
		list.add("two");
		list.add("three");
//		System.out.println(list.size());
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list);
//		//遍历数组
//		for (int i = 0; i < list.size(); i++) {
//			String string = list.get(i);
//			System.out.println(string);
//		}
		/*
		 * add(index,Object) //插入
		 * remove(index) //移除
		 * 
		 */
		list.add(0, "GO");
		System.out.println(list);
		list.set(1, "TO");
		list.remove(3);
		System.out.println(list);
		list.clear();
		System.out.println(list);
		
		
	}
}
