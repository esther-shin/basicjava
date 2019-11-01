package e_oop;

public class ClassMaker {
	int a = 10;

	void a(){//리턴 타입이 없을때 void사용
		System.out.println(a);//전역변수 출력
	}
	
	int b(){//전역 변수와 동일한 리턴 타입에 파라미터 없으니깐 괄호
		return a;//전역 변수 리턴이라 return치고 변수 넣음.
	}
	
	void c(String str){//리턴 타입은 없고 파라미터가 있는 메서드.
		System.out.println(str);
	}

	int d(int a, int b){
		return a *b;
	}
	
}
