import java.io.*;
import java.util.Scanner;
public class M25計算正整數被3整除之數值之總和 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入正整數:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int a = 1;
		int b = 0;
		int total = 0;
		for(a=1;a<=num;a++) {
			b=a/3;
			if(a%3==0) {
			total=total+b*3;
			}
		}
		System.out.print(total);

	}

}
