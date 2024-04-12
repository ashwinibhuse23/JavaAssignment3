package assignment;
import java.util.Scanner;
public class TimeQue5 {
	
		int hr,min,sec;
		public TimeQue5(int hr,int min,int sec) {
			if(isValid(hr,min,sec)==true){
				this.hr = hr;
				this.min =min;
				this.sec =sec;
				System.out.println("Time is: +hr+min+sec");
			}else {
				System.out.println("Invalid values for time,setting for default values 00:00:00");
			}
		}
		public TimeQue5() {
			hr = 0;
			min = 0;
			sec = 0;
	
	}
		public boolean isValid(int hr, int min,int sec) {
			return (hr >= 0 && hr < 24) && (min >= 0 && min < 60)&&(sec >= 0 && sec < 60);
		}
		public void display() {
			System.out.println(hr + ":" + min + ":" + sec);
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter hr,min and sec: ");
			int hr = sc.nextInt();
			int min = sc.nextInt();
			int sec = sc.nextInt();
			TimeQue5 time = new TimeQue5(hr, min, sec);
			time.display();
		}

}
