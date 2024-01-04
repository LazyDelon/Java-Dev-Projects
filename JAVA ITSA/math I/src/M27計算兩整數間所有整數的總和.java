import java.io.*;
import java.util.Scanner;
public class M27計算兩整數間所有整數的總和 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入數字:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int total = 0;
		if(a<b) 
			while(a<=b){
				total=total+a;
				a++;
			}
		else if(a>b)
			while(b<=a){
				total=total+b;
				b++;
			}
		System.out.print("總和:"+total);

	}

}
