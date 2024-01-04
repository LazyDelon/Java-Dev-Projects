import java.io.*;
import java.util.Scanner;

public class M51質數列表與總和 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入數字:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int d = 1;
		int f[] = new int[a];
		for (int b = 2; b < 10; b++) {
			for (int c = 2; c < 10; c++) {
				if (b / c == 1) {
					for (d = 1; d < f.length; d++) {
						System.out.print(d);
						break;
					}
				}
			}
		}
	}

}
