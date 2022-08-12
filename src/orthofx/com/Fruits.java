package orthofx.com;
import java.util.Scanner;

public class Fruits
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string");
		String str= sc.nextLine();
		String colour =null;
		switch(str)
		{
		case "apple":
			 colour="Red";
			 break;
		case "banana":
			colour="Yellow";
			break;
		default:
			colour="Green";
			break;
			
		}
		System.out.println(colour);
	 }
}	
	
		
		
		
				
	
	


