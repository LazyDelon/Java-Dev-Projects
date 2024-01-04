import java.io.*;
import java.util.Scanner;
public class M107判別質數問題 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入數字:");
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		for(int b=2;b<a;b++) {
			if(a%b==0) {
				System.out.print("非質數");
				break;
			}else if(a/b==1) {
				System.out.print("質數");
				break;
			}
		}
	}

}
