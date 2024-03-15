package collection_Demo;

import java.util.ArrayList;

public class ArrayList_demo 
{

	public static void main(String[] args) 
	{
		
		ArrayList<Integer> a1=new ArrayList<Integer>();
		
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		
		System.out.println("The list is"+a1);
		System.out.println("The size of list is "+a1.size());
		System.out.println("The index of 30 is "+a1.indexOf(30));
		System.out.println(a1.remove(0));
		System.out.println(a1);
		System.out.println(a1.size());
		a1.add(0, 10);
		System.out.println(a1);
		System.out.println(a1.get(3));
		a1.clear();
		System.out.println(a1);
		
		

	}

}
