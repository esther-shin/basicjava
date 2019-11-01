package vo;

public class SugangListVO {//수강신청 내역
	//수강번호 학생 강의개설
	private int sugnum; //수강번호
	private String std; //학생
	private int lec; //강의개설
	
	public int getSugnum() {
		return sugnum;
	}
	public void setSugnum(int sugnum) {
		this.sugnum = sugnum;
	}
	public String getStd() {
		return std;
	}
	public void setStd(String std) {
		this.std = std;
	}
	public int getLec() {
		return lec;
	}
	public void setLec(int lec) {
		this.lec = lec;
	}
}
