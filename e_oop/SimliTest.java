package e_oop;

import java.util.Scanner;

public class SimliTest {

//9개의 질문을 9개의 메서드로 만들어주세요.
	
	
	Scanner answer= new Scanner(System.in);
	
	void question1 (){
		System.out.println("나는 금사빠다.");
		System.out.println("yes일 경우 1 번, no일 경우 2 번");
		
		String a = answer.nextLine();
		int asw = Integer.parseInt(a);
		
	
		switch(asw){
			case 1:
				question2();
				break;
			case 2:
				question4();
				break;
			
		}
		
		if(asw !=1 ||asw !=2){
				question1();
			}
		
		}		
	
	 void question2(){
		 System.out.println("연애할 때 끌려다니는 타입이다.");
		 System.out.println("yes일 경우 1 번, no일 경우 2 번");
			String a = answer.nextLine();
			int asw = Integer.parseInt(a);
			
		
			switch(asw){
				case 1:
					question5();
					break;
				case 2:
					question3();
					break;
			}
			if(asw !=1 ||asw !=2){
				question1();
			}
		 
	 }
	 
	 void question3(){
		 System.out.println("데이트 코스는 미리 짜는 게 편하다.");
		 System.out.println("yes일 경우 1 번, no일 경우 2 번");
			String a = answer.nextLine();
			int asw = Integer.parseInt(a);
			
		
			switch(asw){
				case 1:
					question6();
					break;
				case 2:
					question5();
					break;
			}
			if(asw !=1 ||asw !=2){
				question1();
			}
	 }
	 
	 void question4(){
		 System.out.println("감정기복이 크지 않다.");
		 System.out.println("yes일 경우 1 번, no일 경우 2 번");
			String a = answer.nextLine();
			int asw = Integer.parseInt(a);
			
		
			switch(asw){
				case 1:
					question7();
					break;
				case 2:
					question5();
					break;
			}
			if(asw !=1 ||asw !=2){
				question1();
			}
	 }
	 
	 void question5(){
		 System.out.println("감정표현에 솔직한 편이다.");
		 System.out.println("yes일 경우 1 번, no일 경우 2 번");
			String a = answer.nextLine();
			int asw = Integer.parseInt(a);
			
		
			switch(asw){
				case 1:
					question8();
					break;
				case 2:
					question6();
					break;
			}
			if(asw !=1 ||asw !=2){
				question1();
			}
	 }
	 
	 void question6(){
		 System.out.println("활동적인 데이트가 좋다.");
		 System.out.println("yes일 경우 1 번, no일 경우 2 번");
			String a = answer.nextLine();
			int asw = Integer.parseInt(a);
			
		
			switch(asw){
				case 1:
					question8();
					break;
				case 2:
					question9();
					break;
			}
			if(asw !=1 ||asw !=2){
				question1();
			}
	 }
	 
	 void question7(){
		 System.out.println("연락이 없어도 믿고 기다리는 편이다.");
			String a = answer.nextLine();
			int asw = Integer.parseInt(a);
			
		
			switch(asw){
				case 1:
					result1();
					break;
				case 2:
					question8();
					break;
			}
			if(asw !=1 ||asw !=2){
				question1();
			}
	 }
	 
	 void question8(){
		 System.out.println("이성친구는 존재할 수 없다");
			String a = answer.nextLine();
			int asw = Integer.parseInt(a);
			
		
			switch(asw){
				case 1:
					question9();
					break;
				case 2:
					result2();
					break;
			}
			if(asw !=1 ||asw !=2){
				question1();
			}
		 
	 }
	 
	 void question9(){
		 System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다");
			String a = answer.nextLine();
			int asw = Integer.parseInt(a);
			
		
			switch(asw){
				case 1:
					result4();
					break;
				case 2:
					result3();
					break;
			}
			if(asw !=1 ||asw !=2){
				question1();
			}
	 }
	 
	 void result1(){
		 System.out.println("A");
	 }
	 void result2(){
		 System.out.println("B");
	 }
	 void result3(){
		 System.out.println("C");
	 }
	 void result4(){
		 System.out.println("D");
	 }
	
	
	
}
