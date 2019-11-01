package i_collection;

import java.util.HashMap;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {
		/*
		 * put(): 지장된 키와 값을 저장
		 * get(): 지정된 키의 값을 반환(없으면 null)
		 * remove() : 지정된 키로 저장된 값을 제거
		 * keySet(): 저장된 모든 키를 Set으로 반환.
		 */

		HashMap<String,String> map = new HashMap<String, String>();
		//<키,값>의 타입을 지정해준 거.hash로 지정해주고 매게변수 .put 이나 get으로 받는 다.
		//게시판 만들때 주로 사용 됨.
		
		map.put("title", "제목입니다.");
		map.put("content", "내용입니다.");
		map.put("user", "신유진");
		map.put("date", "2019-10-16-09:26");
		
		System.out.println(map.get("title"));//파라미터로 키를 넣어주면 됨.
		System.out.println(map.get("content"));
		System.out.println(map.get("user"));
		System.out.println(map.get("date"));
		
		map.put("user","홍길동");//다시 한번 값을 저정하면 값이 덮어씌어짐. 1개의 키에 여러개의 값을 저장할 수 없다.
		System.out.println(map.get("user"));
		map.put("user","이순신");//덮어쓴다
		System.out.println(map.get("user"));
		
		
		map.remove("user");
		System.out.println(map.get("user"));
		//user 를remove해서 이제 값이 없음. null반환해줌.
		
		//어떤 키가 있는지 모를때keyset을 써서 다 불러올 수 있다.
		
		//map에 저장된 모든 내용 출력.
		Set<String>keys= map.keySet();
		for(String key : keys){
			String value = map.get(key);
			System.out.println(key + ":"+ value);
		}
		
	}

}












