package intro.two;

public class MatrixMultiplication {
	public static void main(String[] args) {

		int A[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int B[][]= {{9,8,7},{6,5,4},{3,2,1}};
		int P[][]= new int[3][3];
		int i,j,k;
		
		for(i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				
				System.out.print(A[i][j]+"\t");
				
			}
			System.out.println();
		}
		
		
		
	}
}
