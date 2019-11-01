package d_array;

import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		
		
		for(String arg: args){
			System.out.println(arg);
		}//run configuration에서 설정해서 argument들어가서 문자내용을 
		//넣으면 띄어쓰기 마다 문자열로 만들어 져서 출력됨.
		
		

		String st = new String("ABCD");//참조형 타입을 초기화하는 방법
		//괄호 붙으면 무조건 메소드
		String str = "ABCD";//String은 특별히 간단하게 초기화 가능.
		
		char[]charArray = str.toCharArray();//String클래스 내부에 문자배열을 가지고 있다.
		System.out.println(charArray);//원래 주소값이 나와야 되는데 문자값만 안에 있는 값이 출력.
		
		// String클래스 내부에 문자배열을 다루는 여러가지 메서드가 정의되어 있다.
		
		/*
		 * <<String의 주요 메서드>>
		 * - equals() : 문자열의 내용이 같은지 확인한다.
		 * - length() : 문자열의 길이를 반환한다.
		 * - charAt() : 문자열에서 해당 위치에 있는 문자를 반환한다.
		 * 괄호안에 인덱스 넘버를 넣음
		 * - substring(); 문자열에서 해당 범위에 있는 문자열을 반환한다.
		 * - indexOf() : 문자열 내의 특정 문자열의 인덱스를 반환한다.
		 * 괄호안에 문자값을 큰 따음표안에 입력해서 값을 가지고 옴  
		 * - replace() : 문자열 내의 특정 문자열을 원하는 문자열로 변경해 반환한다.
		 * 앞에 문자열을 뒤에 문자열로 바꿔줌
		 * 
		 */
		
		for(int i = 0; i<str.length();i++){
			System.out.println(str.charAt(i));//i번째 인덱스의 값을 반환.한글자씩 가져옴
		}
		
		String revStr= "";//str를 거꾸로 담을 변수
		//뒤에서부터 한글자씩 가져와서 새로운 변수에 더한다.
		//ABCD
		for(int i = str.length() -1; i>=0;i--){
			//마지막 인덱스 번호에 -1값이 맨 마지막 인덱스 번호라서 int는 길이의-1로 초기화
			revStr += str.charAt(i);
			//revStr = revStr + str.charAt(i);
			
		}
		System.out.println(revStr);
		
		
		str= "0123456789";
		String sub1= str.substring(3);//3번 인덱스부터 잘라서 반환(마지막 인덱스까지)
		System.out.println(sub1);
		String sub2 = str.substring(5,8);
		//5번 인덱스부터 8번 인텍스 (전까지) 잘라서 반환, int만 들어올 수 있음.
		System.out.println(sub2);
		
		String[] stores = new String[3];//참조형의 기본값인 null이 저장된다.
		stores[0] ="굽네치킨";
		stores[1] ="피자나라 치킨공주";
		stores[2] ="도미노 피자";
		
		for(String store :stores){
			int i = store.indexOf("치킨");//해당사항이 없으면 -1을 반환.일반적으로 시작인덱스를 반환.
			if(0<=i){
				System.out.println(i + "/" +store);
			}else{
				System.out.println(i);//해당되는 문자열이 없는 경우 -1을 반환.
			}
		}
		
		
		String[] menus = {
				
				"치킨 10000원",		
				"피자 9900원"	,	
				"돈까스 8000원",		
				"떡볶이 5000원"		
		};
		
		for(String menu : menus){//향상된for문은 배열이나 콜렉션쓸때 사용
			String name = menu.substring(0, menu.indexOf(" "));
			System.out.println(name);
			//가격만 분리시겨 int 형 변수에 담아주세요.
			String price = menu.substring( menu.indexOf(" ")+1, menu.indexOf("원"));
			int precio= Integer.parseInt(price);
			//공백에 플러스 1을 하는 이유는 공백이 int 값으로 나올 수 없기 때문에 +1을 해줘야 됨.
			//int precio= Integer.parseInt(menu.indexOf(" ")+1, menu.indexOf("원"));
			System.out.println(price);
		}
		
		str = "123456789";
		str = str.replace("3","짝");//괄호안의 수= "파라미터"라고 함
		str = str.replace("6","짝");
		str = str.replace("9","짝");
		System.out.println(str);
		
		String pn = "010-2363-3647";
		//하이픈을 제거하고 출력해주세요.
		pn = pn.replace("-", "");
		System.out.println(pn);
		
		//숫자를 입력받아 입력받은 숫자에
		//3자리 마다 콤마(,)를 붙여 출력해주세요.
		// ex)1234567 ->1,234,567

		
		Scanner sc = new Scanner(System.in);
		System.out.println("7자리 숫자를 입력해주세요.");
		String number = sc.nextLine();
		String newNumber= " ";
			
			int cnt=0;
				for(int i = number.length() - 1 ;i >= 0; i--){
					newNumber = number.charAt(i) + newNumber;
					cnt++;
					if(cnt % 3 == 0 && cnt != number.length()) {
						newNumber = "," + newNumber;
						
					}
				}System.out.println(newNumber);	
					
		
			
			
			/*for(int i = 0; i<numbers.length-1;i++){
			boolean changed= false;
			for(int j =0; j<numbers.length-1-i; j++){
				if(numbers[j]>numbers[j+1]){
					int temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
					changed = true;
				}
			}if(!changed);
			//-버블정렬:첫번째 숫자부터 바로 뒷 숫자와 비교해서
	 //* 작은수와 자리 바꾸기를 반복해 뒤에서 부터 큰수를 채워나가는 방식
			
			break;
			
		}
	}
	*/
			
			
			
			
	
		/*
		String revStr= "";//str를 거꾸로 담을 변수
						//뒤에서부터 한글자씩 가져와서 새로운 변수에 더한다.
						//ABCD
						for(int i = str.length() -1; i>=0;i--){
							//마지막 인덱스 번호에 -1값이 맨 마지막 인덱스 번호라서 int는 길이의-1로 초기화
							revStr += str.charAt(i);
							//revStr = revStr + str.charAt(i);
		*/
		
		
		
		}
	
	}
	
	
	
	
	


