package dao;

import java.util.ArrayList;

import data.Database;
import vo.LectureVO;
import vo.UserVO;

public class LectDao {

private static LectDao instance;
	
	private LectDao(){}
	
	public static LectDao getInstance(){
		if(instance == null){
			instance = new LectDao();
		}
		return instance;
	}
	
	Database database = Database.getInstance();
	
	public ArrayList<LectureVO> selectUserList() {
		return database.tb_user;
	}
	ArrayList<LectureVO> tb_Lect();
}
