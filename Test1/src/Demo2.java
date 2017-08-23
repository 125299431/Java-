import java.util.Scanner;
import java.util.Random;

public class Demo2 {
	public static void main(String[] args) {
		//创建Scanner引用类型的变量
		Scanner sc = new Scanner(System.in);
//		System.out.println("请输入一个数字");
		//获取数字
//		int n = sc.nextInt();
//		System.out.println("n的值为：" + n);
		
		
		System.out.println("请输入一句话");
		//获取字符串
		String s = sc.next();
		System.out.println("输入的字符串为："+ s);
		
		//转换成double
		System.out.println("转成double为：" + Double.parseDouble(s));
		//创建Random引用的变量
//		Random r = new Random();
//		//得到0~100内的随机数字，并赋值
//		int i = r.nextInt(100);
//		System.out.println("随机整型数字为："+ i);
//		//得到0~1之间的随机小数
//		double d = r.nextDouble();
//		System.out.println("随机的小数位：" + d);
	}
}
