//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("enter monster size");
		 int size= keyboard.nextInt();
		 keyboard.nextLine();
		System.out.println("enter the  monsters name ");
		String name = keyboard.next();
		 
		Skeleton m= new Skeleton(name,size);
		
		System.out.println("enter  other monster size");
		 int s= keyboard.nextInt();
		 keyboard.nextLine();
		System.out.println("enter the  other monsters name ");
		String n = keyboard.next();
		
		Skeleton other= new Skeleton(n,s);
		//ask for name and size
		
		//instantiate monster one
		
		//ask for name and size
		
		//instantiate monster two
	}
}