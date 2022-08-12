
package orthofx.com;
public class Pyramidwhileloop
{
			public static void main(String[] args)
		{
			int r = 1,  n = 5;
			while (r <= n) 
			{
				int c = 0;
				while (c <= r - 1) 
				{
					System.out.print("* ");
					c++;
				}
				r++;
				
				System.out.println();
			}
		}
}

	



