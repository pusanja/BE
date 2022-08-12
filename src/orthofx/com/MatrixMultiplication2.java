package orthofx.com;

import java.util.Scanner;

public class MatrixMultiplication2 {
	
	public static void main(String[]args) {
		int r,c,a;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the element to multiply");
		a=sc.nextInt();
		System.out.println("enter the row of first matrix");
		r=sc.nextInt();
		System.out.println("enter the coloum of first matrix");
		c=sc.nextInt();
		int b[][]=new int[r][c];
		System.out.println("enter the elements of first matrix");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				b[i][j]=sc.nextInt();
				
			}
		}
		int d[][]=new int[r][c];
		for(int i=0;i<r;i++){    
			for(int j=0;j<c;j++){
				d[i][j]=a * b[i][j];     
				 
		         }

               }
		for(int i=0;i<r;i++){    
			for(int j=0;j<c;j++) {
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}
	}
}
