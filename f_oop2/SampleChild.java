package f_oop2;

public class SampleChild extends SampleParent{

	int var;//같은 이름 다른 타입의 변수를 사용.
	
	SampleChild(){
		super();//부모클래스 생성자 호출시 사용.
	}
	
	
	void test(double var){
		System.out.println(var);//지역변수,,이름이 같을 경우 지역변수가 우선함.
		System.out.println(this.var);//인스턴스변수,,전역변수
		System.out.println(super.var);//부모클래스의 인스턴스 변수
		//super: 부모 클래스의 멤버와 자식클래스의 멤버가 이름이 중복될떄
		//둘을 구분하기 위해 사용한다.
		System.out.println(this.method(10, 20));
		System.out.println(super.method(10, 20));
	}
	
	
	void childMethod(){
		//상속받은 변수와 메서드를 사용할 수 있다.
		System.out.println(var);//상속받은 변수
		int result=method(7,13);//상속받은 메서드
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		//ctrl space main 누른후
		SampleChild sc= new SampleChild();
		
	
		sc.childMethod();
	
		System.out.println(sc.var);
		int result= sc.method(7, 13);
		System.out.println(result);
		
		sc.test(10);
		
		SampleParent sp = (SampleParent)new SampleChild();//Upcasting생략가능
		
		System.out.println("sp.var :" + sp.var);//객체는 똑같은 데 타입이 다름.
		System.out.println("sc.var :" + sc.var);
		System.out.println("sp.method() :" + sp.method(5,10));
		System.out.println("sc.method():" + sc.method(5,10));
		//오버라이딩하게 되면 부모클래스의 메서드는 무시된다.
		SampleChild s = (SampleChild)sp;//형변환Downcasting이라서 생략불가
		s.childMethod();
		//(부모 타입으로 호출을 하더라도 오버라이딩된 자식클래스로 
		//타입에 해당하는 멤버만 사용할 수 있다.)
	}

	//상속받은 메서드를 변경하고 싶을 떄 오버라이딩을 할 수 있다.
	
	//오버라이딩: 상속받은 메서드의 내용을 재정의 하는 것.
	
	@Override//아노테이션
	int method(int a,int b){//리턴타입 메서드명 파라미터 모두 같아야 한다.
		return a*b;//내용만 변경
	}
	
}
