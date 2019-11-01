package h_useful;

public class MathClass {

	public static void main(String[] args) {
		/*
		 * round() : 반올림
		 * ceil(): 올림
		 * floor(): 내림
		 * abs(): 절대값
		 * random(): double 난수 발생( 0.0 ~ 1.0 미만 )
		 */
		
		double d1= 0.5;
		double d2= -0.5;
		//반올림:5이상일때 1 증가시키는 거 
		
		System.out.println(Math.round(d1));
		System.out.println(Math.round(d2));
		//round는 무조건 long타입.
		
		System.out.println(Math.ceil(d1));
		System.out.println(Math.ceil(d2));
		//수소점에 상관없이 그냥 올림.
		//첫쨰 자리가 아니여도 무조건 올려버림
		//d1:0.05->1.0  d2=-0.05->0
		
		System.out.println(Math.floor(d1));
		System.out.println(Math.floor(d2));
		//첫쨰 자리가 아니여도 무조건 올려버림
		
		System.out.println(Math.abs(d1));
		System.out.println(Math.abs(d2));
		//절대값
	
		for(int i =0;i<20; i++){
			int random = getRandom(10,5);
			System.out.print(random + " ");
		}
	}

	private static int getRandom(int from,int to){
		return (int)(Math.random()*(Math.abs(to-from)+1))+Math.min(from,to);
	}
}
