package 集合;

import java.util.LinkedList;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LinkedList
		LinkedList<String> linkedList = new LinkedList<String>();
		//添加元素
		linkedList.addFirst("abc");
		linkedList.addFirst("hghg");
		linkedList.addFirst("rere");
		
		//取出元素
		System.out.println(linkedList.getFirst());
		System.out.println(linkedList.getLast());
		
		//删除元素
		System.out.println(linkedList.removeFirst());
		
		while (!linkedList.isEmpty()) {
			System.out.println(linkedList.pop());//弹出集合中的栈顶元素
		}
	}

}
