package f_oop2;

public class Time {

	private int hour;
	private int minute;
	private int second;
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		
		if(hour<0){
			this.hour =0;
		}else if(23<hour){
			this.hour =23;
		}else{
			this.hour = hour;
		}
		
		
		/*if(0<= hour&&hour<24){
			this.hour = hour;
		}*/
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if(minute<0){
			this.minute =0;
		}else if(59<minute){
			this.hour =59;
		}else{
			this.minute = minute;
		}
		
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if(second<0){
			this.second =0;
		}else if(59<second){
			this.second =59;
		}else{
			this.second = second;
		}
	}
	//source generate to string
	@Override
	public String toString() {
		return hour + ":" + minute + ":" +second;
	}
	
}
