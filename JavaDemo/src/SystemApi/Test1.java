package SystemApi;

public class Test1 {
	public static void main(String[] args) {
//		System.out.println(Integer.parseInt("30"));
//		test1();
//		test2();
		test3();
	}
	
	static void test1() {
		/*
		 * 1.3	自动装箱拆箱
		 */
		Integer integer = 4;//自动装箱 相当于Integer integer = Integer.valueOf(4);
		integer = integer + 5; //等号右边：将i对象转成基本数值(自动拆箱) i.intValue() + 5; 加法运算完成后，再次装箱，把基本数值转成对象。
		
		Integer a = new Integer(4);
		Integer b = new Integer(4);
		System.out.println(a == b);
		System.out.println(a.equals(b));
		
		Integer x = 10;
		Integer y = 10;
		System.out.println(x == y);
		System.out.println(x.equals(y));
	}
	
	static void test2() {
		/*
		 * 2.3	System类的方法练习
		 */
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			System.out.println(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("总共运行了" + (end - start) / 1000+ "秒");
	}
	
	static void test3() {
		/*
		 * 	练习二：将src数组中前3个元素，复制到dest数组的前3个位置上
				复制元素前：src数组元素[1,2,3,4,5]，dest数组元素[6,7,8,9,10]
				复制元素后：src数组元素[1,2,3,4,5]，dest数组元素[1,2,3,9,10]
		 */
		int[] src = new int[]{1,2,3,4,5};
		int[] dest = new int[]{7,8,9,10,11};
		System.arraycopy(src, 0, dest, 0, 5);
		for (int i = 0; i < dest.length; i++) {
			System.out.println(dest[i]);
		}
	}
	
	static void test4() {
		
	}
	
	
	
	
	
	
	
}
