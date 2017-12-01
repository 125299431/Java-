package 集合;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Set 接口
//		test1();
//		test2();
//		test3();
		test4();
	}
	
	static void test1() {
		HashSet<User> userInfo = new HashSet<User>();
		User u1 = new User("xiaoming", "123");
		User u2 = new User("xiaohuang", "23");
		userInfo.add(u1);
		userInfo.add(u2);
		
		User u3 = new User("xiaoming", "123");
		userInfo.add(u3);
		User u4 = new User("xiaogou", "1221");
		userInfo.add(u4);
		System.out.println(userInfo.size());
		
		Iterator<User> iterator = userInfo.iterator();
		while (iterator.hasNext()) {
			User user = iterator.next();
			System.out.println(user.getName());
		}
	}
	
	static void test2() {
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("123");
		hashSet.add("1232312");
		hashSet.add("123");
		hashSet.add("5432");
		
		Iterator<String> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	static void test3() {
		HashSet<Student> hashSet = new HashSet<>();
		hashSet.add(new Student("小花", 12));
		hashSet.add(new Student("小明", 20));
		hashSet.add(new Student("小猴", 124));
		
		Iterator<Student> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student);
		}
	}
	
	static void test4() {
		//按顺序存储的集合
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("123");
		linkedHashSet.add("222");
		linkedHashSet.add("444");
		
		Iterator<String> iterator = linkedHashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}

class User {
	private String name;
	private String age;
	public User() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public User(String name,String age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAge(String age) {
		this.age = age;
	}
	
	public String getAge() {
		return this.age;
	}
}

class Student {
	private String name;
	private int age;
	
	public Student() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public Student(String name, int age) {
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
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student[name = " + this.name + " age = " + this.age + "]";
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (!(obj instanceof Student)) {
			System.out.println("类型错误");
			return false;
		}
		Student student = (Student)obj;
		return (this.age == student.age && this.name.equals(student.name));
	}
}
