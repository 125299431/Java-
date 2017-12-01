package 集合;

import java.util.Enumeration;
import java.util.Vector;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
	}
	
	static void test1() {
		//Vector
		Vector<String> vector = new Vector<>();
		vector.addElement("abc");
		vector.addElement("rie");
		vector.addElement("kgn");
		
		Enumeration<String> enumeration = vector.elements();
		while (enumeration.hasMoreElements()) {
			String string = (String) enumeration.nextElement();
			System.out.println(string);
		}
	}

}
