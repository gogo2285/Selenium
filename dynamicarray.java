package Java_Handson;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class dynamicarray {

	public static void main(String[] args) {
		
ArrayList<Integer> mylist = new ArrayList<Integer>(5);

mylist.add(30);
mylist.add(2780);
mylist.add(156);
mylist.add(1);

System.out.println("size is "+ mylist.size());

	/*for (int i : mylist)	
	{
		System.out.println("element is " + i );
		
	}*/
	for(int j=0;j<mylist.size();j++)
	{
	System.out.println("elemnet at " + j + " is " + mylist.get(j));
	}
	
	Collections.sort(mylist);

	for(int j=0;j<mylist.size();j++)
	{
	System.out.println("elemnet at " + j + " is " + mylist.get(j));
	}
}
}