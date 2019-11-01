package i_collection;

import java.util.ArrayList;

public class ArrayListClass {

	public static void main(String[] args) {
		
		/*
		 * add() : 마지막 위치에 객체를 추가
		 * get() : 지정된 위치의 객체를 반환
		 * set() : 지정된 위치에 주어진 객체를 저장(수정)
		 * remove(): 지정된 위치의 객체를 제거
		 * size() : 저장된 객체의 수 반환//길이를 반환해 주는 거
		 */
		
		ArrayList<Object> list = new ArrayList<Object>();
		
		list.add(10);
		list.add("abc");
		list.add(true);
		list.add(new ArrayListClass());
		
		ArrayList<String> list2 = new ArrayList<String>();
		//타입에 맞는 값을 넘겨 줘야됨.
		list2.add("abc");//0
		list2.add("123");//1->456
		list2.add("가나다");//2
		list2.set(1,"456");//1번 인덱스에 123이 저장되어있는데 456으로 변경하기
		
		
		for(int i =0; i<list2.size();i++){
			System.out.println(list2.get(i));
		}
		
		
		list2.remove(0);
		//리스트에 저장된 값을 삭제하면 그뒤의 모든 값의 인덱스가 당겨진다.
		System.out.println(list2.get(0));//456이 앞으로 당겨짐.
		System.out.println(list2.get(1));
		
		ArrayList<ArrayList<Integer>> list3 = new ArrayList<ArrayList<Integer>>();//2차원 배열이됨
		
		
		ArrayList<Integer> list4 = new ArrayList<Integer>();
		list4.add(10);
		list4.add(11);
		
		list3.add(list4);
		
		list4 = new ArrayList<Integer>();//변수의 새로 값을 만들어 주기.
		list4.add(20);
		list4.add(21);
		
		list3.add(list4);
		
		System.out.println(list3.get(0));
		System.out.println(list3.get(1));
		
		//정수를 저장할 수 있는 ArrayList를 생성해 값을 5번 넣어주세요.
		
		
		ArrayList<Integer> list5 = new ArrayList<Integer>();
		list5.add(1);
		list5.add(2);
		list5.add(3);
		list5.add(4);
		list5.add(5);
		
		//위에서 만든 ArrayList담긴 값들의 합계와 평균을 출력해 주세요.
		int sum=0;
		double average=0;
		for(int i=0;i<list5.size();i++){
			sum += list5.get(i);
		}
		average = (double)sum/list5.size();
		
		System.out.println(sum + "," + average);
		int max=list5.get(0);
		int min= list5.get(0);
		
		for(int i=0;i<list5.size();i++){
			if(list5.get(i)>max){
				max=list5.get(i);
			}else if(list5.get(i)<min){
				min=list5.get(i);
			}
		}
		System.out.println("min:"+ min + ",max:"+ max);
	}
	
	//위에서 만든 ArrayList에 담긴 값들 중 최소값과 최대값을 출력해 주세요.
	
}
