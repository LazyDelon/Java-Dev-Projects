import java.io.*;
import java.util.Scanner;

public class M28計算1到N之間屬於5和7的倍數 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入數字:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int n=0;
		int b=0;
		int total = 1;
		if(a>=35) {//100
			b=a/35;//b=2
			while(total<=b) {
				n=35*total;
				total++;
				System.out.println(n);
			}
		}else if(a<35) {
			System.out.print("Error");
		}

	}

}
