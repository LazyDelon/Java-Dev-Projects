import java.io.*;
import java.util.Scanner;
public class M293�p��q�O {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�п�J�ϥΫ׼�:");
		Scanner sc = new Scanner(System.in);
		double c = sc.nextDouble();
		if(c>700) {
			System.out.printf("�L��:%.2f",c*5.63);
			System.out.printf("�D�L��:%.2f",c*4.5);
		}else if(c>=501) {
			System.out.printf("�L��:%.2f",c*4.97);
			System.out.printf("�D�L��:%.2f",c*4.01);
		}else if(c>=331) {
			System.out.printf("�L��:%.2f",c*4.39);
			System.out.printf("�D�L��:%.2f",c*3.61);
		}else if(c>=121) {
			System.out.printf("�L��:%.2f",c*3.02);
			System.out.printf("�D�L��:%.2f",c*2.68);
		}else if(c<121) {
			System.out.printf("�L��:%.2f",c*2.1);
			System.out.printf("�D�L��:%.2f",c*2.1);
		}
	}

}
