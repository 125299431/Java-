package 多态;

public class Test2 {
	public static void main(String[] args) {
		USB mouse = new Mouse();
		Computer computer = new Computer();
		computer.run();
		computer.useUSB(mouse);
		computer.close();
	}
}

interface USB {
	void close();
    void open();
}

class Mouse implements USB {
	public void close() {
		System.out.println("鼠标关闭");
	}
	
	public void open() {
		System.out.println("鼠标开启");
	}
}

class keyBord implements USB {
	public void close() {
		System.out.println("键盘关闭");
	}
	
	public void open() {
		System.out.println("键盘开启");
	}
}

class Computer {
	void run() {
		System.out.println("电脑运行");
	}
	
	void close() {
		System.out.println("电脑关闭");
	}
	
	void useUSB(USB usb) {
		usb.open();
		usb.close();
	}
}


