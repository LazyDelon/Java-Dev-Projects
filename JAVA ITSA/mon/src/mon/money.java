package mon;
import java.io.*;
import java.util.Scanner;

public class money {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入整月工作時數:");
		Scanner sc = new Scanner(System.in);
		int hrs = sc.nextInt();
		if(hrs <= 60 && hrs > 0) {
			System.out.println("你的薪水:" + 158*hrs);
		}
		else if(hrs<=120) {
			System.out.println("你的薪水:" + 158*hrs*1.33);
		}
		else
			System.out.println("你的薪水:" + 158*hrs*1.66);

	}

}
