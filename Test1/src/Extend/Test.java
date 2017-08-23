package Extend;

public class Test {
	public static void main(String[] args) {
//		JavaEE javaEE = new JavaEE();
//		javaEE.setId("123");
//		javaEE.setName("张三");
//		javaEE.work();
		Fu11 fu = new Zi11();
//		System.out.println(fu.num);
		fu.show();
		
		Zi11 zi11 = new Zi11();
//		System.out.println(zi11.num);
		zi11.show();
	}
}

/*
 * 多态
 */

/*
 * 多态的成员变量 编译和运行都看左边
 * 多态的成员方法 编译看左边 运行看右边
 */
class Fu11 {
	int num = 10;
	void show() {
		System.out.println("Fu Show");
	}
}

class Zi11 extends Fu11 {
	int num = 8;
	void show() {
		System.out.println("Zi Show");
	}
}