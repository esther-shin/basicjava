package e_oop;

import java.util.Scanner;

public class SimLiTest {
	
	//9개의 질문을 9개의 매서드로 만들어주세요
	
	String a1 = ("나는 금사빠다."); 
	String a2 = ("연애할때 끌려다니는 타입이다.");
	String a3 = ("데이트 코스는 미리짜는게 편하다.");
	String a4 = ("감정기복이 크지 않다.");
	String a5 = ("감정 표현에 솔직한 편이다.");
	String a6 = ("활동적인 데이트가 좋다.");
	String a7 = ("연락이 없어도 믿고 기다리는 편이다.");
	String a8 = ("이성친구는 존재할 수 없다.");
	String a9 = ("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
	
	String y = ("yes");
	String n = ("no");
	
	Scanner str = new Scanner(System.in); //위에 한번만 생성해주면 됨.
	void q1(){ //void를 사용한 이유 : 돌려받을게 없고, 실행후 다음 메소드 불러오기만 하면되서
		System.out.println(a1);
		System.out.println("yes or no를 입력");
		
		String temp = str.nextLine();
	
		if(temp.equals("y")){ //String형의 내용을 비교할때는 .equals()로 문자열의 내용이 같은지 확인한다.
			q2();
		}else{
			q4();
		}
	}
	void q2(){
		System.out.println("연애할때 끌려다니는 타입이다.");
		System.out.println("yes or no를 입력");
		
		String temp = str.nextLine();
		if(temp.equals("y")){
			q5();
		}else{
			q3();
		}
		
	}
	
	void q3(){
		System.out.println("데이트 코스는 미리짜는게 편하다.");
		System.out.println("yes or no를 입력");
		
		String temp = str.nextLine();
		if(temp.equals("y")){
			q6();
		}else{
			q5();
		}
		
	}
	
	void q4(){
		System.out.println("감정기복이 크지 않다.");
		System.out.println("yes or no를 입력");
		String temp = str.nextLine();
		if(temp.equals("y")){
			q7();
		}else{
			q5();
		}
		
	}
		
	void q5(){
		System.out.println("감정 표현에 솔직한 편이다.");
		System.out.println("yes or no를 입력");
		String temp = str.nextLine();
		if(temp.equals("y")){
			q8();
		}else{
			q6();
		}
		
	}
	
	void q6(){
		System.out.println("활동적인 데이트가 좋다.");
		System.out.println("yes or no를 입력");
		String temp = str.nextLine();
		if(temp.equals("y")){
			q8();
		}else{
			q9();
		}
		
	}
	
	void q7(){
		System.out.println("연락이 없어도 믿고 기다리는 편이다.");
		System.out.println("yes or no를 입력");
		String temp = str.nextLine();
		if(temp.equals("y")){
			System.out.println("A형 타입");
		}else{
			q8();
		}
		
	}
	
	void q8(){
		System.out.println("이성친구는 존재할 수 없다.");
		System.out.println("yes or no를 입력");
		String temp = str.nextLine();
		if(temp.equals("y")){
			q9();
		}else{
			System.out.println("B형 타입");
		}
		
	}
	
	void q9(){
		System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
		System.out.println("yes or no를 입력");
		String temp = str.nextLine();
		if(temp.equals("y")){
			System.out.println("D형 타입");
		}else{
			System.out.println("C형 타입");
		}
		
	}
	
	}

