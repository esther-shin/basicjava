package f_oop2.ex_abstract;

public abstract class Animal {

	void run(){
		System.out.println("달려간다~");
	}
	
	abstract void bark();
	
}

class Dog extends Animal{
//dog 에 커서 넣고  add 누름
	@Override
	void bark() {
		System.out.println("멍멍~~");
		
	}
	
}

class Cat extends Animal{

	@Override
	void bark() {
		System.out.println("야옹");
	}
	
}

class Goat extends Animal{

	@Override
	void bark() {
		System.out.println("메에");
		
	}
	
}


















