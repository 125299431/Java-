package 构造方法;

public abstract class Employee {
	private String id;
	private String name;
	
	public Employee() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public Employee(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
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
	
	public abstract void work();
}
