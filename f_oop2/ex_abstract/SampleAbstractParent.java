package f_oop2.ex_abstract;

public abstract class SampleAbstractParent {

	void method(){
		
	}
	
	//추상 메서드: 선언부만 있고 구현부는 없는 메서드
	abstract void abstractMethod();
	
}

class SampleAbstractChild extends SampleAbstractParent{
//부모 클래스 추상메서드를 자식 메서드에서 무조건 구현시켜줘야됨.(overriding시켜면 됨)
	
	//추상메서드를 상속받으면 반드시 구현해야된다.
	//상속받은 추상메서드를 추상메서드로 남겨두려면
	//클래스를 추상클래스로 변경해야한다.
	
	@Override
	void abstractMethod() {
		
	}
	
	
}
