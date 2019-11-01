package e_oop;

public class RecursiveCall {

	public static void main(String[] args) {
		/*
		 * <<재귀 호출>>
		 * -메서드 내에서 메서드 자신을 호출하는 것이다.
		 * -재귀호출을 하는 메서드를 재귀 메서드라고 한다.
		 * -무한 반복을 벗어나기 위한 조건이 있어야 한다.
		 */
		// 팩토리얼: 4! == 4 * 3 * 2 * 1 == 24
		int result= factorial(4);
		System.out.println(result);
	}
	//메서드 생성 static 으로 만들지 않으려면 객체를 생성해줘야됨
	//static 없으면 인스턴스 메서드
	
	static int factorial(int n){
		int result =0;
		
		if(n == 1){
			result= 1;
		}else{
			result = n *factorial(n-1);
		}
		
		return result;
	}
}
