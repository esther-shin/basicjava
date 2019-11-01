package f_oop2;

//싱글톤 패턴: 객체의 생성을 제한하여 하나의 객체만 사용하게 하는 디자인 패턴
//객체들간에 객체를 공유하기 위해 사용한다.
//다른 클래스에서 객체를 생성하지 못하게(private) 하고 내가 생성해서 다른 곳에 빌려줌.

public class Singleton {

	private static Singleton instance;
	
	//생성자의 접근 제어자를 private으로 만들어 다른
	//클래스에서의 객체 생성하는 것을 막는다.
	
	private Singleton(){
		
	}

	public static Singleton getInstance(){
		if(instance == null){
			instance = new Singleton();
		}
		return instance;
	}
	
}
