package 关键字内部对象等;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * public 公共的
		 * protected 受保护的
		 * private 私有的
		 * final 最终的
		 * static 静态的
		 */
		Stu stu = new Stu();
		method(stu);
	}
	
	 static void method(Pers per) {
		 per.show();
	 }
	
	 Person show() {
		Person person = new Person();
		return person;
	}
	 
	

}

abstract class Pers {
	public abstract void show();
}
class Stu extends Pers {
	public void show() {
		System.out.println("haha");
	}
}



