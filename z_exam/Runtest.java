package z_exam;

public class Runtest {
	public static void main(String args[]) {
		
		
//		[4-4] 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 
//		몇까지 더해야 총합이
//		100이상이 되는지 구하시오.
	
	int sum=0;
	int suma=0;
	int total=0;
	for(int i=1;total<=100;i++){
		if(i%2==0){
			sum += i*(-1);
			}else{
				suma += i;
			}
		total=sum+suma;
		}
	System.out.println(total);
	}
	
}





