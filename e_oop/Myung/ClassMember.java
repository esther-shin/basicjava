package e_oop;

public class ClassMember {
	//static이 붙은건 클래스 변수 안붙으면 인스턴스 변수
	static String classVariable = "클래스 변수 입니다.";
	String intanceVaiable = "인스턴스 변수 입니다.";
	
	static void classMethod(){
		System.out.println("클래스 메서드 입니다.");
	}
	
	void intanceMethod(){
		System.out.println("인스턴스 메서드 입니다.");
	}
}
