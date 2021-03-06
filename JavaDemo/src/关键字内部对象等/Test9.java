package 关键字内部对象等;

import java.util.ArrayList;
import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("欢迎来到XXX网站");
		while (true) {
			System.out.println("请输入数字：1.登录 2.注册");
			Scanner scanner = new Scanner(System.in);
			int num = scanner.nextInt();
			switch (num) {
			case 1:
			{
				System.out.println("请输入用户名");
				String name = scanner.next();
				System.out.println("请输入密码");
				String password = scanner.next();
				boolean login = new LoginSystem().login(name, password);
				if (login) {
					System.out.println("登录成功");
				}else {
					System.out.println("账号或密码错误，登录失败");
				}
				break;
			}
			case 2:
			{
				System.out.println("请输入用户名");
				String name = scanner.next();
				System.out.println("请输入密码");
				String password = scanner.next();
				boolean regist = new LoginSystem().regist(name, password);
				if (regist) {
					System.out.println("注册成功！");
				}else {
					System.out.println("注册失败！");
				}
				break;
			}

			default:
				System.out.println("输入有误！");
				break;
			}
		}

	}

}

/*
 * 我们用一个集合来模拟存储所有用户信息，每个用户信息使用User类（属性：用户名、密码）的一个对象表示。
	登录功能：
1.用户需要输入账号密码
		2.比对账号密码(账号密码必须相同)
	注册功能：
1.用户输入要注册的账号密码
2.比对账号 (有相同的账号不可以)
3.如果可以注册，则将新的用户信息添加到集合中
	登陆操作、注册操作按照下图流程进行。

 */

class User {
	private String name;
	private String passwrod;
	
	public User() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public User(String name, String password){
		this.name = name;
		this.passwrod = password;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setPassword(String password){
		this.passwrod = password;
	}
	
	public String getPassword() {
		return this.passwrod;
	}
}

class LoginSystem {
	private static ArrayList<User> aList = new ArrayList<>();
	static{
		aList.add(new User("Li", "123456"));
		aList.add(new User("Zhang", "666666"));
	}
	
	public boolean login(String name, String password){
		for (int i = 0; i < aList.size(); i++) {
			User user = aList.get(i);
			if (user.getName().equals(name) && user.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean regist(String name, String password){
		for (int i = 0; i < aList.size(); i++) {
			User user = aList.get(i);
			if (user.getName().equals(name)) {
				return false;
			}
		}
		aList.add(new User(name, password));
		return true;
	}
}







