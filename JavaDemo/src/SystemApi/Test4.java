package SystemApi;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 大数据运算
		 */
//		test1();
		
		test2();
	}
	
	static void test1() {
		//5.1	BigInteger
		//大数据封装为BigInteger对象
		BigInteger big1 = new BigInteger("54687267834264764");
		BigInteger big2 = new BigInteger("32454524343243243");
		//add 相加
//		BigInteger bigAdd = big1.add(big2);
//		System.out.println(bigAdd);
		
		//subtract实现减法运算
//		BigInteger bigSub = big1.subtract(big2);
//		System.out.println(bigSub);
		
		//multiply实现乘法运算
//		BigInteger bigMul = big1.multiply(big2);
//		System.out.println(bigMul);
		
		//divide 实现除法运算
		BigInteger bigDiv = big1.divide(big2);
		System.out.println(bigDiv);
	}
	
	static void test2() {
//		5.2	BigDecimal
		 //大数据封装为BigDecimal对象
		BigDecimal big1 = new BigDecimal("0.09");
		BigDecimal big2 = new BigDecimal("0.01");
//		//add实现加法运算
//		BigDecimal bigAdd = big1.add(big2);
//		System.out.println(bigAdd);
		
		//subtract 减法运算
//		BigDecimal bigSub = big1.subtract(big2);
//		System.out.println(bigSub);
		
		//multiply 实现乘法运算
		BigDecimal bigmul = big1.multiply(big2);
		System.out.println(bigmul);
	}

}
