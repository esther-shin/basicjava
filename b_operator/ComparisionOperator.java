package b_operator;

public class ComparisionOperator {

	public static void main(String[] args) {
		/*<비교연산자>>
		 * - < :작다
		 * - > :크다
		 * - <= :작거나 크다
		 * - >= :크거나 같다
		 * - == :같다
		 * - != :같지 않다.
		 */
		
		 boolean b = 10 < 20;//비교 연산자의 연산 결과는 boolean이다.
		 //boolean b = true;//연산결과
		 System.out.println(b);//결과가 참이면  true
		 b = 10 <20- 15;//산술 연산자 먼저 계산 후 비교 연산자 계산
		 System.out.println(b);//결과가 거짓이면 false
		 
		 b = 10 <= 10.0;//작은 쪽을 큰쪽으로 맞춰줘야됨 //(double)<=10.0
		 //이항 연산자는 타입을 일치시킨 후 연산한다.
		 System.out.println(b);
		 b = 65 >= 'B'; //65>= (int)'B'//66
				 System.out.println(b);
		 
		 b= 10.1f == 10.0; //false
		 System.out.println(b);
		 
		 b = 10.1f == 10.1; //다르다  false f7자리까지 값을 정확히 , double 15개 까지만
		 System.out.println(b);

		 
		 System.out.printf("%21.20f%n", 10.1f);
		 System.out.printf("%21.20f%n", 10.1);
		 //float 과 double은 정밀도가 달라 float을 double로 형변환하면
		 //소수점을 정확하게 비교할 수 없다. 
		 System.out.printf("%21.20f%n", (double)10.1f);
		 System.out.printf("%21.20f%n", (float)10.1);
		 //double을 float으로 형변환해야 정확하게 비교할 수 있다.
		 b = 10.1f == (float) 10.1;
		 System.out.println(b);
		 
		 //대소비교는 boolean을 제외한 기본형 타입만 비교할 수 있지만
		 //등가비교는 모든 타입을 비교할 수 있다.
		 
		 b = 'A' == 65;
		 System.out.println(b);
		 b = true != false;		 
		 System.out.println(b);
		 
		 b = "abc" =="abc";//문자열이 들어가있는 주소를 비교
		 System.out.println(b);//같은 스트링 리터럴은 같은 주소를 갖는다.
		 b= "abc" == new String("abc");//참조형 스트링 생략 가능 .
		 //new는 새로운 주소를 생성한다.
		 System.out.println(b);
		 //창조형 타입은 저장된 메모리 주소를 비교하기 때문에 
		 //String은 등가비교 연산자로 내용을 비교할 수 없다.
		 
		 b = "abc".equals(new String("abc"));
		 //equals를 사용하면 string의 내용을 비교할 수 있다.
		 //.을 찍어서 메소드에 접근//.=참조 연산자
		 System.out.println(b);
		 b =!"abc".equals("ABC");
		 //같지 않다의 결과를 얻기 위해서는 !(not)을 앞에 붙여준다.
		 System.out.println(b);
//sysout ctrl space 치면 Systme.out.println();완성.		 
		 
		 
		 //다음의 문장을 코드로 표현해 주세요.
		 //1보다 2가 크다
		 //0은100보다 작거나 같다
		 //3.14f와 3.14는 같지 않다.
		 //"남자"와 "여자"는 다르다.
		 
		 b = 1 < 2;
		 b = 0 <= 100;
		 b = 3.14f != (float)3.14;
		 b = !"남자".equals("여자");
		 
		 
		 
	}

}
