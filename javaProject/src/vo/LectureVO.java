package vo;

public class LectureVO {//강의 개설 VO
   //강의번호 과목 담당교수 강의요일 강의시간 강의실 학점 년도 학기
   private int lecnum; //강의 번호
   private int subNum; //과목번호   
   private String prof; //담당교수
   private String day; //강의 요일
   private String time; //강의 시간
   private String room; //강의실
   private int unit; //학점
   
   public int getSubNum() {
      return subNum;
   }
   public void setSubNum(int subNum) {
      this.subNum = subNum;
   }
   private int year; //년도
   private String semester; //학기
   
   public int getLecnum() {
      return lecnum;
   }
   public void setLecnum(int lecnum) {
      this.lecnum = lecnum;
   }
   
   public String getProf() {
      return prof;
   }
   public void setProf(String prof) {
      this.prof = prof;
   }
   public String getDay() {
      return day;
   }
   public void setDay(String day) {
      this.day = day;
   }
   public String getTime() {
      return time;
   }
   public void setTime(String time) {
      this.time = time;
   }
   public String getRoom() {
      return room;
   }
   public void setRoom(String room) {
      this.room = room;
   }
   public int getUnit() {
      return unit;
   }
   public void setUnit(int unit) {
      this.unit = unit;
   }
   public int getYear() {
      return year;
   }
   public void setYear(int year) {
      this.year = year;
   }
   public String getSemester() {
      return semester;
   }
   public void setSemester(String semester) {
      this.semester = semester;
   }
}