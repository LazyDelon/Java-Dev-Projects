import java.io.*;
import java.util.Scanner;
public class M24計算薪水 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入時工時數和固定時薪:");
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();//工時數
		int hours = sc.nextInt();//時薪
		if(time<=60) {
			System.out.print("薪水:"+time*hours);
		}else if(time<=120) {
			System.out.print("薪水:"+60*hours+(time-60)*hours*1.33);
		}else if(time>120){
			System.out.print("薪水:"+(60*hours+60*hours*1.33+(time-120)*hours*1.66));
		}
	}

}
