import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class CallName {
	public static void main(String[] args) {
		ArrayList<Student> arrayList = new ArrayList<Student>();
		addStudent(arrayList);
		showAllStudent(arrayList);
		getRandomOne(arrayList);
	}
	
	public static void addStudent(ArrayList<Student> arrayList) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("请输入第" + i + "个人的姓名");
			Student student = new Student();
			student.name = scanner.next();
			System.out.println("请输入第" + i + "个人的年龄");
			student.age = scanner.nextInt(20);
			arrayList.add(student);
		}
	}
	
	public static void showAllStudent(ArrayList<Student> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			Student student = arrayList.get(i);
			System.out.println("第"+ i + 1 +"个学生为：" + "姓名：" + student.name + "年龄" + student.age);
		}
	}
	
	public static  void getRandomOne(ArrayList<Student> arrayList) {
		Random random = new Random();
		Student student = arrayList.get(random.nextInt(arrayList.size()));
		System.out.println(student);
	}
}
