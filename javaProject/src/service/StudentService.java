package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import vo.LectureVO;
import vo.StudentVO;
import vo.UserVO;
import dao.StudentDao;
import data.LecSession;
import data.StuSession;

public class StudentService {

	/*private static StudentService instance;
	StudentDao studnetDao = StudentDao.getInstance();
	*/
	
	private StudentService() { }
			

	private static StudentService instance;
	

	
	public static StudentService getInstance(){
		if(instance == null){
			instance = new StudentService();
		}
		return instance;
	}

	
	
	StudentDao studentDao = StudentDao.getInstance();
	
	
	public void searchlect() {
		
		
	}
	
	
	public void login() {//로그인 메서드
		Scanner s = new Scanner(System.in);
		System.out.print("학번 : ");
		String id = s.nextLine();
		System.out.print("비밀번호 : ");
		String password = s.nextLine();
		
		//사번과 비밀번호 일치하는 교수 검색
		HashMap<String, String> param = new HashMap<String, String>();
		param.put("SN", id);
		param.put("PASSWORD", password);
		
		StudentVO stu = studentDao.selectProf(param);
		
		if(stu == null){
			System.out.println("학번 혹은 비밀번호가 일치하지 않습니다.");
			System.out.println("로그인 화면으로 이동합니다.");
			System.out.println();
			login();
		}else{
			StuSession.loginstu = stu;
			System.out.println("로그인 성공!");
			System.out.println(stu.getName()+", 로그인되었습니다.");
			System.out.println();
		}
	}
	public void mark(){
		Scanner s = new Scanner(System.in);
	}
	
	

		
	
	public void lecinfo(){
		int sel;
		
		ArrayList<UserVO> userList = userDao.selectUserList();
		Scanner s = new Scanner(System.in);
		
		ArrayList<LectureVO> tb_Lect = new ArrayList<LectureVO>(); 
		
		for(int i=0;i<tb_Lect.size();i++){
			database.tb_Lect.get(i).set;
			//database.tb_std.get(i).setPassword(newPw);
			break;
		
		}
		
		
		System.out.println("강의 번호\t: " + LecSession.lecstu.getLecnum());
		System.out.println("과목 번호\t: " + LecSession.lecstu.getSubNum());
		System.out.println("강의 요일\t: " + LecSession.lecstu.getDay());
		System.out.println("담당 교수\t: " + LecSession.lecstu.getProf());
		System.out.println("강의실\t: " + LecSession.lecstu.getRoom());
		System.out.println("강의 년도\t: " + LecSession.lecstu.getYear());
		System.out.println("학기\t: " + LecSession.lecstu.getSemester());
		System.out.println("교시\t: " + LecSession.lecstu.getTime());
		System.out.println("학점\t: " + LecSession.lecstu.getUnit());
		System.out.println("----------------------------------------------------");
		System.out.println();
		System.out.println("0. 뒤로가기");
		
		
		sel = Integer.parseInt(s.nextLine());
		switch(sel){
		case 0 : break;
		default :lecinfo();
		}
	}
	
	public void Stuinfo() {
		Scanner s = new Scanner(System.in);
		int select;
		
		System.out.println("-------------- "+ StuSession.loginstu.getName() +" 학생의 정보입니다. --------------");
		System.out.println("학 번\t: " + StuSession.loginstu.getStunum());
		System.out.println("학 과\t: " + StuSession.loginstu.getMajor());
		System.out.println("이 름\t: " + StuSession.loginstu.getName());
		System.out.println("전화번호\t: " + StuSession.loginstu.getTel());
		System.out.println("e-mail\t: " + StuSession.loginstu.getEmail());
		System.out.println("상 태\t: " + StuSession.loginstu.getState());
		System.out.println("----------------------------------------------------");
		System.out.println();
		System.out.println("1. 비밀번호변경 | 2. 전화번호변경 | 3. e-mail변경 | 0. 뒤로가기");
		
		select = Integer.parseInt(s.nextLine());
		switch(select){
		case 1 : stdpwChange(); Stuinfo(); break;
		case 2 : stdtelChange(); Stuinfo(); break;
		case 3 : stdemailChange(); Stuinfo(); break;
		case 0 : break;
		default : Stuinfo();
		}

	}
	public void stdpwChange(){//1-1. 비밀번호변경
		Scanner s = new Scanner(System.in);
		System.out.print("새로운 비밀번호 : ");
		String newPw = s.nextLine();
		studentDao.changePw(newPw);
		System.out.println("비밀번호 변경 완료");
	}
	
