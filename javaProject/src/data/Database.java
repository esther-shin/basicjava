package data;

import java.util.ArrayList;

import vo.LectureVO;
import vo.StudentVO;

public class Database {
   
   private static Database instance;
   
   private Database(){}
   
   public static Database getInstance(){
      if(instance == null){
         instance = new Database();
      }
      return instance;
   }
   
   public ArrayList<StudentVO> tb_std = new ArrayList<StudentVO>();
   
   
   
   {
      StudentVO user = new StudentVO();
      user.setStunum("20090381");
      user.setPassword("asdf1234");
      user.setMajor("사학과");
      user.setName("조건희");
      user.setTel("010-1234-5678");
      user.setEmail("dun4603@gmail.com");
      user.setState("재직");
      
      tb_std.add(user);
   }
   
   {
      StudentVO user = new StudentVO();
      user.setStunum("200900380");
      user.setPassword("1234asdf");
      user.setMajor("사학과");
      user.setName("오제민");
      user.setTel("010-4336-6821");
      user.setEmail("dun4602@naver.com");
      user.setState("재학");
      
      tb_std.add(user);
   }
   
   {
      StudentVO user = new StudentVO();
      user.setStunum("1111");
      user.setPassword("2222");
      user.setMajor("사학과");
      user.setName("건희");
      user.setTel("010-2222-3333");
      user.setEmail("rjsgml");
      user.setState("재학");
      
      tb_std.add(user);      
   }
   

   public ArrayList<LectureVO> tb_Lect = new ArrayList<LectureVO>();   
   
   
   {
      LectureVO user = new LectureVO();
      user.setLecnum(1);
      user.setSubNum(12);
      user.setDay("수요일");
      user.setProf("건희교수");
      user.setRoom("090520");
      user.setYear(2019);
      user.setSemester("1학기");
      user.setTime("1교시");
      user.setUnit(3);      
      
      tb_Lect.add(user);
   }
   
   {
      LectureVO user = new LectureVO();
      user.setLecnum(2);
      user.setSubNum(15);
      user.setDay("수요일");
      user.setProf("정현교수");
      user.setRoom("090220");
      user.setYear(2019);
      user.setSemester("1학기");
      user.setTime("2교시");
      user.setUnit(3);      
      
      tb_Lect.add(user);
   }
   
   {
      LectureVO user = new LectureVO();
      user.setLecnum(3);
      user.setSubNum(16);
      user.setDay("수요일");
      user.setProf("유진교수");
      user.setRoom("090420");
      user.setYear(2017);
      user.setSemester("2학기");
      user.setTime("4교시");
      user.setUnit(3);      
      
      tb_Lect.add(user);
   }
   
   {
      LectureVO user = new LectureVO();
      user.setLecnum(4);
      user.setSubNum(17);
      user.setDay("수요일");
      user.setProf("혜정교수");
      user.setRoom("090520");
      user.setYear(2017);
      user.setSemester("2학기");
      user.setTime("2교시");
      user.setUnit(3);      
      
      tb_Lect.add(user);
   }
   
   {
      LectureVO user = new LectureVO();
      user.setLecnum(5);
      user.setSubNum(18);
      user.setDay("수요일");
      user.setProf("제민교수");
      user.setRoom("06020");
      user.setYear(2019);
      user.setSemester("1학기");
      user.setTime("2교시");
      user.setUnit(3);      
      
      tb_Lect.add(user);
   }
   
}