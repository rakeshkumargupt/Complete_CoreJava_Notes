//program with exception handling
import java.util.*;
class exp2
{

	public static void main(String args[])
	{
	int a=0;
	int b=0;
	int c=0;
	
	Scanner obj = new Scanner(System.in);
	while(true)
	{
	try
		{	
		System.out.print("Enter a : ");
		a = Integer.parseInt(obj.nextLine());
		System.out.print("Enter b : ");
		b = Integer.parseInt(obj.nextLine());
		c = a/b;
		System.out.println("Result of a/b=" + c);
		}
	catch(Exception ex)
		{
		System.out.println(ex);
		}
	}
	}
}