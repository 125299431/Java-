package 构造方法;

public class Test1 {
	public static void main(String[] args) {
		Person person = new Person(10, "张三");
		person.speak();
	}
}

class Person {
	private int age;
	private String name;
	
	// 私有无参数的构造方法，即外界不能通过new Person();语句创建本类对象
	private Person() {
		
	}
	
	//可以重构
	Person(int a) {
		
	}
	
	Person(int a, String n) {
		// TODO Auto-generated constructor stub
		age = a;
		name = n;
	}
	
	public void speak() {
		System.out.println("name = " + name + " age = " + age);
	}
}
