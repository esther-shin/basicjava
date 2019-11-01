package f_oop2;

public class Inheritance {

	public static void main(String[] args) {

		/*
		<<상속>>
		-기존의 클래스를 물려받아 새로운 클래스를 만드는 것이다.
		-자식 클래스명: extends부모 클래스명{}
		-부모 클래스의 생성자와 초기화 블럭을 제외한 모든 멤버를 물려받는다.
		-하나의 클래스만 상속받을 수 있다.
		-상속받지 않는 모든 클래스는 Object클래스를 상속 받는다.
		-자식 클래스는 부모 클래스의 멤버 외의 새로운 멤버를 가질 수 있으므로
		 자식 클래스는 부모 클래스보다 크거나 같다.
		-두개 이상의 클래스를 만드는데 공통된 멤버가 있는 경우 부모 클래스로 만든다.
		
		 <<super>>
		 -부모 클래스의 인스턴스 주소가 저장된 변수이다.(부모클래스 객체의 주소)
		 -부모 클래스의 멤버와 자식 클래스의 멤버의 이름이 중복될때 둘을 구분하기 위해 사용한다

		<<super()>>
	
		-생성자에서 부모 클래스의 생성자를 호출하기 위해 사용한다.
		-자식 클래스 생성자의 첫줄에는 super()가 있어야 한다.
		-없으면 컴파일러가 자동으로 추가한다.
		
		<<오버라이딩>>
		-상속받은 메서드의 내용을 재정의하는 것이다.
		-상속받은 메서드와 리턴타입, 메서드명, 파라미터가 같아야 한다
		-상속받은 메서드보다 좁은 범위의 접근제어자로 변경할 수 없다.
		-상속받은 메서드 보다 많은 예외를 선언할 수 없다.
		-static을 빼거나 더할 수 없다
		
		<<다형성>>
		-상속으로 인해 여러가지 형태를 가지게 되는 특징을 말한다.
		-부모타입으로 생성된 객체는 부모타입에 정의된 멤버만 사용 가능하다.
		-부모타입과 자식타입은 서로 형변환이 가능하다.
		-자식타입>부모타입: Up-casting(생략가능)
		-부모타입>자식타입:Down-casting(생략불가)
		-부모와 자식에 동일한 메서드가 있는 경우 자식의 메서드를 사용한다
		-부모와 자식에 동일한 멤버변수가 있는 경우 부모타입에서는 부모의 변수를 
		자식 타입에서는 자식의 변수를 사용한다.

		
		<<접근제어자>>
		-외부로 부터 데이터를 보호하거나 감추기 위해 사용한다.
		-public: 접근에 제한이 없다
		-protected:같은 패키지 그리고 상속받은 클래스에서 접근이 가능하다.
		-default: 같은 패키지에서만 접근이 가능하다(생략했을떄)
		-private: 클래스 내에서만 접 근이 가능하다//다른 클래스에서는 접근 불가
		
		
		<<Singleton(싱글톤 패턴)>>//클래스를 디자인하는 모양
		-객체생성을 제한하여 하나의 객체만 사용하게 하는 디자인 패턴이다
		-객체들간에 객체를 공유하기 위해 사용한다.
		(객체 자체를 공유하기 위해 사용. static을 붙이는 이유는 static끼리 안에 변수를 공유하기 위한 것이다. )
		*/
		
		AccessModifier am= new AccessModifier();
		
		System.out.println(am.publicVar);
		am.publicMethod();
		
		System.out.println(am.protectedVar);
		am.protectedMethod();
		
		System.out.println(am.defaultVar);
		am.defaultMethod();
	
		/*	
		System.out.println(am.privateMethod);
		am.privateMethod();*/
		
		Time t = new Time();
		
		t.setHour(99);
		t.setMinute(99);
		t.setSecond(-99);
		//들어가면 안되는 값이 있어서 제어해줌
		
		Singleton s = Singleton.getInstance();
		//static 이 있어서 클래스명. static이름명으로 호출
		
		System.out.println(new Inheritance());//inheritance객채생성
		System.out.println(new Inheritance());
		System.out.println(Singleton.getInstance());//getInstance메서드 호출
		System.out.println(Singleton.getInstance());
		
		
	/*	위에 결과값
	 	f_oop2.Inheritance@51493995
		f_oop2.Inheritance@1e638ee4
		f_oop2.Singleton@1a3a2a52
		f_oop2.Singleton@1a3a2a52 (같은 객체여서 주소값이 같음)*/
		
	
	
	}

}
