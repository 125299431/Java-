import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Demo8 {
	public static void main(String[] args) {
//		char xiao = 'a';
//		char da = 'A';
//		for (int i = 0; i < 26; i++) {
//			System.out.println("大写字母" + da + "小写字母" + xiao);
////			da++；
////			xiao++;
//		}
		
		//九九乘法表
//		for (int i = 1; i < 10; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(i + " * " +  j  + " = "  + i * j + "   ");
//			}
//			System.out.println();
//		}
		
		
		//倒序
//		int[] array = {1,2,3,4,5,6,7};
//		for (int start = 0, end = array.length - 1; start < end; start++, end--) {
//			int value = array[start];
//			array[start] = array[end];
//			array[end] = value;
//		}
//		for (int i = 0; i < array.length; i++) {
//			System.out.println(array[i]);
//		}
		
		int[] array = new int[]{10,2,3,12,5,7,6,9};
		
		//选择排序
//		for (int i = 0; i < array.length; i++) {
//			for (int j = i + 1; j < array.length; j++) {
//				if (array[i] > array[j]) {
//					int temp = array[i];
//					array[i] = array[j];
//					array[j] = temp;
//				}
//			}
//		}
		
		//冒泡排序
//		for (int i = 0; i < array.length - 1; i++) {
//			for (int j = 0; j < array.length - 1 - i; j++) {
//				if (array[j] > array[j + 1]) {
//					int temp = array[j];
//					array[j] = array[j + 1];
//					array[j + 1] = temp;
//				}
//			}
//		}
//		
//		for (int i = 0; i < array.length; i++) {
//			System.out.println(array[i]);
//		}
		
		//二分查找
//		int max = array.length - 1;
//		int min = 0;
//		int mid = 0;
//		while (max >= min) {
//			mid = (max + min) / 2;
//			System.out.println("中间数为:" + mid);
//			if (array[mid] > 3) {
//				max = mid - 1;
//			}else if(array[mid] < 3){
//				min = mid + 1;
//			}else {
//				System.out.println("找到了");
//				break;
//			}
//			
//		}
		
		Random random = new Random();
		ArrayList<Integer> arrayList = new ArrayList<>();
		while (arrayList.size() <= 7) {
			int value = random.nextInt(33);
			for (int j = 0; j < arrayList.size(); j++) {
				System.out.println(arrayList.get(j));
				int num = arrayList.get(j).intValue();
				if (value == num) {
					arrayList.remove(j);
				}
			
			}
			arrayList.add(value);
		}
		
		System.out.println(arrayList);
		
		
	}
}
 