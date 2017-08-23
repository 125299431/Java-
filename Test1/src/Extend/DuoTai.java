package Extend;

public class DuoTai {
	public static void main(String[] args) {
		Animal animal = new Dog();
		animal.eat();
	}
}

abstract class Animal {
	abstract void eat();
}

class Dog extends Animal {
	void eat() {
		System.out.println("吃饭");
	}
	
	void lookHome() {
		System.out.println("看家");
	}
}

