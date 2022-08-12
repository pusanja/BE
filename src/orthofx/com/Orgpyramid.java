package orthofx.com;
import java.util.Scanner;

public class Orgpyramid 
{
	public static void main(String[]args)
	{
		int n,sp,j,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(sp=i;sp<n;sp++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=2*i-1;j++)
		
		    {
		    	System.out.print("*");
		    }
			 System.out.println();
		}
	  
	}
	

}
