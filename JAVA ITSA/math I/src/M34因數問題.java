import java.util.Scanner;

public class M34因數問題 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入數字:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for(int a=1;a<x+1;a++) {
			if(x%a==0) {
				System.out.println(a);
			}
		}

	}

}
