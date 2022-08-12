package orthofx.com;
import java.util.Scanner;

public class Pyramidforloop 
{
	
	public static void printStars(int n)
	{
		int i, j;
		for(i=0; i<n; i++)
		{
			for(j=0; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		int n ;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter n");
		n= sc.nextInt(); 
		printStars(n);
	}
}



