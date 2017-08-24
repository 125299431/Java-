package 构造方法;

public class NetWork extends Maintainer {
	
	public NetWork() {
		// TODO Auto-generated constructor stub
	}
	
	public NetWork(String name, String id) {
		super(name, id);
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("name = " + this.getName() + " id = " + this.getId() + "is working");
	}

}
