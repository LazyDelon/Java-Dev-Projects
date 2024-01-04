package hello;

public class 期中考 {

	public static void main(String[] args) {
		int a[][] = {{1,-2},{0,2}};
		int b[][] = {{2,3,0},{1,-2,3}};
		int c[][] = new int[a.length][b[0].length];
		for(int i = 0;i<a.length;i++) {
			for(int j = 0;j<b[0].length;j++) {
				c[i][j]=0;
				for(int w=0;w<a[0].length;w++) {
					c[i][j]+=a[i][w]*b[w][j];
				}
			}
		}
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c[0].length;j++) {
				System.out.print(c[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
