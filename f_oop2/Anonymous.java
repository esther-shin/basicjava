package f_oop2;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Anonymous {

	public static void main(String[] args) {

		//하나의 부모클래스나 인터페이스를 상속받아
		//클래스를 선언함과 동시에 객체를 생성하는 클래스
		
		Button b = new Button();
		
		b.addActionListener(
				
				new ActionListener(){//버튼의 기능을 클래스로 만들어 받는다.
				//ActionListener를 상속받은 자식클래스
	
				@Override
				public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 누르면 실행");	//여기에서만 쓰일때 익명클래스를 만든다.
				}
				
			}
		
				);//다 파라미터 안에 들어 왔던 내용.
	}

}
