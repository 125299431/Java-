package Extend;

public class Hardware extends Maintainer {

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("员工号为" + getId() + "正在修复打印机");
	}

}
