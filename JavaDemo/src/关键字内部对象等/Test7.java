package 关键字内部对象等;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

abstract class Worker {
	private String name;
	private String id;
	
	public Worker() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public Worker(String name, String id){
		this.name = name;
		this.id = id;
	}
	
	abstract void work();
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return this.id;
	}
}

interface VIP {
	public abstract void serive();
}

class Fuwuyuan extends Worker implements VIP {
	public Fuwuyuan() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public Fuwuyuan(String name, String id) {
		super(name, id);
	}
	
	 void work() {
		 System.out.println("我在工作");
	 }
	 
	 public void serive() {
		 System.out.println("去倒水");
	 }
}

class Chushi extends Worker implements VIP {
	
	public Chushi() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public Chushi(String name, String id) {
		super(name, id);
	}
	
	void work() {
		System.out.println("我也在工作");
	}
	public void serive() {
		 System.out.println("去做饭");
	 }
}




