import java.util.Scanner;

public class M35平閏年判定 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入年份:");
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		int a = 4;
		int b = 100;
		int c = 400;
		if(y%a==0) {
			if(y%b==0) {
				if(y%c==0) {
					System.out.print("閨年");
				}else
					System.out.print("平年");
			}else
					System.out.print("平年");
		}else
			System.out.print("平年");

	}

}
