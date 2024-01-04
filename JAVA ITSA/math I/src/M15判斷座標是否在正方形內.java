import java.io.*;
import java.util.Scanner;

public class M15判斷座標是否在正方形內 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入x座標:");
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		System.out.print("請輸入y座標:");
		int y=sc.nextInt();
		if(x>100) {
			System.out.print("outside");
		}else if(y>100) {
			System.out.print("outside");
		}else
			System.out.print("inside");

	}

}
