import java.io.*;
import java.util.Scanner;
public class M189�����q���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("�п�J����:(cm)");
		double t = sc.nextInt();
		System.out.print("�п�J�魫:");
		double h = sc.nextInt();
		double bmi=0;
		t=t/100;
		bmi=h/(t*t);
		
		
		
		
		if(bmi>=35) {
			System.out.println("���תέD");
		}else if(bmi>=30) {
			System.out.println("���תέD");
		}else if(bmi>=27) {
			System.out.println("���תέD");
		}else if(bmi>=24) {
			System.out.println("�L��");
		}else if(bmi>=18.5) {
			System.out.println("���`�d��");
		}else
			System.out.println("�魫�L��");
		System.out.printf("BMI:%.4f",bmi);
	}

}
