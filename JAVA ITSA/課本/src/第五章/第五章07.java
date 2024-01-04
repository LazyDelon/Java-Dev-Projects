package 第五章;
import java.io.*;
import java.util.Scanner;
public class 第五章07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入通話分鐘:");
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		if(m>1500) {
			System.out.print("費用:"+m*0.9*0.79);
		}else if(m>800) {
			System.out.print("費用:"+m*0.9*0.9);
		}else
			System.out.print("費用:"+m*0.9);
	}

}
