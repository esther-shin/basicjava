package h_useful;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
	/*
	 * 정규식표현: 문자열의 패턴을 검사하는 표현식
	 * 
	 * ^	뒷문자로 시작
	 * $	앞문자로 종료
	 * .	임의의 문자(줄바꿈 제외)
	 * *	앞문자 0개 이상
	 * +	앞문자 1개 이상
	 * ?	앞문자가 없거나 1개
	 * [] 	문자의 집합이나 범위([a-z]: a부터 z까지, [^a-z]:a 부터z가 아닌것)
	 * {} 	앞 문자의 개수({2}:2개,{2,4}:2개 이상 4개 이하)
	 * () 	그룹화(1개의 문자처럼 인식)
	 * | 	OR 연산
	 * \s 	공백, 탭, 줄바꿈
	 * \S 	공백, 탭, 줄바꿈이 아닌 문자
	 * \w 	알파벳이나 숫자
	 * \W 	알파벳이나 숫자가 아닌 문자
	 * \d 	숫자
	 * \D 	숫자가 아닌 문자
	 * (?i) 뒷문자의 대소문자 구분 안함
	 * \	정규표현식에서 사용되는 특수 문자 표현
	 * 
	 */

		String str="abc123";
//		String regex = "[a-z]{3}[0-9]{1,3}";
		//a에서 z까지 3개 0-9에서 1개 이상 3개 이하
//		String regex = "[a-z0-9]+";
//		String regex = "\\w*";
		//자바에서는 /가 탈출문자로 사용되기 때문에 1개만 넣으면 정규표현식이 안됨.
		String regex = ".*";
		//패턴을 만들때는 좁게 걸러내도록 만드는 게 좋다.
		Pattern p = Pattern.compile(regex);
		
		Matcher m = p.matcher(str);
		
		System.out.println(m.matches());
		
		//아이디,전화번호, 이메일주소의 유효성을 검사하는 정규표현식을 만들어 주세요.
		
		String id="asdfg12";
		String reg = "(?i)[a-z]{1,15}";
		
		
		Pattern b = Pattern.compile(reg);
		
		Matcher a = b.matcher(id);
		
		System.out.println(a.matches());
		
		
		String tel = "01012341234";
		String chk = "[0-9]{1,11}";
		
		
		Pattern c = Pattern.compile(chk);
		
		Matcher te = c.matcher(tel);
		
		System.out.println(te.matches());
		
		
		
		String email = "computer@abcdefg.com";
		String cfm = "(?i)[a-z]{1,15}@[a-z]{1,7}[\\.com]{4}";
		
		Pattern bb = Pattern.compile(cfm);
		
		Matcher aa = bb.matcher(email);
		
		System.out.println(aa.matches());
				
	}

}








