package h_useful;

public class StringSpeedTest {

	public static void main(String[] args) {
//		String str ="a";
//		
//		long start =System.currentTimeMillis();
//		for(int i =0;i<200000;i++){
//			str +="a";
//		}
//		long end = System.currentTimeMillis();
//		System.out.println(end - start + "ms");
		
		
		//string클래스의 단점을 보안하기 위해 나옴.
		StringBuffer sb = new StringBuffer("a");
		
		long start =System.currentTimeMillis();
		for(int i = 0;i<200000;i++){
			sb.append("a");//문자열을 뒤에 계속 붙이는 거
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end - start + "ms");
	}

}
