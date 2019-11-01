package f_oop2;

public class SampleParent extends Object{//아무것도 받지 않을 떄 object, 모든 클래스의 조상.
//상속을 하는 이유는 공통된 메소드나 변수가 있어서 부모클래스에서 상속받음.


		String var;
		
		{
			var="초기화 블럭은 물려주지 않는다.";
		}
		
		SampleParent (){
			var ="생성자도 물려주지 않는다.";
		}
		
		int method (int a, int b){
			return a + b;
		}
		
	
}
