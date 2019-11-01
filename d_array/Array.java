package d_array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {

		/*
		 * <<배열>>
		 * -int[]number = new int [5];//기본값으로 초기화된다.
		 * -int number[] = new[]{10, 20, 30, 40, 50};
		 * -int[] number= {10,20, 30, 40, 50};
		 * 
		 * 
		 */
			
		//배열은 참조형 타입이다.
		int[] array;//배열의 주소를 저장할 공간이 만들어진다.
		array = new int[5];//배열이 생성되고 그주소가 저장된다. 
		//int 5개 저장 공간이 생김.  array라는 곳에
		//new:새로운 저장공간 생성 및 주소 반환(주소값이 array로 저장.)
		//int[5]:int를 저장할 수 있는 5개의 공간
		//배열 초기화시 기본값이 저장된다.
		
		System.out.println(array);//주소가 저장되어 있다.
		
		System.out.println(array[0]);
		//실제값에 접근하기 위해서는index를 지정해줘야 된다.
		//index에는 int만 사용 할 수 있다. (리터럴, 변수, 상수, 연산 등)
		//배열의 최대 크기는 int의 최대 값(약 20억)이다.
		
		String arrayStr = Arrays.toString(array);
		//배열의 모든 인덱스에 저장된 값을 문자열로 반환한다.
		System.out.println(arrayStr);//int의 기본값인 0이 저장되어 있다.
		
		int[] iArray1 = new int[]{1, 2, 3};//값의 개수로 배열의 길이가 정해진다.
		int[] iArray2 = {1, 2, 3};//선언과 초기화를 동시해 해야된다.
		int[] iArray3;
		//int[]iArray3 ={1,2,3};//tjsdjsrhk chrlghk Ekfhsms qnfrksmd gkek.
		
		array[0] = 10;//인덱스는 0부터 시작한다.
		array[1] = 20;//
		array[2] = 30;//
		array[3] = 40;//
		array[4] = 50;//마지막 인덱스는 "배열의 길이 -1"이다.
		
		//정수를 저장할 수 있는 길이가 10인 배열을 생성 및 초기화해주세요.
		int[]num = new int[10];
		
		//모든 인덱스에 있는 값을 변경해주세요.
		
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		num[3] = 4;
		num[4] = 5;
		num[5] = 6;
		num[6] = 7;
		num[7] = 8;
		num[8] = 9;
		num[9] = 10;
		
		//모든 인덱스에 있는 값을 더해주세요.
		
		int sum=0;
		
		sum += num[0];
		sum += num[1];
		sum += num[2];
		sum += num[3];
		sum += num[4];
		sum += num[5];
		sum += num[6];
		sum += num[7];
		sum += num[8];
		sum += num[9];
		System.out.println(sum);
		
		
		for(int i = 0; i<array.length; i++ ){
			System.out.println(num[i]);	
		}
		//배열의 길이를 알고있다고 리터럴를 사용하는 것을 하드코딩이라고 한다.
		//길이를 알더라도 length를 사용하는 것이 더 좋은 코드이다.
		
		for(int i = 0; i<num.length;i++){
			num[i] = i+1;
		}
		System.out.println(Arrays.toString (num));
		
		//배열의 숫자를 저장하고 합계와 평균을 구해주세요.
		int avg= 0;
		int[] numbers =new int[10];
		numbers[0]= (int)(Math.random()*9)+1;
		numbers[1]= (int)(Math.random()*9)+1;
		numbers[2]= (int)(Math.random()*9)+1;
		numbers[3]= (int)(Math.random()*9)+1;
		numbers[4]= (int)(Math.random()*9)+1;
		numbers[5]= (int)(Math.random()*9)+1;
		numbers[6]= (int)(Math.random()*9)+1;
		numbers[7]= (int)(Math.random()*9)+1;
		numbers[8]= (int)(Math.random()*9)+1;
		numbers[9]= (int)(Math.random()*9)+1;
		for(int i=0 ; i<numbers.length;i++){
			
			sum += numbers[i];
		}
		
		avg = sum/numbers.length;
		System.out.println(Arrays.toString(numbers));
		System.out.println(sum);
		System.out.println(avg);
		
		
		//향상된 for문
		for(int number : numbers){//배열에 값을 차례대로 변수에 넣는다.
			System.out.println(number);
		}
		//값을 저장할 때는 사용을 못함.
		for(int number: numbers){
			number = 0; //numbers의 값은 변경되지 않는다.
			System.out.println(number);
		}
		System.out.println(Arrays.toString(numbers));
		
		//배열에 저장된 숫자들 중 최소값과 최대값을 찾아주세요.
		//배열의 값이 최소값보다 작으면 최소값에 배열의 값을 저장하고
		//배열의 값이 최대값보다 크면 퇴대값에 배열의 값을 저장한다.
		
		//최소값을 저장할 변수를 선언하고 0번 인덱스의 값으로 초기화한다.
		int min=numbers[0];
		//최대값을 저장할 변수를 선언하고 0번 인덱스의 값으로 초기화한다.
		int max=numbers[0];
		//배열의 길이만큼 반복하는 반복문을 만든다.
		for (int i =0; i < numbers.length ;i++){
			//최소값을 저장할 변수보다 배열의 값이 작은 경우
			if(min < numbers[i]){
				//그 값을 최소값을 저장할 변수에 저장한다.
				min = numbers[i];
			}
			
			//최대값을 저장할 변수보다 배열의 값이 큰 경우
		if(max < numbers[i]){
			//그 값을 퇴대값을 저장할 변수에 저장한다.
			max = numbers[i];
			}
		
		}
		
		System.out.println("최소값 : "+min+ "/최대값 : " + max);
		
		
		
		int[]shuffle = new int [30];
		for(int i = 0; i <shuffle.length; i++){
			shuffle [i]= i + 1;
		}
		System.out.println(Arrays.toString(shuffle));
		
		
		
		//배열의 값을 섞어 주세요
		//0번 인덱스의 값과 랜덤 인덱스의 값을 서로 교환한다.
		
		//여러번 반복하는 반복문을 만든다.
		for(int i = 0; i<shuffle.length * 10; i++){
		//랜덤한 인덱스를 발생시켜 변수에 저장한다.
			int random = (int)(Math.random()*shuffle.length);//0에서 29까지
		//0번 인덱스의 값을 임시로 저장한다.
			int temp = shuffle[0];
		//배열의 랜덤 인덱스 값을 0번 인덱스에 저장한다.
			shuffle[0]= shuffle[random];
		//임시로 저장한 겂을 랜덤 인덱스에 저장한다.
		shuffle[random]= temp;
		}
System.out.println(Arrays.toString(shuffle));		
		

//혼자 연습.
//		int temp = 0;
//		int a = 0;
//		for(int i = 0; i< shuffle.length; i ++){
//		int a = (int)(Math.random()*30)+1;
//		temp= shuffle[i];
//		shuffle[i]=shuffle[a];
//		}
//		numbers[0]=0;
//			System.out.println(Arrays.toString(shuffle));
		
		

		//배열은 길이를 변경할 수 없기 때문에 길이가 부족할 경우
		//더 큰 배열에 복사를 해야한다.
		int[] temp= new int [shuffle.length *2];
		for(int i = 0; i<shuffle.length; i ++){
			temp [i] = shuffle [i];
		}
		shuffle = temp;
		System.out.println(Arrays.toString(shuffle));
		
		
		//배열 복사 메서드
		int[] originArray = new int[]{1, 2, 3, 4, 5};
		int[] copyArray = new int[originArray.length *2];
		System.arraycopy(originArray, 0, copyArray,0, originArray.length);
		//orign인덱스 0번은 copy인덱스 0번에 넣고 oring.length만큼 저장하겠다.
		//System.arraycopy(originArray, 0, copyArray,2, originArray.length);
		//oring 0,1,2,3,4  가 copy의 2,3,4,5,6에 저장. 
		System.out.println(Arrays.toString(copyArray));
		
		//1~10사이의 난수(랜덤한 수)를 500번 생성하고,
		//각 숫자가 생성된 횟수를 출력해주세요.
		//1, 2, 3, 4, 5, 6, 7, 8, 9,10 이 몇번 나왔는지 출력
		/*int ct1=0;
		int ct2=0;  
		int ct3=0;
		int ct4=0;
		int ct5=0;
		int ct6=0;
		int ct7=0;
		int ct8=0;
		int ct9=0;
		int ct10=0;
		j
		int[]origin= new int [500];
		
		int ran=(int)(Math.random()*origin.length);
		
		for(int i= 0; i<=origin.length;i++)
		{
			if(origin [i]  == 1){
				ct1++;
					}else if (origin[i]==2){
						ct2++;
					
					}else if(origin[i]==3){
						ct3++;
						
					}else if(origin[i]==4){
						ct4++;
					
					}else if(origin[i]==5){
						ct5++;
						
					}else if(origin[i]==6){
						ct6++;
					
					}else if(origin[i]==7){
						ct7++;
						
					}else if(origin[i]==8){
						ct8++;
					
					}else if(origin[i]==9){
						ct9++;
					
					}else if(origin[i]==10){
					ct10++;
				}
			}
		System.out.println(Arrays.toString(origin));
		System.out.println("count1:"+ ct1 +" count2:"+ ct2 +" count3:"+ct3 );
		
		*/
		
		int[]origin = new int[500];
		int[]counter = new int[10];
		
		for(int i = 0; i<origin.length; i++){
			origin[i] = (int)(Math.random()*10)+1; 
			
		System.out.println(origin[i]);}
		System.out.print(Arrays.toString(origin));
		
		for(int i =0; i<origin.length;i++){
			counter[origin[i]]++;
		}
		for(int i = 0; i<origin.length ; i++ ){
			System.out.println(i + "의 개수 :"+ counter[i]);
			}
		
		
		
		/*
		int[] counts= new int[10];
		
		for(int i= 0; i<500 ;i++){
			int random= (int)(Math.random()*10)+1;
					
					counts[random-1]++;
		}
		for(int i=0; i<counts.length;i++){
			System.out.println(i+1 + ":" +counts[i]);
		}
		*/
		
	}

}
