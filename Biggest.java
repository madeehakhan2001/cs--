import java.lang.reflect.Array;
import java.util.Arrays;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Biggest
{
    public static int getBig(int[][] m)
    {
    	int largest=0;
    
    	for(int row=0; row<m.length; row++)
    		for (int col=0; col<m[row].length;col++) {
    			if (m[row][col]>largest)
    				largest = m[row][col];
    		}
    			
		return largest;
    }
}
