package e_oop;

public class Calculator {

	//두 값의 산술연산을 수행하는 메서드들을 만들어주세요.
	
	int a ;
	int b ;

	double add(double a, double b){
		return a + b;//어떤 타입의 값을 갖을 지 몰라서 double로 설정.
	}
	
	
	double subtract(double a, double b){
		return a - b;
	}
	
	
	double divide(double a, double b){
		return a / b;
	}
	
	
	double multiply(double a, double b){
		return a * b;
	}
	
	
	double remainder (double a, double b){
		return a % b;
	}
	
	
	
}
