package simlitest;

public class BaseballGame {

	public static void main(String[] args) {

		
		 Scanner sc= new Scanner(System.in);
	      
	      int c1, c2, c3;
	      int u1, u2, u3;
	      int s, b, o;
	      int count = 0;
	      
	      c1 = (int)(Math.random() * 10) ;
	      
	      do {
	         c2 = (int)(Math.random()*10);
	      }while(c2 == c1);

	      do {
	         c3 = (int)(Math.random()*10);
	      }while(c3 == c1 ||c3 == c2);
	      
	      
	      do {
	         s = b = 0;
	         
	         count ++;
	         
	         System.out.println("0~9사이의 숫자 3개 입력");
	         u1= sc.nextInt();
	         u2= sc.nextInt();
	         u3= sc.nextInt();
	         
	         
	         if(u1 == c1) s++;
	         else if(u1 == c2 || u1 == c3) b++;
	      
	         if(u2 == c2) s++;
	         else if(u2 == c1 || u2 == c3) b++;

	         if(u3 == c3) s++;
	         else if(u3 == c2 || u3 == c1) b++;
	      }while(s<3);
	      
	      
	      switch((count-1/3)) {
	      case 0 : System.out.println("Excelent");break;
	      case 1 : System.out.println("Good");break;
	      case 2 : System.out.println("Not bad");break;
	      case 3 : System.out.println("It's alright");break;
	      }
	      
	      System.out.println(count + "번에 맞췄습니다.");
	      
	      
	   }


		
		
	}

}
