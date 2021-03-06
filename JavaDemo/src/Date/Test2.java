package Date;

import java.util.Date;
import java.util.Calendar;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		test1();
		test2();
	}
	
	static void test1() {
		//通过静态方法创建
		Calendar calendar = Calendar.getInstance();//返回当前时间
		int year = calendar.get(Calendar.YEAR);
		System.out.println(year);
		
		//add 指定字段增加某值
		calendar.add(Calendar.DATE, 3);//修改当前时间是3天后
		calendar.add(Calendar.HOUR, 5);//修改当前时间为5个小时后
		
		//set 设置指定时间段
		calendar.set(Calendar.YEAR, 2020);
		calendar.set(Calendar.MONTH, 12);
		calendar.set(Calendar.DATE, 20);
		
		//转换成Date对象
		Date date = calendar.getTime();
		System.out.println(date.toString());
	}
	
	static void test2() {
		//算出自己出生日期
		Calendar myCalendar = Calendar.getInstance();
		myCalendar.set(Calendar.YEAR, 1993);
		myCalendar.set(Calendar.MONTH, 1);
		myCalendar.set(Calendar.DATE, 7);
		
		//当前的时间
		Calendar currentCalendar = Calendar.getInstance();
		int currentDay = currentCalendar.get(Calendar.DATE);
		int myDay = myCalendar.get(Calendar.DATE);
		
		
		System.out.println("今天是" + (currentCalendar.getTime()));
		System.out.println("相差了" + (currentDay - myDay) + "天");
	}
	

}
