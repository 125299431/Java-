package Extend;

public abstract class Empoloyee {
	private String name;
	private String id;
	
	//抽象方法
	public abstract void work();
	
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