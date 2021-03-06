package 关键字内部对象等;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People.Heart heart = new People().new Heart();
		heart.show();
		
		Person1 person1 = new Person1();
		person1.show1();
		
		Person2 person2 = new Person2() {
			void eat() {
				System.out.println("人需要吃");
			}
		};
		
		person2.eat();
	}

}

/*
 * 内部类
 * */

class People {
 class Heart {
		public void show() {
			System.out.println("这是心脏");
		}
	}
}

/*
 * 局部内部类
 */
class Person1 {
	void show1() {
		class Ball { //内部类 气球
			public void playBall() {
				System.out.println("玩气球");
			}
		}
		
		new Ball().playBall();
	}
	
}

/*
 * 匿名内部类
 */
abstract class Person2 {
	abstract void eat();
}




