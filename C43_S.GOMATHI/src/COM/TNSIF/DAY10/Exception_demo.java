package COM.TNSIF.DAY10;
import java.util.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_demo {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("enter a number:");
			int a=sc.nextInt();
			System.out.println(a % 2 == 0? a + " is Even":" is odd ");
			return;
		}
		catch(InputMismatchException e)
		{
			System.out.println("invalid Input...");
		}
		finally
		{
			System.out.println("in finally....");
			sc.close();
		}
		}
}
