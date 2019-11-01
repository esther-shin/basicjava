package i_collection;

import java.util.ArrayList;

public class ScoreArrayList {

	public static void main(String[] args) {
		/*
		 *우리반 모두의 Java, Oracle,html,J Query, JSP 정수를 
		 *50~100까지 랜덤으로 생성시켜주고
		 *석차순으로 석차,이름,과목별, 점수, 총점, 평균을 출력해주세요. 		
		 *
		 *석차	 이름  Java	Oracle HTML JQuery JSP  총점  평균
		 * 1	오동규 100 	100	   100   100   100  100  100
		 * 1	오동규 100 	100	   100   100   100  100  100
		 * 1	오동규 100 	100	   100   100   100  100  100
		 * 1	오동규 100 	100	   100   100   100  100  100
	  	 */
		
		ArrayList<ArrayList<Double>> list = new ArrayList<ArrayList<Double>>();
		
		ArrayList<String> student = new ArrayList<String>();
		
		
		student.add("오동규");
		student.add("박재욱");
		student.add("오제민");
		student.add("전보영");
		student.add("유지상");
		student.add("박신규");
		student.add("진주호");
		student.add("지원희");
		student.add("한승희");
		student.add("안정현");
		student.add("이이슬");
		student.add("이정은");
		student.add("이선욱");
		student.add("조건희");
		student.add("최효은");
		student.add("김혜정");
		student.add("김명성");
		student.add("신유진");
		student.add("조윤호");
		student.add("신유진");
		student.add("조아라");
		student.add("백운영");
		student.add("최도혁");
		student.add("김영호");
		student.add("박희제");
		student.add("현솔비");
		
		
		
		
		//------------------------------------
		ArrayList<String> subject = new ArrayList<String>();
		
		subject.add("석차");
		subject.add("이름");
		subject.add("Java");
		subject.add("Oracle");
		subject.add("HTML");
		subject.add("JQuery");
		subject.add("JSP");
		subject.add("총점");
		subject.add("평균");
		
		
		
		
		
		//--------------------------------------(점수)
		
		ArrayList<Double> sc = new ArrayList<Double>();
		
		//int grade=0;
		
		
		for(int i=0;i<sc.size();i++){
			for(int j=0;j<5;j++){
				;
				sc.add((Math.random()*51)+50);
			}
			list.add(sc);
			
		}
		
		
		
		//--------------------------------------(합,평균)
		
		
		int sum=0;
		double average=0;
		
		
		for(int i=0;i<sc.size();i++){
			for(int j=0;j<5;j++){
			sum += sc.get(i);
			}
			average=(double)sum/5;
		}
		
		
		//----------------------------------------(석차)
		
		int rank=1;
		String namet = "";
		
		
		for(int i=0; i<sc.size()-1;i++){
			for(int j=i+1;j<sc.size();j++){
				if(list.get(i).get(0)>list.get(j).get(0)){
					ArrayList<ArrayList<Double>> temp = new ArrayList<ArrayList<Double>>();
					
					temp.add(list.get(i));
					list.set(i,list.get(j));
					list.set(j,temp.get(0));
					
					namet = student.get(i);
					student.set(i,student.get(j));
					student.set(j,namet);
					
					
				}
			}
		}
		
		
		
	//--------------------------------------------(출력)
		
		
		
		
		
	}

}
