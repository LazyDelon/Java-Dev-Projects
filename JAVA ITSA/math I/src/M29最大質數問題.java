import java.io.*;
import java.util.Scanner;
public class M29最大質數問題 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入數字:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int b=a-1;b<2;b--) {
			a--;
			if(b/a==1) {
				System.out.print("答案:"+a);
				break;
			}
			
			
		}
	}

}
