package e_oop;

import java.util.Scanner;

public class TV {

	public static void main(String[] args) {
		TV tv = new TV();
		
		tv.power();
		tv.channelUp();
		tv.changeChannel(99);
		
		tv.channelUp();
		
		tv.channelDown();
		
		tv.volumeUp();
		
		tv.volumeDown();
		tv.changeChannel(98);
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		tv.channelDown();
		/*Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력");
		String tmp = sc.nextLine();*/
		//System.out.println(tv.brand);
	}
	
	//TV를 대상으로 가능한 TV와 비슷하게 TV 클래스를 만들어주세요.
	
	boolean power; //전원
	int channel; //채널
	int volume; //음량
	String brand; //브랜드
	
	final int MIN_CHANNEL = 1;
	final int MAX_CHANNEL = 100;
	final int MIN_VOLUME = 0;
	final int MAX_VOLUME = 10;
	
	TV(String brand){
		power = false;
		channel = MIN_CHANNEL;
		volume = 5;
		this.brand = brand    ; //
	}
	
	//this()는 같은 생성자가 2개이상 있어야하고,보통 파라미터가 없는 생성자를 사용하고 싶을때 사용 
	TV(){
		this("asdasd"); //위의 TV(String brand)로 값이 넘어감.
	}
	///////
	void power(){
		power = !power;
		System.out.println(power ? "TV 켜짐" : "TV 꺼짐");
	}
	
	void changeChannel(int channel){
		if(power){
			if(MIN_CHANNEL <= channel && channel <= MAX_CHANNEL){
				this.channel = channel;
				System.out.println("채널. " + this.channel);
			}else if(channel < 1 || 100 < channel){
				System.out.println("채널을 찾을수 없습니다.");
				
			}
			
		}
	}
	
	void channelUp(){
		changeChannel(channel + 1);
	}
	
	void channelDown(){
		changeChannel(channel - 1);
	}
	
	void volumeUp(){
		if(power){
			if(volume < MAX_VOLUME){
				volume++;
			}
			showVolume(volume);
		}
	}
	
	void volumeDown(){
		if(power){
			if(MIN_VOLUME < volume){
				volume--;
			}
			showVolume(volume);
		}
	}
	
	void showVolume(int volume){
		System.out.print("음량. ");
		for(int i = MIN_VOLUME + 1; i <= MAX_VOLUME; i++){
			if(i <= volume){
				System.out.print("■");
			}else{
				System.out.print("□");
			}
		}
		System.out.println();
	}
	

}
	//과제. 클래스 하나로 간단한 프로그램을 만들어주세요.
	//발표 : 프로그램 주제, 기능, 메서드 구성 ,시연
	//(가능하면 콘솔로 입력받아 실행되도록)

















