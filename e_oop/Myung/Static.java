package e_oop;

public class Static {

	public static void main(String[] args) {
		/*///////////오늘배운 Static과 생성자 (중요)!!!!!!!!!!!!!!!!!!!!!
		 * << static >>
		 * - 객체 생성 없이 변수나 메서드를 사용하기 위해 붙인다.
		 * - 객체들간에 변수의 값을 공유하기 위해 붙인다.
		 * - static이 붙은 것 : 클래스 변수, 클래스 메서드
		 * - static이 붙지 않은 것 : 인스턴스 변수, 인스턴스 메서드 
		 */
		
		//static이 붙은 메서드
		Math.random();
		System.out.println();
		
		///////////////////////////////////////////////
		System.out.println(ClassMember.classVariable);//(방법1)
		ClassMember.classMethod();
		
		ClassMember cm1=new ClassMember(); //객체 생성 (Static이 안붙으면 객체를 생성해줘야함)
		System.out.println(cm1.intanceVaiable);
		cm1.intanceMethod();
		
		System.out.println(cm1.classVariable);
		cm1.classMethod();
		//객체를 통해서도 클래스 멤버에 접근할 수 있지만 좋은 방법은 아니다.//위의 (방법1)이 올바른방법 -> 클래스명.메서드();
		
		ClassMember cm2 = new ClassMember(); //객체 하나더 생성
		
		//Static이 붙은 클래스 변수는 값을 서로 공유하지만 인스턴스 변수는 서로 공유하지 않음!!!!!!
		
		//변경 전
		System.out.println("cm1 : " + cm1.intanceVaiable);
		System.out.println("cm2 : " + cm2.intanceVaiable);
		
		
		cm2.intanceVaiable = "변경한 값";
		
		//변경 후 // (값을 공유하지 않음) 인스턴스 변수 변경시 변경한 인스턴스변수만 변함
		System.out.println("cm1 : " + cm1.intanceVaiable);
		System.out.println("cm2 : " + cm2.intanceVaiable);
		
		//변경 전
		System.out.println("cm1 : " + cm1.classVariable);
		System.out.println("cm2 : " + cm2.classVariable);
		
		cm2.classVariable = "변경한 값"; //classVariable얘를 통해서 감
		
		//변경 후 //(값을 공휴함) 클래스 변수 변경시 둘다 변함
		System.out.println("cm1 : " + cm1.classVariable);
		System.out.println("cm2 : " + cm2.classVariable);
	}

}














