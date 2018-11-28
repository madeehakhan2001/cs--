//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class Skeleton implements Monster
{
	 private String name;
	private  int size;
	public Skeleton()
	{
		name = "";
		size = 0;
	}
	public Skeleton(String n, int s)
	{ 
		name = n;
		size = s;
		}
	public String getName() {
		return name;
	}
	public int getHowBig() 
	{
		return size;
	}
	public boolean isBigger(Monster other)
	{	
		if (getHowBig() > other.getHowBig())
			return true;
		return false;
	}
	public boolean isSmaller(Monster other)
	{
		if (getHowBig() > other.getHowBig())
			return false;
		return true;
	}
	public boolean namesTheSame(Monster other)
	{
		if (name.equals(other.getName()))// don't use ==
			return true;
		return false;}
	public String toString () 
	{
		return "" + name + "" +size;
	}

	//add instance variables	

	//add a constructor

	//add code to implement the Monster interface

	//add a toString
}