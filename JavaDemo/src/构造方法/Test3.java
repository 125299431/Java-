package 构造方法;

import java.util.jar.Attributes.Name;

public class Test3 {
	public static void main(String[] args) {
//		Fu fu = new Fu();
//		Zi zi = new Zi();
		
//		Student student = new Student("Kim", 23);
//		student.study();
		
//		Worker worker = new Worker("Tom", 35);
//		worker.work();
		
		JavaEE javaEE = new JavaEE("Jone", "123003");
		javaEE.work();
		
		NetWork netWork = new NetWork("Kone", "2342");
		netWork.work();
		
		
	}
}

class Fu {
	int num;
	Fu() {
		// TODO Auto-generated constructor stub
		System.out.println("Fu 构造 num = " + num);
		num = 8;
	}
}

class Zi extends Fu {
	Zi() {
		// TODO Auto-generated constructor stub
//		super();
		System.out.println("Zi 构造 num = " + num);
	}
}

class Per {
	private int age;
	private String name;
	public Per(String name, int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
}

class Student extends Per {
	public Student(String name, int age) {
		// TODO Auto-generated constructor stub
		super(name, age);
	}
	
	void study() {
		System.out.println(this.getName() + " is studing");
	}
}

class Worker extends Per {
	public Worker(String name, int age) {
		// TODO Auto-generated constructor stub
		super(name, age);
	}
	
	void work() {
		System.out.println(this.getName() + "is working");
	}
}





