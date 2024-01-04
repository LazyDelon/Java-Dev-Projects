import java.io.*;
import java.util.Scanner;
public class M14計算時間的組合 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入數字:");
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int minutes=0,hours=0,days=0;
		if(s>=86400) {
			days=s/86400;
			s=s-days*86400;
			hours=s/3600;
			s=s-hours*3600;
			minutes=s/60;
			s=s-minutes*60;
		}else if(s>=3600) {
			hours=s/3600;
			s=s-hours*3600;
			minutes=s/60;
			s=s-minutes*60;
		}else if(s>=60) {
			minutes=s/60;
			s=s-minutes*60;
		}
		System.out.println("天:"+days);
		System.out.println("小時:"+hours);
		System.out.println("分鐘"+minutes);
		System.out.println("秒"+s);
	}

}
