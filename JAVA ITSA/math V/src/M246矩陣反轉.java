import java.io.*;
import java.util.Scanner;
public class M246矩陣反轉 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("請輸入陣列的列、行:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x[][]= new int[a][b];
		System.out.print("請輸入陣列元素:");
		for(int i = 0;i<a;i++) {
			for(int j=0;j<b;j++) {
				int m=sc.nextInt();
				x[a][b]=m;
			}
			System.out.println();
		}
		for(int i =0;i<a;i++) {
			for(int j=0;j<b;j++) {
				System.out.print(x[a][b]+"  ");
			}
			System.out.println();
		}
	}

}
