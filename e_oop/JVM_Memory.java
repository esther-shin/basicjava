package e_oop;

public class JVM_Memory {
	/*
	 * <<JVM 메모리 구조>>
	 * -Method Area : 클래스가 저장된다.//클래스 멤버
	 * -Call Stack : 현재 호출되어 있는 메서드가 저장된다.
	 * -Heap : 객체가 저장된다.//인스턴스멤버
	 * 
	 * 운영체제 ->프로그램//다른 언어는 운영체제에 따라 실행 불가능.
	 * 운영체제 -> JVM-> 프로그램 //느림.하나의 코드로 여러개의 운영체제에서 실행가능.
	 */
	
	/*
	 * <<Method Area>>
	 * - Static
	 * - Math
	 * - System
	 * - PrintStream
	 * - ClassMember : classVariable,classMethod()
	 * 
	 * <<Call Stack>>
	 * - main():cm1//객체의 주소값이 저장됨.
	 * - random()//메서드 사용 이후 삭제됨
	 * - println() : 삭제
	 * - printIn() : 삭제
	 * - printIn() : 삭제
	 * <<Heap>>
	 * - cm1 = new ClassMember(): instanceVariable,instanceMethod()
	 * - cm2 = new ClassMember(): instanceVariable,instanceMethod()
	 * 
	 */
	
}
