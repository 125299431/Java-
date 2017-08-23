package 接口;

public interface Fu1 {
	void show1();
}

interface Fu2 {
	void show2();
}

class Zi implements Fu1, Fu2 {
	public void show1() {
		
	}
	
	public void show2() {
		
	}
}

class Fu {
	public void show(){
		
	}
}

interface Inter {
	public abstract void hide();
}

class Zi1 extends Fu implements Inter {
	public void hide() {
		
	}
}

interface ziInter extends Fu1, Fu2, Inter {
	/*
	 * 接口可以多继承
	 */
	void show3();
}

/*
 * 总结接口和抽象类的区别：
相同点:
	都位于继承的顶端,用于被其他类实现或继承;
	都不能直接实例化对象;
	都包含抽象方法,其子类都必须覆写这些抽象方法;
区别:
	抽象类为部分方法提供实现,避免子类重复实现这些方法,提高代码重用性;接口只能包含抽象方法;
	一个类只能继承一个直接父类(可能是抽象类),却可以实现多个接口;(接口弥补了Java的单继承)

 */

interface 缉毒 {
	public void 缉毒();
}

abstract class 犬科 {
	public abstract void 吃饭();
	public abstract void 犬叫();
}

class 缉毒犬 extends 犬科 implements 缉毒 {
	public void 缉毒() {
		
	}
	public void 吃饭() {
		
	}
	public void 犬叫() {
		
	}
}





