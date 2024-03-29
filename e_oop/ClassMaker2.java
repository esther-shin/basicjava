package e_oop;

public class ClassMaker2 {

	//전역변수 하나를 선언하고 명시적으로 초기화 해주세요.
	
	int a =5;
	
	//위에서 선언한 전역변수를 초기화 블럭을 사용해 초기화해주세요.
	
	{
		a=5;
	}
	
	//위에서 선언한 전역변수를 생성자의 파라미터를 사용해 초기화해주세요.
	
	ClassMaker2(int a){
		this.a = a;
	}

	
	//위에서 선언한 전역변수를 생성자를 하나더 만들어서 초기화해주세요.
	
	ClassMaker2(){
		this(10);//결과적으로는 10이 들어가 있음.
	} 
	
	//초기화 실행 순서: 명시적 초기화 ->초기화 블럭 ->생성자
	//위에서 부터 내려오는 순서.생성자는 항상 마지막에 
	//초기화 블럭과 명시적 초기화만 위치에 따라서 실행됨.
	
	
}
