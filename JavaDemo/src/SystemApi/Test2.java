package SystemApi;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Math
		 */
		test2();
	}
	
	static void test2() {
		//abs方法,结果都为正数
//		double d1 = Math.abs(-1); //1
//		d1 = Math.abs(2); //2
		
		//	ceil方法，结果为比参数值大的最小整数的double值
//		double d1 = Math.ceil(3.3); //4.0
//		d1 = Math.ceil(-3.3);//-3
		
		//	floor方法，结果为比参数值小的最大整数的double值
//		double d1 = Math.floor(3.3); //3.0
//		d1 = Math.floor(-3.3);//-4.0
		
		//	max方法，返回两个参数值中较大的值
//		double d1 = Math.max(4, 5);//5.0
		
		//	min方法，返回两个参数值中较小的值
//		double d1 = Math.min(-3, -5); //-5.0
		
		//	pow方法，返回第一个参数的第二个参数次幂的值
//		double d1 = Math.pow(2, 3); //8.0
		
		//	round方法，返回参数值四舍五入的结果
//		double d1 = Math.round(5.4); // 5.0
//		d1 = Math.round(5.5); //6.0
		
		//	random方法，产生一个大于等于0.0且小于1.0的double小数
		double d1 = Math.random();
		System.out.println(d1);

	}

}
