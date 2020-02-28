import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.FileWriter;

public class MegaSort extends RadixSort
{
    public static void main(String [] args)
    throws Exception{
    	File file = new File("1m-ints.txt");
    	Scanner sc = new Scanner(file);


    	int a[] = new int[2000000];
    	int i=0;
    	while(sc.hasNextInt())
		{
			a[i++] = sc.nextInt(); 
		}

		int x = 2000000; 
		RadixSort(a, x); 

		FileWriter newFile = new FileWriter("SortedArray.txt"); 
		for (int j = 0; j < a.length; j++)
		{
			newFile.write(a[j] + "\n");
		} 
		newFile.close();
    }
}
