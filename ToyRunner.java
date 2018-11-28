//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.util.ArrayList;

public class ToyRunner
{
	public static void main(String[] args)
	{
		ArrayList toys=new ArrayList<Toy>();
		Toy h=new Toy(1,"sorry");
		System.out.println(h);
		Toy k=new Toy(4,"gi joe");
		System.out.println(k);
		toys.add(h);
		toys.add(k);
		//for(int i=0; i<toys.size()-1;i++)
			//System.out.println(toys);
			
		
	}
}