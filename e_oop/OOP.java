package e_oop;

public class OOP {

	public static void main(String[] args) {

		/*<<객체지향 프로그램>>
		 * 프로그래밍을 단순히 코드의 연속으로 보는 것이 아니라
		 * 객체간의 상호작용으로 보는 것.
		 * 코드의 재사용성이 높고 유지보수가 용이하다.
		 * 
		 * 
		 * <<객체 생성(인스턴스화)>>
		 * 클래스를 사용하기 위해 메모리(Heap영역)에 올려놓은 것
		 * new클래스명();->객체가 저장됨 메모리 주소변환
		 * 객체 뒤에 참조연산자(.)를 붙여 객체의 변수와 메서드에 접근할 수 있다.
		 * 객체는 생성될떄 마다 새로운 객체가 생성되고,
		 * 여러개의 객체가 동시에 존재할 수 있다.
		 * 
		 */
		
		SampleClass sc = new SampleClass();
		
		sc.method1();
		
		sc.method2(10);
		
		String returnString = sc.method3();
		System.out.println(returnString);
		
		int returnInt = sc.method4(7, 15);
		System.out.println(returnInt);
		
		sc.test1();
		
		
		ClassMaker cm = new ClassMaker();
		
		cm.a();
		
		System.out.println(cm.b());//리턴 타입이 있어서 출력.
		
		cm.c("abc");
		
		System.out.println(cm.d(7,12));
		
		
		Calculator cal = new Calculator(); 
		
		/*double a = cal.add(123456, 654321);
		System.out.println(a);
		
		
		double b = cal.multiply(a, 123456);
		System.out.println(b);
		
		double c = cal.divide(b, 123456);
		System.out.println(c);

		double d = cal.subtract(c, 654321);
		System.out.println(d);
		
		
		double e = cal.remainder(c, 654321);
		System.out.println(e);*/
		
		
		double result = cal.add(123456, 654321);
		result = cal.multiply(result, 123456);
		result = cal.divide(result, 123456);
		result = cal.subtract(result, 654321);
		result = cal.remainder(result, 123456);
		System.out.println(result);
		
		SimliTest sim= new SimliTest();
		
		sim.question1();
		
		
		
	}
	
}
