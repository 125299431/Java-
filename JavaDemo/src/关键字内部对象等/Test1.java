package 关键字内部对象等;

import java.util.concurrent.FutureTask;

public class Test1 {
	public static void main(String[] args) {
		/*
		 * 引用类型的变量值为对象地址值，地址值不能更改，但是地址内的对象属性值可以修改。
		 * */
	    final Fu fu = new Fu();
		Fu fu1 = new Fu();
//		fu = fu1;//报错
		fu.age = 20;
	}
}

/*
 * final关键字
 * */
class Yy {
	
}

final class Fu extends Yy{
	int age;
}

//不能继承Fu类
//class Zi extends Fu{
//	
//}

class Fu1 {
	/*
	 *	final修饰的变量称为常量，这些变量只能赋值一次。
	 * */
	final int age = 10;
	public final void method1() {
//		age = 20;
	}
	
	public void method2() {
		
	}
}

class Zi1 extends Fu1 {
	/*
	 * 不能重写被final修饰的method1方法
	 * 修饰成员变量，需要在创建对象前赋值，否则报错。(当没有显式赋值时，多个构造方法的均需要为其赋值。)
	 */
//	public void method1() {
//		
//	}
	/*
	 * 可以重写method2方法 并用final修饰
	 */
	public final void method2() {
		
	}
}










