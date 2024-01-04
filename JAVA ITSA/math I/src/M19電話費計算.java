import java.io.*;
import java.util.Scanner;
public class M19電話費計算 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入通話分鐘數:");
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
		if(time>=1500) {
			System.out.print("通話費用:"+time*0.9*0.79);
		}else if(time>800) {
			System.out.print("通話費用:"+time*0.9*0.9);
		}else
			System.out.print("通話費用:"+time*0.9);

	}

}
