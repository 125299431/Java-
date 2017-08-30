package 关键字内部对象等;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo demo = new Demo();
		demo.num = 20;
		Demo demo1 = new Demo();
//		demo1.num = 30;
		System.out.println(demo1.num);
		System.out.println(Demo.num);
		Demo.method();
		
		System.out.println(Company.COMPANY_NAME);
		Company.method();
		
		//匿名对象
		new Person().eat();
		
		Person person = Demo1.getPerson();
		Demo1.method1(person);
	}

}

class Demo {
	public int count = 20;
	public static int num = 10;
	
	public static void method() {
		System.out.println("我是静态方法");
		//this.num; 不能使用this/super。
//		this.num;
		//静态方法只能访问静态变量
		System.out.println(num);
	}
}


/*
 * 
 * 	被static修饰的成员可以并且建议通过类名直接访问。
访问静态成员的格式：
类名.静态成员变量名
类名.静态成员方法名(参数)
对象名.静态成员变量名     	------不建议使用该方式，会出现警告
对象名.静态成员方法名(参数) 	------不建议使用该方式，会出现警告

 * 
 * /
 * 
 * */


class Company {
	//定义静态常量
	public static final String COMPANY_NAME = "WX";
	public static void method() {
		System.out.println("我是静态方法");
	}
}

interface Inter {
	/*
	 * 接口中的每个成员变量都默认使用public static final修饰。
	 */
	public static final int age = 10;
}

/*
 * 匿名对象
 */

class Person {
//		匿名对象可以作为方法接收的参数、方法返回值使用
	void eat() {
		System.out.println("人是需要吃饭的");
	}
}

class Demo1{
	public static Person getPerson() {
		return new Person();
	}
	
	public static void method1(Person person) {
		person.eat();
	}
}





