import java.util.Scanner;

public class M35���|�~�P�w {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�п�J�~��:");
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		int a = 4;
		int b = 100;
		int c = 400;
		if(y%a==0) {
			if(y%b==0) {
				if(y%c==0) {
					System.out.print("�Ӧ~");
				}else
					System.out.print("���~");
			}else
					System.out.print("���~");
		}else
			System.out.print("���~");

	}

}
