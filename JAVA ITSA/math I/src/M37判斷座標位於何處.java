import java.io.*;
import java.util.Scanner;
public class M37�P�_�y�Ц���B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�п�Jx�y��:");
		Scanner sc=new Scanner(System.in);
		int x = sc.nextInt();
		System.out.print("�п�Jy�y��:");
		int y = sc.nextInt();
		if(x==0 &&y==0) {
			System.out.print("���I");
		}else if(y==0) {
			System.out.print("�bx�b");
		}else if(x==0) {
			System.out.print("�by�b");
		}
		if(x>0&&y>0) {
			System.out.print("�Ĥ@�H��");
		}else if(x<0&&y>0) {
			System.out.print("�ĤG�H��");
		}else if(x<0&&y<0) {
			System.out.print("�ĤT�H��");
		}else if(x>0&&y<0) {
			System.out.print("�ĥ|�H��");
		}

	}

}
