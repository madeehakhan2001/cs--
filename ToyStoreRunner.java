//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		ArrayList toys=new ArrayList<Toy>();
		Toy h=new Toy(1,"sorry");
		System.out.println(h);
		Toy k=new Toy(4,"gi joe");
		System.out.println(k);
		toys.add(h);
		toys.add(k);
	}
}