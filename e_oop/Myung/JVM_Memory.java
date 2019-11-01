package e_oop;

public class JVM_Memory {
	/*
	 * << JVM 메모리 구조 >>
	 * - Method Area : 클래스가 저장된다.
	 * - Call Stack : 현재 호출되어 있는 메서드가 저장된다.
	 * - Heap : 객체가 저장된다.
	 * 
	 *  운영체제 -> 프로그램 (Java외의 프로그램)
	 *  운영체제 -> JVM -> 프로그램(Java로 만들어진 프로그램)
	 *  
	 *  Java시점의 차이점 속도가 느리다.(하지만 현재 큰 차이는 없음)
	 *  하나의 코드로 여러 운영체제에 실행가능함.(다른언어들은 두개이상의 코드가 필요함)
	 */
	
	/*
	 * << Method Area >>
	 * - Static //클래스 저장
	 * - Math 
	 * - System
	 * - PrintStream
	 * - ClassMember : classVariable , classMethod()
	 * 
	 * << Call Stack >>
	 * - main() : cm1 //지역변수 저장  
	 * - random : 실행 후 삭제
	 * - println() : 실행 후 삭제
	 * - println()	: 실행 후 삭제
	 * - println()	: 실행 후 삭제
	 * 
	 * << Heap >>
	 * - cm1 = new ClassMember() : instanceVariable, instanceMethod() //객체 ,메소드 저장
	 * - cm2 = new ClassMember() : instanceVariable, instanceMethod() //객체 ,메소드 저장
	 */
}
















