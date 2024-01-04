import java.io.*;
import java.util.Scanner;
public class M188購買門票問題 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入購票張數:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if(x>=100) {
			System.out.println("打六折"+x*400*0.6);
		}else if(x>=30) {
			System.out.println("打七折"+x*400*0.7);
		}else if(x>=20) {
			System.out.println("打八折"+x*400*0.8);
		}else if(x>=10) {
			System.out.println("打九折"+x*400*0.9);
		}else
			System.out.println("無打折"+x*400);
	}

}
