import java.io.*;
import java.util.Scanner;
public class M151成績計算 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入Student01成績:");
		int[] st01 = new int[5];
		System.out.println("請輸入Student02成績:");
		int[] st02 = new int[5];
		System.out.println("請輸入Student03成績:");
		int[] st03 = new int[5];
		int total = 0;
		for(int i = 0;i<st01.length;i++) {
			total=total+st01.length;
			for(int x = 0;x<st02.length;x++) {
				total=total+st02.length;
				for(int y = 0;y<st03.length;y++) {
					total=total+st03.length;
				}
			}
		}
		System.out.print("平均:"+total/15);
	}

}
