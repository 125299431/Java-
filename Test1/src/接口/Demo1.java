package 接口;


public class Demo1 {
	public static void main(String[] args) {
		Person person = new Person();
		boolean iSBelong = person instanceof Person;
		System.out.println(iSBelong );
		Student student = new Student();
		boolean isBelong2 = student instanceof Person;
		System.out.println(isBelong2);
	}
	
}

class Person{
	
}

class Student extends Person {
	
}
