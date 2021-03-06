package 关键字内部对象等;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str1 = "abc";
//		String str2 = new String("abc");
//		System.out.println(str1 == str2);
//		System.out.println(str1.equals(str2));
		
		/*
		 * 创建String的几种方式
		 */
//		String s1 = new String();//创建String对象，字符串中没有内容
//		byte[] bys = new byte[]{97,98,101,122,111,112};
//		String s2 = new String(bys);
//		String s3 = new String(bys, 2, 3);
//		char[] chs = new char[]{'a', 'b', 'c', 'd', 'e'};
//		String s4 = new String(chs);
//		String s5 = new String(chs, 2, 3);
//		String s6 = new String("哈哈");
//		
//		System.out.println("1---" + s1);
//		System.out.println("2---" + s2);
//		System.out.println("3---" + s3);
//		System.out.println("4---" + s4);
//		System.out.println("5---" + s5);
//		System.out.println("6---" + s6);
		
		/*
		 * 字符串的长度
		 */
//		String s1 = "haha";
//		int len = s1.length();
//		System.out.println(len);

		/*
		 * 截取字符串
		 */
//		String str = "abcde";
//		String s1 = str.substring(1);
//		String s2 = str.substring(1, 3);
//		System.out.println(s1);
//		System.out.println(s2);
		
		/*
		 * 查询开头和结尾
		 */
//		String string = "String.Demo.java";
//		boolean b1 = string.startsWith("Demo");
//		boolean b2 = string.startsWith("String");
//		boolean b3 = string.endsWith("java");
//		System.out.println(b1 + "" + b2 + b3);
		
		/*
		 * 字符串是否包含另一个字符串
		 */
//		String s1 = "abcde";
//		String s2 = "abc";
//		boolean b = s1.contains(s2);
//		System.out.println(b);
		
		/*
		 * 判断是否包含指定字符串，包含则返回第一次出现该字符串的索引，不包含则返回-1
		 */
//		String s1 = "abcde";
//		String s2 = "cde";
//		int index = s1.indexOf(s2);
//		System.out.println(index);
		
		/*
		 * 将字符串转成一个字符数组。或者字节数组。
		 */
//		String str1 = "abcedf";
//		char[] chs = str1.toCharArray();
//		byte[] bts = str1.getBytes();
//		System.out.println(chs + "  " + bts);
		
		/*
		 * 	判断两个字符串中的内容是否相同
		 */
//		String str1 = "abced";
//		String str2 = "abced";
//		String str3 = "abdkdkd";
//		boolean b1 = str1.equals(str2);
//		boolean b2 = str1.equals(str3);
//		boolean b3 = str1.equalsIgnoreCase(str2);//不区分大小写
//		System.out.println(b1 + "  "+ b2 + "  " + b3);
		
		/*
		 * 	获取该字符串对象中的内容
		 */
//		String string = new String("haha");
//		System.out.println(string.toString());
		
		/*
		 * 获取指定字符串中，大写字母、小写字母、数字的个数。
		 */
//		String string = "43320jf0ncribHAOEINOoufn24rho2ufn2";
//		int bigNum = 0;
//		int smallNum = 0;
//		int numNum = 0;
//		
//		for (int i = 0; i < string.length(); i++) {
//			char c = string.charAt(i);
//			if (c >= 'A' && c <= 'Z') {
//				bigNum++;
//			}else if (c >= 'a' && c <= 'z') {
//				smallNum++;
//			}else {
//				numNum++;
//			}
//		}
//		
//		System.out.println("大写的个数是：" + bigNum);
//		System.out.println("小写的个数是：" + smallNum);
//		System.out.println("数字的个数是：" + numNum);
//		
//		System.out.println(convert("fnojewnfjnAEK"));
		
//		int count = squleCountWithStr("fjewjava.afjiemjavadeqjavadd.java", "java");
//		System.out.println(count);
		
		/*
		 * StringBuffer 的方法使用
		 */
//		StringBuffer stringBuffer = new StringBuffer();
//		//添加字符串
//		stringBuffer.append("haha");
//		//在指定的位置插入字符串
//		stringBuffer.insert(0, "hehe");
//		//删除 从哪删到哪
//		stringBuffer.delete(2, 4);
//		//替换指定范围的内容
//		stringBuffer.replace(0, 3, "gg");
//		System.out.println(stringBuffer);
		
//		练习：int[] arr = {34,12,89,68};将一个int[]中元素转成字符串  格式 [34,12,89,68]
		int[] arr = {34,12,89,68};
		StringBuffer sBuffer = new StringBuffer();
		sBuffer.append("[");
		for (int i = 0; i < arr.length; i++) {
			sBuffer.append(arr[i]);
			if (i != arr.length - 1) {
				sBuffer.append(",");
			}else {
				sBuffer.append("]");
			}
		}
		System.out.println(sBuffer);
	}
	
	/*
	 * 将字符串中，第一个字母转换成大写，其他字母转换成小写，并打印改变后的字符串
	 */
	
	static String convert(String string) {
		String firstStr = string.substring(0, 1);
		String restStr = string.substring(1);
		String bigStr = firstStr.toUpperCase();
		String smallStr = restStr.toLowerCase();
		return bigStr + smallStr;
	}
	
	/*
	 * 查询大字符串中，出现指定小字符串的次数
	 */
	
	static int squleCountWithStr(String str,String str1) {
		int count = 0;
		int index = -1;
		while ((index = str.indexOf(str1)) != -1) {
			count++;
			str = str.substring(index + 1);
		}
		return count;
	}

}





/*
 *比较两个对象 重写equals 
 */

class Person11 {
	int age;
	
	public boolean equals(Object object){
		if (this == object) {
			return true;
		}
		
		if (!(object instanceof Person11)){
			return false;
		}
		
		Person11 person = (Person11)object;
		return person.age == this.age;
	}
}
