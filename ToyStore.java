//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		toyList= new ArrayList<Toy>();
	}

	public void loadToys( String ts )
	{
		toyList = new ArrayList<Toy>();
		ArrayList<String> toys = new ArrayList<>(Arrays.asList(ts.split(", ")));
		for(int i = 0; i < toys.size(); i+=2)
		{
			String name = toys.get(i);
			String type = toys.get(i+1); 
			Toy t = getThatToy(name);
			
			if (t == null)
			{
				if(type.equals("Car"))
				{
					toyList.add(new Car(name));
				}
				else
				{
					toyList.add(new AFigure(name));
				}
			}
			else
			{
				t.setCount(t.getCount()+1);
			}
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for(Toy x : toyList)
		{
			if(x.getName().equals(nm))
			{
				return x;
			}
		}
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		String name = "";
		double max = Integer.MIN_VALUE;
		for(Toy x: toyList)
		{
			if(max < x.getCount())
			{
				max = x.getCount();
				name = x.getName();
			}
		}
		return name;
  	}
  		return "";
  	}  
  
  	public void sortToysByCount()
  	{
  		Collections.sort(toyList, toys);
  	}  
  	  
	public String toString()
	{
	   return toyList.toString();
	}
}