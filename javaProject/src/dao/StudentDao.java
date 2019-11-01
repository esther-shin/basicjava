


package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import vo.StudentVO;
import data.Database;
import data.StuSession;

public class StudentDao {//사용자 정보 확인 다오

	private static StudentDao instance;
	
	private StudentDao(){}
	
	public static StudentDao getInstance(){
		if(instance == null){
			instance = new StudentDao();
		}
		return instance;
	}
	
	Database database = Database.getInstance();



package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import vo.StudentVO;
import data.Database;
import data.StuSession;

public class StudentDao {//사용자 정보 확인 다오

	private static StudentDao instance;
	
	private StudentDao(){}
	
	public static StudentDao getInstance(){
		if(instance == null){
			instance = new StudentDao();
		}
		return instance;
	}
	
	Database database = Database.getInstance();
	
 	//키워드로 테이블에 저장되어 있는 값 확인해서 비교하기
	public StudentVO selectProf(HashMap<String, String> param) { 
		StudentVO rtnUser = null;
		for(int i = 0; i<database.tb_std.size(); i++){
			StudentVO user = database.tb_std.get(i);
			boolean flag = true;
			
			Set<String> keys = param.keySet();
			for(String key : keys){
				String value = param.get(key);
				if(key.equals("SN")){
					if(!user.getStunum().equals(value)){
						flag = false;
					}
				}else if(key.equals("PASSWORD")){
					if(!user.getPassword().equals(value)){
						flag = false;
					}
				}else if(key.equals("MAJOR")){
					if(!user.getMajor().equals(value)){
						flag = false;
					}
				}else if(key.equals("NAME")){
					if(!user.getName().equals(value)){
						flag = false;
					}
				}else if(key.equals("TEL")){
					if(!user.getTel().equals(value)){
						flag = false;
					}
				}else if(key.equals("EMAIL")){
					if(!user.getEmail().equals(value)){
						flag = false;
					}
				}else if(key.equals("STATE")){
					if(!user.getState().equals(value)){
						flag = false;
					}
				}
			}
			if(flag){
				rtnUser = user;
			}
		}
		return rtnUser;
	}
	
	//비밀번호 변경 기능
	public void changePw(String newPw){
		for(int i = 0; i < database.tb_std.size(); i++){
			if(StuSession.loginstu.getStunum() == database.tb_std.get(i).getStunum()){
				database.tb_std.get(i).setPassword(newPw);
				break;
			}
		}
	}
	//전화번호 변경 기능
	public void changeTel(String newTel){
		System.out.println(StuSession.loginstu.getStunum());
		for(int i = 0; i < database.tb_std.size(); i++){
			if(StuSession.loginstu.getStunum() == database.tb_std.get(i).getStunum()){
				database.tb_std.get(i).setTel(newTel);
				break;
			}
		}
	}
	//이메일 변경 기능
	public void changeEmail(String newEm){
		for(int i = 0; i < database.tb_std.size(); i++){
			if(StuSession.loginstu.getStunum() == database.tb_std.get(i).getStunum()){
				database.tb_std.get(i).setEmail(newEm);
				break;
			}
		}
	}
	
	
	//학생 검색 기능 / 키워드로 테이블에 있는 값 비교해서 리스트로 다시 리턴
	public ArrayList<StudentVO> searchStu(HashMap<String, String> param){
		ArrayList<StudentVO> stlist = new ArrayList<StudentVO>();
		for(int i = 0; i<database.tb_std.size(); i++){
			StudentVO user = database.tb_std.get(i);
			boolean flag = true;
			
			Set<String> keys = param.keySet();
			for(String key : keys){
				String value = param.get(key);
				if(key.equals("SN")){
					if(!user.getStunum().equals(value)){
						flag = false;
					}
				}else if(key.equals("MAJOR")){
					if(!user.getMajor().equals(value)){
						flag = false;
					}
				}else if(key.equals("NAME")){
					if(!user.getName().equals(value)){
						flag = false;
					}
				}
			}
			
			if(flag){
				stlist.add(user);
			}
		}
		return stlist;
	}

	
	
}




 	//키워드로 테이블에 저장되어 있는 값 확인해서 비교하기
	public StudentVO selectProf(HashMap<String, String> param) { 
		StudentVO rtnUser = null;
		for(int i = 0; i<database.tb_std.size(); i++){
			StudentVO user = database.tb_std.get(i);
			boolean flag = true;
			
			Set<String> keys = param.keySet();
			for(String key : keys){
				String value = param.get(key);
				if(key.equals("SN")){
					if(!user.getStunum().equals(value)){
						flag = false;
					}
				}else if(key.equals("PASSWORD")){
					if(!user.getPassword().equals(value)){
						flag = false;
					}
				}else if(key.equals("MAJOR")){
					if(!user.getMajor().equals(value)){
						flag = false;
					}
				}else if(key.equals("NAME")){
					if(!user.getName().equals(value)){
						flag = false;
					}
				}else if(key.equals("TEL")){
					if(!user.getTel().equals(value)){
						flag = false;
					}
				}else if(key.equals("EMAIL")){
					if(!user.getEmail().equals(value)){
						flag = false;
					}
				}else if(key.equals("STATE")){
					if(!user.getState().equals(value)){
						flag = false;
					}
				}
			}
			if(flag){
				rtnUser = user;
			}
		}
		return rtnUser;
	}
	
	//비밀번호 변경 기능
	public void changePw(String newPw){
		for(int i = 0; i < database.tb_std.size(); i++){
			if(StuSession.loginstu.getStunum() == database.tb_std.get(i).getStunum()){
				database.tb_std.get(i).setPassword(newPw);
				break;
			}
		}
	}
	//전화번호 변경 기능
	public void changeTel(String newTel){
		System.out.println(StuSession.loginstu.getStunum());
		for(int i = 0; i < database.tb_std.size(); i++){
			if(StuSession.loginstu.getStunum() == database.tb_std.get(i).getStunum()){
				database.tb_std.get(i).setTel(newTel);
				break;
			}
		}
	}
	//이메일 변경 기능
	public void changeEmail(String newEm){
		for(int i = 0; i < database.tb_std.size(); i++){
			if(StuSession.loginstu.getStunum() == database.tb_std.get(i).getStunum()){
				database.tb_std.get(i).setEmail(newEm);
				break;
			}
		}
	}
	
	
	//학생 검색 기능 / 키워드로 테이블에 있는 값 비교해서 리스트로 다시 리턴
	public ArrayList<StudentVO> searchStu(HashMap<String, String> param){
		ArrayList<StudentVO> stlist = new ArrayList<StudentVO>();
		for(int i = 0; i<database.tb_std.size(); i++){
			StudentVO user = database.tb_std.get(i);
			boolean flag = true;
			
			Set<String> keys = param.keySet();
			for(String key : keys){
				String value = param.get(key);
				if(key.equals("SN")){
					if(!user.getStunum().equals(value)){
						flag = false;
					}
				}else if(key.equals("MAJOR")){
					if(!user.getMajor().equals(value)){
						flag = false;
					}
				}else if(key.equals("NAME")){
					if(!user.getName().equals(value)){
						flag = false;
					}
				}
			}
			
			if(flag){
				stlist.add(user);
			}
		}
		return stlist;
	}

	
	
}



