import java.io.*;
import java.util.Scanner;
public class M184璸衡程そ计 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("叫块计:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		if(x==0&&y==0) {
			System.out.print("岿粇!!");
		}else
			for(int i = x;i>0;i--) {
				if(x%i==0 && y%i==0) {
					System.out.print("程そ计:"+i);
					break;
			}
			
		}
	}

}
