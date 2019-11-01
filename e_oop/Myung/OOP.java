package e_oop;

public class OOP {

	public static void main(String[] args) {
		/*
		 * << 객체지향 프로그래밍 >>
		 * - 프로그래밍을 단순히 코드의 연속으로 보는것이 아니라
		 * 	 객체간의 상호작용으로 보는것.
		 * - 코드의 재사용성이 높고 유지보수가 용이하다.
		 * 
		 *  << 객채 생성(인스턴스화) >>
		 *  - 클래스를 사용하기 위해 메모리(Heap영역)에 올려놓은 것.
		 *  - new 클래스명(); -> 객체가 저장된 메모리 주소 반환.
		 *  - 객체 뒤에 참조연산자(.)를 붙여 객체의 변수와 메서드에 접근할 수 있다.
		 *  - 객체는 생성될때 마다 새로운 객체가 생성되고,
		 *    여러개의 객체가 동시에 존재할 수 있다. 
		 */
		//new SampleClass(); //객체 생성
		SampleClass sc =new SampleClass(); //sc라는 변수에 저장
		
		sc.method1(); //리턴,파라미터 둘다없는거
		
		sc.method2(10); //double타입의 파라미터가 있고, 리턴값 없는거
		
		String returnString = sc.method3(); //String 타입의 리턴값있는거
		System.out.println(returnString);
		
		double returndouble = sc.method4(7, 15); //double 타입의 파라미터와 리턴값 있는거
		System.out.println(returndouble);
		
		sc.test1();
		//////////////////////////////////////////////
	/*	ClassMaker ab = new ClassMaker(); // ClassMaker라는 객체를 ab라는 변수에 저장
		
		ab.a(); //리턴도 없고 파라미터도 없는거
		
		int ret1 = ab.b();      //리턴은 있고 파라미터 없는거 
		System.out.println(ret1);  //(변수에 저장해서 변수를 출력해도 되고)
		//System.out.println(ab.b()); //바로 출력도 가능 
		
		ab.c("abcd");   //ab의 c라는 String 타입의 파라미터를 출력하는 메소드를 가져와서 파라미터"abc"를 출력
		
		double ret2 = ab.d(2, 5); 
		System.out.println(ret2);
		//System.out.println(ab.d(7,12));   
		
		
		Calculator cal = new Calculator(); //객체생성
		
		double a1 = cal.add(123456,654321);
		System.out.println(a1);
		
		double a2 = cal.multi(a1,123456);
		System.out.println(a2);
		
		double a3 = cal.divide(a2,123456);
		System.out.println(a3);
		
		double a4 = cal.minus(a3,654321);
		System.out.println(a4);
		
		double a5 = cal.nan(a4,123456);
		System.out.println(a5);
		
		SimLiTest game =new SimLiTest();
		
		game.q1();*/
	
	}

}




















