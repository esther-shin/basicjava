package e_oop;

public class ClassMaker {
 
	
	int a = 5;//전역변수 생성
	
	void a() {
		System.out.println(a);
	}
	
	int b() {
		return a;    //return값의 타입에 따라서 데이터타입을 잘 정해줘야한다.
	}
	
	void c(String str){
		System.out.println(str);
	}
	
	int d(int a,int b){
		return a * b;
	}
}
