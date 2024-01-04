import java.io.*;
import java.util.Scanner;
public class M13停車 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入進場時間:");
		int hr = sc.nextInt();
		int min = sc.nextInt();
		System.out.print("請輸入出場時間:");
		int hrs = sc.nextInt();
		int mins = sc.nextInt();
		mins=((hrs-hr)*60)+mins-min;
		if(mins<=120) {
			min=mins/30;
			if(mins%30>0) {
				min=min+1;
				System.out.print("費用:"+min*30);
			}else if(mins%30==0) {
				System.out.print("費用:"+min*30);
			}
		}else if(mins>120&&mins<=240) {
			min=mins/30;
			if(mins%30>0) {
				min=min+1;
				System.out.print("費用:"+(4*30+(min-4)*40));
			}else
				System.out.print("費用:"+(4*30+(min-4)*40));
		}else if(mins>240&&mins<360) {
			if(mins%30>0) {
				min=min+1;
				if(min%2==0) {
					System.out.print("費用:"+(4*30+4*40+(min-8)*60));
				}else if(min%2>0) {
					min=min-1;
					System.out.print("費用:"+(4*30+4*40+(min-8)/2*60));
				}
			}else
				if(min%2==0) {
					System.out.print("費用:"+(4*30+4*40+(min-8)/2*60));
				}else if(min%2>0) {
					min=min-1;
					System.out.print("費用:"+(4*30+4*40+(min-8)/2*60));
				}
		}
			
		
		
	}

}
