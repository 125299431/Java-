package 多态;

public class Test1 {
	public static void main(String[] args) {
//		Animal animal = new Dog();
//		animal.eat();
////		animal.lookHome();
//		if (!animal instanceof Dog) {
//			System.out.println("类型不匹配，不能转");
//			return;
//		}
//		Dog dog = (Dog) animal;
//		dog.lookHome();
		b1 b = new b2();
		b.teach();
		b.diao();
		b2 a = (b2)b;
		a.watch();
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

class b1 {
	void teach() {
		System.out.println("毕姥爷讲课");
	}
	
	void diao() {
		System.out.println("毕姥爷钓鱼");
	}
}

class b2 extends b1 {
	void teach() {
		System.out.println("毕老师讲课");
	}
	
	void watch() {
		System.out.println("毕老师看电影");
	}
}




