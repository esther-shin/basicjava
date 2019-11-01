package controller;

import java.util.Scanner;


import service.StudentService;
import data.StuSession;

public class Controller {
	

	public static void main(String[] args) {
		
		new Controller().start();

	}
	
	StudentService studentService = StudentService.getInstance();

	private void start() {//처음 화면
		Scanner s = new Scanner(System.in);
		int select;
		
		System.out.println("-------- OO대학교 학사관리 페이지에 어서 오십시오. --------");
		System.out.println("1. 관리자");
		System.out.println("2. 교 수");
		System.out.println("3. 학 생");
		System.out.println("0. 페이지 나가기");
		System.out.println("----------------------------------------------------");
		System.out.println("로그인하시려는 유형을 선택해주세요.");
		
		select = Integer.parseInt(s.nextLine());
		switch(select){
		case 1 : admin(); break;
		case 2 : professor(); break;
		case 3 : student(); break;
		case 0 : System.out.println("종료합니다."); break;
		default : start(); break;
		}
		
	}

	private void admin() {//관리자 로그인
		
		adminMenu();
	}

	private void professor() {//교수 로그인
		
		prMenu();
	}

	private void student() {//학생 로그인
				
		studentService.login();
		stMenu();
		
	}
	
	
	private void adminMenu() {//관리자 관리 화면
		Scanner s = new Scanner(System.in);
		int select;
		
		System.out.println("------------ 관리자님의 학사관리 화면입니다. ------------");
		System.out.println("1. 교수 관리");
		System.out.println("2. 학생 관리");
		System.out.println("3. 교과목 관리");	
		System.out.println("4. 교수 검색");
		System.out.println("5. 수강 관리");
		System.out.println("6. 전체 학생 검색");
		System.out.println("0. 로그아웃");
		System.out.println("----------------------------------------------------");
		System.out.println("실행할 메뉴를 선택해주세요.");
		
		select = Integer.parseInt(s.nextLine());
		switch(select){
		case 1 :  break;
		case 2 :  break;
		case 3 :  break;
		case 4 :  break;
		case 5 :  break;
		case 6 :  break;
		case 0 : start(); break;
		default : adminMenu();
		}
	}
	
	private void prMenu() {
		// TODO Auto-generated method stub
		
	}
	private void stMenu() {
		Scanner s = new Scanner(System.in);
		int select;
		
		do{
			System.out.println("---------- "+ StuSession.loginstu.getName() +", 로그인되었습니다. ----------");
			System.out.println("1. 본인 정보 확인");
			System.out.println("2. 수강신청");
			System.out.println("3. 수강 신청 내역 확인");
			System.out.println("4. 현재 성적 조회");
			System.out.println("5. 전체 성적 조회");
			System.out.println("0. 로그아웃");
			System.out.println("----------------------------------------------------");
			System.out.println("실행할 메뉴를 선택해주세요.");
			
			select = Integer.parseInt(s.nextLine());
			switch(select){
			case 1 : studentService.Stuinfo(); break;
			case 2 : studentService.lecinfo(); break;
			case 3 : studentService.searchlect(); break;
			case 4 : studentService.mark(); break;
			case 0 : StuSession.loginstu = null; start(); break;
			default : prMenu();
			}
		}while(select != 0);
	}
		
	
	

}
