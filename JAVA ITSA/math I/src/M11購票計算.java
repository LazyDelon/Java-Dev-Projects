import java.io.*;
import java.util.Scanner;
public class M11購票計算 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入票價:");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		int a = 0;
		int b = 0;
		int c = 0;
		if(money>=10) {
			a = money/10;
			money=money-a*10;
		}if(money>=5) {
			b = money/5;
			money=money-b*5;
		}if(money>0){
			c = money;
		}
		System.out.println("NT10="+a);
		System.out.println("NT5="+b);
		System.out.println("NT1="+c);
	}

}