	public void stdtelChange(){//1-2. 전화번호변경
		Scanner s = new Scanner(System.in);
		System.out.print("새로운 전화번호 : ");
		String newTel = s.nextLine();
		studentDao.changeTel(newTel);
		System.out.println("전화번호 변경 완료");
	}
	
	public void stdemailChange(){//1-3. 이메일변경
		Scanner s = new Scanner(System.in);
		System.out.print("새로운 e-mail : ");
		String newEm = s.nextLine();
		studentDao.changeEmail(newEm);
		System.out.println("e-mail 변경 완료");
	}
	
	public void info(){//1. 내 정보 확인
		Scanner s = new Scanner(System.in);
		int select;
		
		System.out.println("-------------- "+ StuSession.loginstu.getName() +" 교수님의 정보입니다. --------------");
		System.out.println("사 번\t: " + StuSession.loginstu.getStunum());
		System.out.println("학 과\t: " + StuSession.loginstu.getMajor());
		System.out.println("이 름\t: " + StuSession.loginstu.getName());
		System.out.println("전화번호\t: " + StuSession.loginstu.getTel());
		System.out.println("e-mail\t: " + StuSession.loginstu.getEmail());
		System.out.println("상 태\t: " + StuSession.loginstu.getState());
		System.out.println("----------------------------------------------------");
		System.out.println();
		System.out.println("1. 비밀번호변경 | 2. 전화번호변경 | 3. e-mail변경 | 0. 뒤로가기");
		
		select = Integer.parseInt(s.nextLine());
		switch(select){
		case 1 : pwChange(); info(); break;
		case 2 : telChange(); info(); break;
		case 3 : emailChange(); info(); break;
		case 0 : break;
		default : info();
		}
	}
	
	
	
	public void pwChange(){//1-1. 비밀번호변경
		Scanner s = new Scanner(System.in);
		System.out.print("새로운 비밀번호 : ");
		String newPw = s.nextLine();
		studentDao.changePw(newPw);
		System.out.println("비밀번호 변경 완료");
	}
	
	
	public void telChange(){//1-2. 전화번호변경
		Scanner s = new Scanner(System.in);
		System.out.print("새로운 전화번호 : ");
		String newTel = s.nextLine();
		studentDao.changePw(newTel);
		System.out.println("전화번호 변경 완료");
	}
	
	public void emailChange(){//1-3. 이메일변경
		Scanner s = new Scanner(System.in);
		System.out.print("새로운 e-mail : ");
		String newEm = s.nextLine();
		studentDao.changePw(newEm);
		System.out.println("e-mail 변경 완료");
	}
	
	public void searchstu(){//3. 교수 검색
		Scanner s = new Scanner(System.in);
		int select;
		
		System.out.println("----------------------------------------------------");
		System.out.println("1. 학과로 검색");
		System.out.println("2. 학번으로 검색");
		System.out.println("3. 이름으로 검색");
		System.out.println("0. 뒤로 가기");
		System.out.println("----------------------------------------------------");
		System.out.println("검색할 방법을 고르세요.");
		
		select = Integer.parseInt(s.nextLine());
		switch(select){
		case 1 : searchByMajor(); break;
		case 2 : searchByStu(); break;
		case 3 : searchByName(); break;
		case 0 : break;
		default : searchstu();
		}
	}

	

	private void searchByMajor() {
		Scanner s = new Scanner(System.in);
		System.out.print("학과 : ");
		String major = s.nextLine();
		
		HashMap<String, String> param = new HashMap<String, String>();
		param.put("MAJOR", major);
		
		ArrayList<StudentVO> prList = studentDao.searchStu(param);
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("번호\t사번\t\t학과\t이름\t전화번호\t\te-mail\t\t\t상태");
		System.out.println("-----------------------------------------------------------------------------------");
		for(int i = 0; i < prList.size(); i++){
			StudentVO pr = prList.get(i);
			System.out.println(i+1 + "\t" + pr.getStunum() + "\t" + pr.getMajor() + "\t" 
					+ pr.getName() + "\t" + pr.getTel() + "\t" + pr.getEmail() + "\t" + pr.getState());
		}
		System.out.println("-----------------------------------------------------------------------------------");
		searchstu();
		
	}
	
	private void searchByStu() {
		// TODO Auto-generated method stub
		
	}

	private void searchByName() {
		// TODO Auto-generated method stub
		
	}

	

	
	
}
