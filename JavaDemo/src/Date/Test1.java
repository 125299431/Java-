package Date;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Test1 {
	public static void main(String[] args) throws ParseException {
//		Date date = new Date(349432432432l);
////		System.out.println(date.toLocaleString());
//		System.out.println(date.getTime()); 
		
		//对日期进行格式化 将date转成String
//		DateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
//		Date date = new Date(3243232423213L);
//		String str_time = dFormat.format(date);
//		System.out.println(str_time);
		
		//将String转成Date
		String dateStr = "2020年11月10号";
		DateFormat df = new SimpleDateFormat("yyyy年MM月dd号");
		Date date2 =  df.parse(dateStr);
		System.out.println(date2);
		
		
		
		
	}
}
