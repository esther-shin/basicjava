package h_useful;

import java.util.Arrays;

public class StringClass {

	public static void main(String[] args) {
		/*
		 * equals()	:문자열을 비교하여 같으면 true 다르면  false를 반환한다.
		 * length()	:문자열의 길이를 반환한다.
		 * substring()	: 주어진 범위에 해당하는 문자열을 반환한다.
		 * charAt(): 지정된 위치의 문자를 반환한다.
		 * indexOf(): 주어진 문자의 위치를 반환한다.
		 * lastIndexOf(): 주어진 문자의 마지막 위치를 반환한다.
		 * replace(): 문자열 내의 주어진 문자(문자열)를 새로운 문자(문자열)로 바꾼 문자열을 반환한다.
		 * 
		 * replaceAll(): 문자열 내의 주어진 정규 표현식과 일치하는 문자열을 새로운 문자열로 바꾼 문자열을 반환한다.
		 * split(): 문자열을 주어진 정규표현식과 일치하는 문자열로 나누어 문자열 배열로 반환한다.
		 * startsWith(): 주어진 문자열로 시작하는지 여부를 반환한다.
		 * endsWith(): 주어진 문자열로 끝나는지 여부를 반환한다.
		 * toUpperCase(): 문자열을 대문자로 변환한 문자열을 반환한다.
		 * toLowerCase(): 문자열을 소문자로 변환한 문자열을 반환한다.
		 * trim():양 끝의 공백을 제거한 문자열을 반환한다.
		 */
		
		String str= "abc abc  acb";
		
		System.out.println(str.indexOf("a"));
		System.out.println(str.indexOf("a", 1));//4
		//0번은 건너뛰고 1부터 찾으라는 의미.
		System.out.println(str.indexOf("a",str.indexOf("a")+1));
		//a를 찾는 데 a의 인덱스 다음부터 찾아라
		System.out.println(str.lastIndexOf("a"));//9
		//마지막에 있는 a를 찾으라는 거
		
		System.out.println(str.replace("a","0"));
		//모든 a를 바꿔줌.
		System.out.println(str.replaceAll("[a-z]", "0"));
		//문자열의 패턴을 지정해 주는 것은 정규 표현식. 소문자 a 부터 z까지.
		
		System.out.println(Arrays.toString(str.split("")));
		//""을 기준으로 잘라서 표현해줌.
		System.out.println(Arrays.toString(str.split(" +")));
		//+의미 는 앞에 있는 공백이 1개 일수도 있고 여러개 일 수도 있다.
		
		System.out.println(str.startsWith("a"));
		System.out.println(str.startsWith("b"));//b로 시작하지 않아서 false가 나옴.
		
		System.out.println(str.endsWith("c"));//c로 끈나는지 여부.
		System.out.println(str.endsWith("b"));//b로 끈나는지 여부.
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toUpperCase().toLowerCase());
		
		String str2= " abc abc ";
		System.out.println(str2);
		System.out.println(str2.trim());// 앞뒤의 공백을 잘라준다.회원가입할떄 주로 사용됨. (아이디나 비밀번호)
		
		
	}

}
