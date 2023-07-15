package classroom;

public class clock {
	private int hours;
	private int minutes;
	public clock(int startHours, int startMinutes) {
		hours = startHours;
		minutes = startMinutes;
		
	}
	
	public String getTime() {
	
		//return "It is " + hours + " : " + minutes;
		hours = (int)(Math.random()*24);
		minutes = (int)(Math.random()*60);
		return "it is " + hours + " : " + minutes;
		
	}
	public int getHours() {
		return hours;
	}
	
	public void setTime(int newHours, int newMinutes) {
		hours = newHours;
		minutes = newMinutes;
		if(minutes > 60) {
			hours += minutes/60;
			minutes = minutes % 60;
		}
			
	}
	
	

	
}
