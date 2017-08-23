
public class Demo10 {
	public static void main(String[] args) {
//		Developer de = new Developer();
//		de.work();
//		de.printName();
		
//		Wa wa = new Wa();
//		wa.star();
		NewPhone newPhone = new NewPhone();
		newPhone.show();
	}

}

class Employee {
	public void work() {
		System.out.println("我在工作");
	}
}

class Developer extends Employee {
	public void printName() {
		System.out.println("打印名称");
	}
}

class Fu {
	int num = 6;
}

class Wa extends Fu {
	int num = 8;
	public void star() {
		System.out.println("父类----" + super.num);
		System.out.println("子类----" + num);
	}
}

//方法的重写
class MobilePhone {
	public void sendMessage() {
		System.out.println("发信息");
	}
	
	public void call() {
		System.out.println("打电话");
	}
	
	public void show() {
		System.out.println("来电显示");
	}
}

class NewPhone extends MobilePhone{
	public void show() {
		super.show();
		System.out.println("头像");
		System.out.println("名称");
	}
}

//抽象类
abstract class Developers {
	public abstract void work();
}

//JavaEE工程师
class pc extends Developers {
	public void work() {
		System.out.println("我在开发网站");
	}
}

//AND 工程师
class ADN extends Developers {
	public void work() {
		System.out.println("我在开发APP");
	}
}








