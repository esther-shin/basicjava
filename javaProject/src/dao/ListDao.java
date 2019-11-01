package dao;

import java.util.ArrayList;

import vo.ProfessorVO;
import vo.StudentVO;
import data.Database;

public class ListDao {//검색기능의 다오

	private static ListDao instance;
	
	private ListDao(){}
	
	public static ListDao getInstance(){
		if(instance == null){
			instance = new ListDao();
		}
		return instance;
	}
	
	Database database = Database.getInstance();
	
//	public ArrayList<ProfessorVO> listPr(){//교수 전체 리스트 가져오기
//		return database.tb_prf;
//	}
	public ArrayList<StudentVO> listSt(){//학생 전체 리스트 가져오기
		return database.tb_std;
	}package dao;

import java.util.ArrayList;

import vo.ProfessorVO;
import vo.StudentVO;
import data.Database;

public class ListDao {//검색기능의 다오

	private static ListDao instance;
	
	private ListDao(){}
	
	public static ListDao getInstance(){
		if(instance == null){
			instance = new ListDao();
		}
		return instance;
	}
	
	Database database = Database.getInstance();
	
//	public ArrayList<ProfessorVO> listPr(){//교수 전체 리스트 가져오기
//		return database.tb_prf;
//	}
	public ArrayList<StudentVO> listSt(){//학생 전체 리스트 가져오기
		return database.tb_std;
	}

}


}
