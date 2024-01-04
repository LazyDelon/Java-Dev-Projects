import java.io.*;
import java.util.Scanner;
public class M189身體質量指數 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入身高:(cm)");
		double t = sc.nextInt();
		System.out.print("請輸入體重:");
		double h = sc.nextInt();
		double bmi=0;
		t=t/100;
		bmi=h/(t*t);
		
		
		
		
		if(bmi>=35) {
			System.out.println("重度肥胖");
		}else if(bmi>=30) {
			System.out.println("中度肥胖");
		}else if(bmi>=27) {
			System.out.println("輕度肥胖");
		}else if(bmi>=24) {
			System.out.println("過重");
		}else if(bmi>=18.5) {
			System.out.println("正常範圍");
		}else
			System.out.println("體重過輕");
		System.out.printf("BMI:%.4f",bmi);
	}

}
