package e_oop;

public class AirConditioner {

	public static void main(String[] args) {
		//아래 에어컨을 실행하기 위해 객체 생성
		AirConditioner aircon = new AirConditioner();
		aircon.temperatureUp();
		System.out.println(aircon.temperature); //전원이 꺼진상태라 기본값 24도
		
		aircon.power();
		
		aircon.temperatureUp();
		System.out.println(aircon.temperature); //전원이 켜져서 25도로 1증가
	
		
		aircon.temperatureDown();
		aircon.temperatureDown();
		System.out.println(aircon.temperature);//온도 두번내리기

		aircon.airVolume();
		System.out.println(aircon.airVolume);
		aircon.airVolume();
		System.out.println(aircon.airVolume);
		aircon.airVolume();
		System.out.println(aircon.airVolume);
		
		
		
	}
	
	//에어컨 만들기
	
	
	//온도가 18~30까지만 변경할 수 있게 해주시고,
	//전원을 켰을때만 버튼들이 작동되도록 메서드들을 변경해주세요.
	
	// 변수 선언
	boolean power; //전원
	int temperature; //온도
	int airVolume; //풍향
	
	//생성자 안에서 변수초기화
	AirConditioner(){
		power = false;
		temperature = 24;
		airVolume = 1;
	}
	
	//메소드생성
	
	//전원 버튼 
	void power(){
		power = !power; //꺼져있을때는 켜지고 켜져있을땐 꺼짐
	}
	
	//온도+  버튼 
	void temperatureUp(){
		if(power == true){
			if(temperature < 30){	
				temperature++;
			}	
		}
		
		
	}
	//온도- 버튼
	void temperatureDown(){
		if(power){
			if(18 < temperature){
				temperature--;	
			}
		}
		
		
	}
	
	//풍향 버튼
	void airVolume(){
			if( power && 3    < ++airVolume){ //3을 넘거가면 1로 바꿔줌
				airVolume = 1;
			}	
		
	}
	
}
















