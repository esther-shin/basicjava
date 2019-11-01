package e_oop.class_making;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		
		VendingMachine vm = new VendingMachine();
		System.out.println("-----------------------------------------------");
		System.out.println(" 1.콜라(600), 2.환타(550) 3.사이다(370) 4.물(420)");
		System.out.println("-----------------------------------------------");
		System.out.println();
		
		vm.drinks();
		
	}	
	
	Scanner sc = new Scanner(System.in);
	
			int drinks;
			int bebida;
			int coke;
			int fanta;
			int sprite;
			int water;
			int bill1,bill2,bill3,bill4;
			int rest;
			
			int price;
			int rest1, rest2, rest3, rest4;
			int loading;
			String additional;
			String add;
			
		VendingMachine(){
		
			coke=600;
			fanta=550;
			sprite=370;
			water=420;
			
		}
		
	
		
		void drinks(){
			System.out.println("음료를 선택하세요");
			drinks = Integer.parseInt(sc.nextLine());
			
			if(drinks ==1){
				System.out.println("콜라를 선택하셨습니다." );
				coke();
			}else if(drinks ==2){
				System.out.println("환타를 선택하셨습니다." );
				fanta();
			}else if(drinks ==3){
				System.out.println("사이다를 선택하셨습니다." );
				sprite();
			}else if(drinks ==4){
				System.out.println("물을 선택하셨습니다." );
				water();
			}else if(drinks!=1||drinks!=2||drinks!=3||drinks!=4){
				System.out.println("제대로 입력하세요.");
				drinks();
			}
			
		}

		
		int[] sm = new int[30]; 
		
		
		void coke(){
			
			System.out.println("금액을 입력해주세요");
			bill1 = Integer.parseInt(sc.nextLine());
			
			if(bill1< coke ){
				rest1 = coke-bill1;
				System.out.println(rest1+ "원이 부족합니다.돈을 반환합니다.");
				coke();
			}else if(bill1 == coke){
				System.out.println("음료가 준비되었습니다.");
				
				}else{ coke();}
			addtional();
		}
		
		
		
		
		
		
		void fanta(){
			
			System.out.println("금액을 입력해주세요");
			bill2 = Integer.parseInt(sc.nextLine());
			
			if(bill2<fanta){
				rest2 = fanta-bill2;
				System.out.println(rest2+ "원이 부족합니다.돈을 반환합니다.");
				fanta();
			}if(bill2 == fanta){
			System.out.println("음료가 준비되었습니다.");
			
			}	
			addtional();
		}
		
		
		
		
		void sprite(){
			
			System.out.println("금액을 입력해주세요");
			bill3 = Integer.parseInt(sc.nextLine());
			
			if(bill3< sprite ){
				rest3 = sprite-bill3;
				System.out.println(rest3+ "원이 부족합니다.돈을 반환합니다.");
				sprite();
			}if(bill3 == sprite){
				System.out.println("음료가 준비되었습니다.");
				
				}	
			addtional();
		}
		
		
		void water(){
			
			System.out.println("금액을 입력해주세요");
			bill4 = Integer.parseInt(sc.nextLine());
			
			if(bill4< water ){
				rest4 = water-bill4;
				System.out.println(rest4+ "원이 부족합니다.돈을 반환합니다.");
				
			}if(bill4 == water){
				System.out.println("음료가 준비되었습니다.");
				
				}
			addtional();
		}
		
		
		
		void addtional(){
			System.out.println("더 주문하시겠습니까? yes or no");
			String add= sc.nextLine();
			
			
				if(add.equals("yes")){
					drinks();
				}else if(add.equals("no")){
					end();
					
				}
				System.out.println();
			}
		
		void end(){
			System.out.println("이용해 주셔서 감사합니다.");
		}
			
			
			
		}
		
	

