package data;

import java.util.ArrayList;

import vo.StudentVO;

public class ListDao {//리스트검색기능의 다오

	private static ListDao instance;
	
	private ListDao(){}
	
	public static ListDao getInstance(){
		if(instance == null){
			instance = new ListDao();
		}
		return instance;
	}
	
	Database database = Database.getInstance();
	
	public ArrayList<StudentVO> listPr(){//학생 전체 리스트 가져오기
		return database.tb_std;
	}
	

}

