import java.io.*;
import java.util.Scanner;
public class M13�����O�p�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�п�J�J���ɶ�:");
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		System.out.print("�п�J�X���ɶ�:");
		int hours = sc.nextInt();
		int minutes = sc.nextInt();
		int money=0;
		minutes=(hours-hour)*60+minutes-minute;
		if(minutes<120) {
			hours=minutes/30;
			hour=minutes%30;
			if(hour>0) {
				hours=hours+1;
			}
			money=hours*30;
			System.out.print(money);
		}else if(minutes>=120 && minutes<240) {
			hours=minutes/30;
			hour=minutes%30;
			if(hour>0) {
				hours=hours+1;
			}
			money=4*30+(hours-4)*40;
		}else if(minutes>=240) {
			hours=minutes/30;
			hour=minutes%30;
			if(hour>0.5) {
				hours=hours+1;
			}
			money=4*30+4*40+(hours-8)/2*60;
		}
		System.out.print(money);
			

	}

}
