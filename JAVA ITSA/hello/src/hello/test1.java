package hello;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[] = {12,32,15,31,64};
		int max = x[0];
		for(int i : x) {
			if(i>max) {
				max=i;
			}
		}
		System.out.print(max);
	}
}