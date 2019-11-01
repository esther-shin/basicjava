package h_useful;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		Date today= new Date();//현재 날짜
		System.out.println(today);
		
		//날짜 ->포맷 ->문자열
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		//mm은 분(minute)을 의미.
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss.sss");
		//24시간 기준. mm분ss초.sss밀리 세컨드 단위를 표현
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat sdf4 = new SimpleDateFormat("yy-MM-dd hh:mm:ss a");
		//hh는 12시간 기준 a는 오전인지 오후인지를 나타냄
		
		String format = sdf1.format(today);
		//ctrl 1 을 누르면 지역변수로 받겠다.
		//sdf1.format(today);리턴 타입이 있는 경우만
		System.out.println(format);
		System.out.println(sdf2.format(today));
		System.out.println(sdf3.format(today));
		System.out.println(sdf4.format(today));
		
		
		//문자열 ->포맷->날짜
		String str = "2019년 10월 16일";
		SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy년 MM월 dd일");
		//문자열과 동일한 포맷을 만들고
		//코딩을 하다가 에러가 이유없이 나는 경우  ctrl 1을 눌러서 try catch나 throw로 던져버려 해결
		try {
			Date dateStr = sdf5.parse(str);
			System.out.println(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}//시간이 세팅되지 않아서 00:00:00 으로 나옴.
		
		//getInstance:객체를 반환해주는 메소드
		Calendar cal = Calendar.getInstance();
		
		//날짜 셋팅
		cal.setTime(new Date());
		cal.set(2019, 9, 16);//2019/10/16(월이 0 부터 시작)
		System.out.println(sdf3.format(cal.getTime()));
		
		//날짜 계산
		cal.add(Calendar.YEAR, 1);
		//연도를 1 증가 시키겠다.
		cal.add(Calendar.MONTH, 2);
		cal.add(Calendar.DAY_OF_MONTH, -3);
		cal.add(Calendar.HOUR, 2);
		cal.add(Calendar.MINUTE, 5);
		cal.add(Calendar.SECOND, -10);
		
		System.out.println(sdf3.format(cal.getTime()));
	}
	
	
	

}








