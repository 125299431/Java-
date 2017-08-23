package 多态;

public class Test1 {
	public static void main(String[] args) {
		Animal animal = new Dog();
		animal.eat();
//		animal.lookHome();
		Dog dog = (Dog) animal;
		dog.lookHome();
	}
}

abstract class Animal {
	abstract void eat();
}

class Dog extends Animal {
	void eat() {
		System.out.println("狗狗要吃饭");
	}
	
	void lookHome() {
		System.out.println("狗狗在看家");
	}
}
