package hello;

public class 期中考試 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double data[]= {1.23,2.38,3.42,4.41,5.52,6.67,7.76,8.81,9.31,10.22};
		double temp;
		System.out.print("排序前:");
		for(int i =1;i<data.length;i++) {
			System.out.print(data[i]);
			if(i<data.length-1) {
				System.out.print(",");
			}
		}
		System.out.println();
		
		for(int i =0;i<data.length-1;i++) {
			for(int j=0;j<data.length-1-i;j++) {
				if(data[j]<data[j+1]) {
					temp=data[j];
					data[j]=data[j+1];
					data[j+1]=temp;
				}
			}
		}
		System.out.print("排序後:");
		for(int i =1;i<data.length;i++) {
			System.out.print(data[i]);
			if(i<data.length-1) {
				System.out.print(",");
			}
		}
		System.out.println();
	}

}
