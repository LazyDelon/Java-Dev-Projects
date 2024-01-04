import java.io.*;
import java.util.Scanner;
public class M264時間表示轉換 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入秒數:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = n/(24*60*60);
		int j = (n-i*24*60*60)/(60*60);
		int k = (n-i*24*60*60-j*60*60)/60;
		int l = (n-(i*24*60*60)-(j*60*60)-(k*60));
		System.out.print(n+"="+i+","+j+","+k+","+l);
	}

}
