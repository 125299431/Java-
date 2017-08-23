
public class Person {
	private int age;
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAge(int age) {
		if (age > 120 ||  age < 0) {
			System.out.println("请输入正确的年龄");
			return;
		}
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void speak() {
		System.out.println("name:" + this.name + ", age :" + this.age);
	}
	
	public boolean eaulAge(Person p) {
		if (p.age == this.age) {
			System.out.println("两人的年龄一样");
		}else {
			System.out.println("两人的年龄bu一样");
		}
		return p.age == this.age;
	}
}

