import java.util.Random;
import java.util.Scanner;
public class Demo3 {
	public static void main(String[] args) {
//		itcast: for (int i = 1; i < 10; i++) {
//			for (int j = 1; j <= i; j++) {
//				if (i >= 4) {
//					break itcast;//跳出内循环
//				}
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//随机生成一个数
		Random random = new Random();
		int i = random.nextInt(10);
		
		System.out.println("0~10，请猜这个数");
		Scanner scanner = new Scanner(System.in);
		int j = scanner.nextInt();
		
		while (j != i) {
			if (j > i) {
				System.out.println("猜大了！");
			}else {
				System.out.println("猜小了！");
			}
			System.out.println("请重新输入一个数");
			j = scanner.nextInt();
		}
		System.out.println("恭喜你猜对了！");
		
	}
}
