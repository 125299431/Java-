import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Demo9 {
	
	public static void main(String[] args) {
//		Person p = new Person();
//		p.setAge(10);
////		p.speak();
//		
//		Person p2 = new Person();
//		p2.setAge(12);
//		p.eaulAge(p2);
		
		ArrayList<Person> students = new ArrayList<Person>();
		
		/*
		 * 1.存储每位同学
		 */
		saveStudent(students);
		/*
		 * 2.打印每位同学
		 */
		printAllStudent(students);
		/*
		 * 3.随机抽查一位同学
		 */
		choiseOneStudent(students);
	}
	
	public static void saveStudent(ArrayList<Person> students) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			Person person = new Person();
			System.out.println("请输入第" + i + "个同学的名字");
			person.setName( scanner.next());
			System.out.println("请输入第" + i + "个同学的年龄");
			person.setAge(scanner.nextInt());
			students.add(person);
		}
	}
	
	public static void printAllStudent(ArrayList<Person> students) {
		for (int i = 0; i < students.size(); i++) {
			Person person = students.get(i);
			System.out.println("学生姓名是：" + person.getName() + "学生年龄是" + person.getAge());
		}
	}
	
	public static void choiseOneStudent(ArrayList<Person> students) {
		Random random = new Random();
		Person student = students.get(random.nextInt(students.size()));
		System.out.println("抽到的人的姓名是:" + student.getName() + "抽到的人的年龄是" + student.getAge());
	}
	

}
