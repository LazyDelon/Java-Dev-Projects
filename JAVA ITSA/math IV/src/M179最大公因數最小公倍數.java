import java.io.*;
import java.util.Scanner;
public class M179程そ计程そ计 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("叫块计:");
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		System.out.print("叫块计:");
		int x = sc.nextInt();
		System.out.print("叫块计:");
		int y = sc.nextInt();
		System.out.print("叫块计:");
		int z = sc.nextInt();
		for(int i = w;i>1;i--) {
			for(i=x;i>1;i--) {
				for(i=y;i>1;i--) {
					for(i=z;i>1;i--) {
						if(w%i==0||x%i==0||y%i==0||z%i==0) {
							System.out.print("程そ计:"+i);
							break;
						}
					}
				}
			}
		}
	}

}
