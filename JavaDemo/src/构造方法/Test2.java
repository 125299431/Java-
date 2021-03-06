package 构造方法;

public class Test2 {
	public static void main(String[] args) {
		Person1 person = new Person1("张三", 23);
		person.speak();
	}
}

//This调用构造方法
class Person1 {
	private String name;
	private int age;
	//无参数的构造方法
	Person1() {
		
	}
	
	//给姓名初始化的构造方法
	Person1(String na) {
		this.name = na;
	}
	
	//给姓名和年龄的初始化构造方法
	Person1(String na, int a) {
		this(na);
		age = a;
	}
	
	public void speak() {
		System.out.println("年龄 =" + age + " name = " + name);
	}
}
