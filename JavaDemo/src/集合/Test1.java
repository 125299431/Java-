package 集合;

import java.util.ArrayList;
import java.util.Collection;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//查看ArrayList类发现它继承了抽象类AbstractList同时实现接口List，而List接口又继承了Collection接口。Collection接口为最顶层集合接口了。
		/*
		 *  	Collecton接口常用的子接口有：List接口、Set接口
				List接口常用的子类有：ArrayList类、LinkedList类
				Set接口常用的子类有：HashSet类、LinkedHashSet类
		 */
		
		/*
		 * 创建集合的格式：
			方式1：Collection<元素类型> 变量名 = new ArrayList<元素类型>();
			方式2：Collection 变量名 = new ArrayList();
			方式1创建的集合，只能存储<>中指定的元素类型，该方式为常用方式
			方式2创建的集合，集合的元素类型默认为Object类型，即任何类型的元素都可以存储。

		 */
		Collection collection = new ArrayList();
		collection.add("itecases1");
		collection.add("itecases2");
		collection.add("itecases3");
		System.out.println(collection);
		
		collection.remove("itecases2");
		System.out.println(collection.contains("itecases2"));
		
		System.out.println(collection.size());
	}
	
	

}
