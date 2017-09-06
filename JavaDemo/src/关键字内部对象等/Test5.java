package 关键字内部对象等;

import java.util.jar.Attributes.Name;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Per per = new Per(10);
		Per per1 = new Per();
	}

}

class Per {
	private String name;
	private int age;
	/*
	 * 特点：
	它优先于主方法执行、优先于构造代码块执行，当以任意形式第一次使用到该类时执行。
	该类不管创建多少对象，静态代码块只执行一次。
	可用于给静态变量赋值，用来给类进行初始化。
	 */
	static {
		//静态代码块
		System.out.println("静态代码块智行了");
	}
	{
		//构造代码块
		System.out.println("构造代码块");
	}
	
	Per() {
		System.out.println("Per无参数构造代码块");
	}
	
	Per(int age) {
		this.age = age;
		System.out.println("有参数构造代码块");
	}
}
