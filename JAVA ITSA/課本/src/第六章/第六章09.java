package 第六章;
import java.io.*;
import java.util.Scanner;
public class 第六章09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入號碼:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		int u =45;
		int v =10;
		int w =20;
		int x =46;
		int y =42;
		int z =12;
		if(a==v  || b==v  ||c==v  ||d==v  ||e==v ||f==v) {
			if(a==w  || b==w  ||c==w  ||d==w  ||e==w||f==w) {
				if(a==x  || b==x  ||c==x  ||d==x  ||e==x||f==x) {
					if(a==y  || b==y  ||c==y  ||d==y  ||e==y||f==y) {
						if(a==z  || b==z  ||c==z  ||d==z  ||e==z||f==z) {
							if(a==u  || b==u  ||c==u  ||d==u  ||e==u||f==u) {
								System.out.print("bingo");
							}
						}
					}
				}
			}
		}else
			System.out.print("error");
	}

}
