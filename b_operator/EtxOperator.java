package b_operator;

public class EtxOperator {

	public static void main(String[] args) {

		/*
		 * <<비트 연산자>>//1byte는 8비트.
		 * -|(OR)	:피연산자 중 한 쪽이라도 값이 1이면, 1 을 그외는 0을 결과로 얻는다.
		 * -&(AND)	:피연산자 양쪽이 모두 1이어야만 1을 그외는 0을 결과로 얻는다.
		 * -^(XOR)	:피연산자의 값이 서로 다를 때만 1을 같을때는 0을 결과로 얻는다.//exclusive or 
		 * -~(비트전환):피연산를 0은 1로 1은 0으로 바꾼다.
		 * -<<(쉬프트):피연산자의 각 자리를 왼쪽으로 이동시킨다. 빈간을 0으로 채운다.
		 * ->>(쉬프트):피연산자의 각 자리를 오른쪽으로 이동시킨다. 빈칸은 앞자리와 동일한 값으로 채운다.
		 * 
		 * <<기타 연산자>>//클래스 내에 있는 변수에 접근할때 사용
		 * -.(참조 연산자):특정 범위내에 속해 있는 멤버를 지칭할 때 사용한다.
		 * -(type):형변환(casting)
		 * -?:(삼항연산자):조건식? 조건식이 참일 경우 수행할 문장 : 조건식이 거짓일 경우 수행할 문장//중요
		 * -instanceof: 참조형타입 확인 
		 * 
		 */
		
		//1바이트는 8비트로 이루어져있고 1비트는 0또는 1을 표현할 수 있다.
		//즉, 1바이트는 8개의 0 또는 1을 표현할 수 있다.
		
		/*
		 * -10진수 ->2진수: 10진수 값을 1이 될때까지 2로 나눈다.
		 *10
		 * 5 0
		 * 2 1
		 * 1 0 ==1010
		 * 
		 * -2진수 -> 10진수 : 각 자리에 1, 2, 4, 8, 16 ...를 곱한 값을 더한다.
		 * 1 0 1 0
		 * 8 4 2 1
		 * 8+0+2+0 = 10 
		 * 
		 * 
		 *15를 이진수로 바꾸기
		 *15 
		 * 7 1
		 * 3 1
		 * 1 1 =1111
		 * 
		 * 1 1 1 1
		 * 8 4 2 1
		 * 8+4+2+1= 15
		 */
		
		
		//10 : 00001010 
		//15 : 00001111
		
		
		//| : 00001111 //둘 중 하나라도 1이면 1.
		System.out.println( 10|15 ); //15
		
		//& : 00001010//둘다 1이여야만 1.
		System.out.println(10&15);//10
		
		//^ :00000101//XOR서로 다르면 1 (&의 반댓값) 
		System.out.println(10^15);//5
		
		//~ : 11110101
		System.out.println(~10);//-11
		
		//<< : 00010100
		System.out.println(10 << 1);//20
		
		//>> : 00000101
		System.out.println(10 >> 1);//5
		
		int x = 10;
		int y = 20;
		int result = (x < y) ? x : y; //true 면 x값이 result에 저장 false 일 경우 y 값이 저장됨.
		
		
		//시험점수가 60점 이상이면 합격 미만이면 불합격.
		int score = 60;
		String res = 60 <= score ? "합격" : "불합격"; 
		System.out.println(score + "점은" + res + "입니다." );
		
		//주민등록번호 뒷자리의 첫번째 숫자가 1 이면 남자 2면 여자
//		int regNo =5;//주민등록번호 첫자리
//		String gender = 1 == regNo ? "남자" : "여자";
//		System.out.println( "당신의 성별은" + gender + "입니다");
//		
//		gender = regNo ==1? "남자" : (regNo == 2? "여자" :"확인불가");
//		System.out.println( "당신의 성별은" + gender + "입니다");
		
		//문제1. 두개의 변수에 저장된 수 중에 큰 숫자를 출력해주세요.
		
		int a = 30;
		int b = 20;
		int bigger = a > b ? a : b;
		System.out.println(bigger);
		
		//문제 2. 변수에 저장된 수의 절대값을 출력해주세요.
		int c = -5;
		int abs= c <= 0 ? c : -c;
		System.out.println(abs);
		
		//문제3. 변수에 저장된 주민등록번호 뒷자리의 첫번째 숫자가 1이나 3이면 남자를 
		//2나 4면 여자를 출력해주세요
		//그외의 숫자를 입력하면 "잘못 입력하셨습니다."를 출력해주세요.
		
		int d = 3;
		String gen = d == 1 || d ==3 ? "남자" : d == 2 || d ==4 ? "여자" : "잘못 입력하셨습니다";
		System.out.println(gen);
		
		
	}

}
