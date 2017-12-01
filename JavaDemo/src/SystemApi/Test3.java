package SystemApi;

import java.util.Arrays;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Arrays
		 */
		int[] arrays = {1,2,4,3,9,8};
//		test1(arrays);
//		test2(arrays);
//		test3(arrays);
		int[] arr = searchLastThree(arrays);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	static void test1(int[] arr) {
		//	sort方法，用来对指定数组中的元素进行排序（元素值从小到大进行排序）
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	static void test2(int[] arr) {
		//	toString方法，用来返回指定数组元素内容的字符串形式
		System.out.println(Arrays.toString(arr));
	}
	
	static void test3(int[] arr) {
		//binarySearch方法，在指定数组中，查找给定元素值出现的位置。若没有查询到，返回位置为-1。要求该数组必须是个有序的数组。
		int index = Arrays.binarySearch(arr, 4);
		System.out.println(index);
	}
	
	static int[] searchLastThree(int[] arr) {
		Arrays.sort(arr);
		int[] temp = new int[3];
		System.arraycopy(arr, 0, temp, 0, 3);
		return temp;
	}

}
