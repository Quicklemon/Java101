package classroom;

import java.util.Scanner;

public class Tester {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		clock bigBen = new clock(3, 80);
		String time = bigBen.getTime();
		System.out.println(time);
		if(bigBen.getHours() >= 21 || bigBen.getHours() < 7) {
			System.out.println("Go to bed!");
		}
		else {
			System.out.println("It is day");
		}
		
		
		
			
	}	
	
}
