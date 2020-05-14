package csci3444.generics;

import csci3444.generics.MyGenClass;
import csci3444.generics.MyGenInterface;
import csci3444.generics.MyRegularClass;

public class MainEntry {
	
	public static void main(String[] args)
	{
	
	MyGenInterface<Integer,String> mgi1;
	MyGenInterface<Integer,Integer> mgi2;
	
	mgi1= new MyGenClass<Integer, String>(1, "Mike");
	mgi2= new MyGenClass<Integer, Integer>(1,2017);
	
	Integer i1;
	Float f1;
	
	i1= MyRegularClass.getSum(10, 20);
	f1 = MyRegularClass.getSum(100f,200f);
	
	System.out.println("Mgi1: " + mgi1.getKey()+ " " + mgi1.getValue());
	System.out.println("Mgi2: " + mgi2.getKey()+ " " + mgi2.getValue());
	System.out.println("I1 sum is: " + i1);
	System.out.println("F1 sum is: " + f1);
	}
}
	
	

	
	

