import java.io.*;
import java.util.Scanner;
public class M122計程車車資計算問題 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入公尺數:");
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int t = 70;
		if(m>1500) {
			t=t+((m-1500)/500+1)*5;
			System.out.print("費用:"+t);
		}else
			System.out.print("費用:"+t);
	}

}
