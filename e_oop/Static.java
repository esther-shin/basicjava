package e_oop;

public class Static {

	public static void main(String[] args) {
	/*
	 * <<static>>
	 * -객체 생성 없이 변수나 메서드를 사용하기 위해 붙인다
	 * -객체들간에 변수의 값을 공유하기 위해 붙인다.
	 * -static이 붙은 것: 클래스 변수, 클래스 메서드
	 * -static이 붙지 않은 것: 인스턴스 변수,인스턴스 메서드.
	 * 
	 */
		
	//static이 붙은 메서드
		Math.random();
		System.out.println();
		
		System.out.println(ClassMember.classVariable);
		ClassMember.classMethod();
		
		ClassMember cm1 = new ClassMember();
		System.out.println(cm1.instanceVariable);
		cm1.instanceMethod();
		
		System.out.println(cm1.classVariable);
		cm1.classMethod();
		//class 일 경우에는 ClassMember.으로 가지고 오는 게 바른 방법.
		//객체를 통해서도 멤버에 접근할 수 있지만 좋은 방법은 아니다.
		
		ClassMember cm2 = new ClassMember();
		
		//변경 전
		System.out.println("cm1 :"+ cm1.instanceVariable);
		System.out.println("cm2 :"+ cm2.instanceVariable);
		
		cm2.instanceVariable="변경한 값";
		
		//변경 후
		System.out.println("cm1 : "+ cm1.instanceVariable);
		System.out.println("cm2 : "+ cm2.instanceVariable);
		
		//변경 전
		System.out.println("cm1 :" + cm1.classVariable);
		System.out.println("cm2 :" + cm2.classVariable);
		
		//classVariable의 값은 어차피 한 개이고 접근 경로만 같은 거라서
		//값 변경이 같음.
		
		cm2.classVariable="변경한 값";
		
		//변경 후 (값 변경함)
		System.out.println("cm1 :" + cm1.classVariable);
		System.out.println("cm2 :" + cm2.classVariable);
	}

}
