package 正则表达;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 举例：校验qq号码.
	1: 要求必须是5-15位数字
	2: 0不能开头
		 */
//		String qq = "604598999";
//		String regex = "[1-9][0-9]{4,14}";
//		boolean flag1 = qq.matches(regex);
//		System.out.println(flag1);
		
		/*
		 * 举例：校验手机号码
	1：要求为11位数字
2：第1位为1，第2位为3、4、5、7、8中的一个，后面9位为0到9之间的任意数字。
代码演示

		 */
//		String phoneNum = "1331313323232";
//		String regex = "1[34578][0-9]{9}";
//		boolean flag2 = phoneNum.matches(regex);
//		System.out.println(flag2);
		
		/*
		 * split  根据给定正则表达式的匹配规则，拆分此字符串
		 */
		
//		String string = "123-42-232-493";
//		String regex = "-";
//		String[] results = string.split(regex);
//		System.out.println(results.length);
		
		/*
		 * replaceAll  将符合规则的字符串内容，全部替换为新字符串
		 */
		String string = "fmiwo43057043unfcoeij423";
		String regex = "[0-9]";
		String result = string.replaceAll(regex, "*");
		System.out.println(result);
		
		
		
		
		
		
		
	}

}