import java.util.Scanner;
import java.io.*;
import java.util.Scanner;
public class M86公因數問題 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入數字:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		for (int a = 1; a < x; a++) {
			if (x % a == 0 && y % a == 0 && z%a==0) {
					System.out.println(a);
				}
		}
		}

}
