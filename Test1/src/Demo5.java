import java.util.Scanner;
import java.util.Random;
public class Demo5 {

//	public static void main(String[] args) {
//		int area = getArea(5, 6);
//		System.out.println("得到的结果是" + area);
//	}
//	
//	public static int getArea(int a, int b) {
//		return a * b;
//	}
	
//	public static void main(String[] args) {
//		String[] students = new String[3];
//		addStudent(students);
//		printStudent(students);
//		findStudent(students);
//	}
//	
//	public static void addStudent(String[] students) {
//		Scanner scanner = new Scanner(System.in);
//		for (int i = 0; i < students.length; i++) {
//			System.out.println("输入第" + i + "个学生");
//			students[i] = scanner.next();
//		}
//	}
//	
//	public static void printStudent(String[] students) {
//		for (int i = 0; i < students.length; i++) {
//			System.out.println("第" + i + "个学生叫：" + students[i]);
//		}
//	}
//	
//	public static void findStudent(String[] students) {
//		Random random = new Random();
//		int ran = random.nextInt(students.length);
//		System.out.println("随机学生为：" + students[ran]);
//	}
	
	public static void main(String[] args) {
		System.out.println("------------------库存管理------------------");
		System.out.println("   1.查看库存清单");
		System.out.println("   2.修改商品库存数量");
		System.out.println("   3.退出");
		System.out.println("请输入要执行的操作序号：");
		Scanner scanner = new Scanner(System.in);
		choise(scanner.nextInt());
	}
	
	public static void choise(int index) {
		if (index > 3) {
			return;
		}
		String[] names = {"Mac Pro", "Lianxiang", "huashuo"};
		Double[] prices = {6888.88, 2333.12, 4555.12};
		int[] goodsCount = {10,2,3};
		switch (index) {
		case 1:
			lookAllGoods(names, prices, goodsCount);
			break;
		case 2:
			updateCount(names, goodsCount);
			break;
		case 3:
			exit();
			break;
				
		default:
			break;
		}
	}
	
	public static void lookAllGoods(String[] names, Double[] prices, int[] goodsCount) {
		System.out.println("名称       价格       数量");
		for (int i = 0; i < goodsCount.length; i++) {
			System.out.println(names[i] + "   " + prices[i] + "   " + goodsCount[i]);
		}
	}
	
	public static void updateCount(String[] names, int[] goodsCount) {
		for (int i = 0; i < goodsCount.length; i++) {
			System.out.println("请输入" + names[i] +"的库存数");
			goodsCount[i] = new Scanner(System.in).nextInt();
		}
	}
	
	public static void exit() {
		System.out.println("您已退出系统");
	}

}
