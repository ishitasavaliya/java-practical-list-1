import java.util.*;
public class Arrsum
{

	public static void main(String args[])
{
	
	int a[]=new int[5],i,sum=0;

	Scanner sc=new Scanner(System.in);
	System.out.println("enter element in array");

	for(i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}

	System.out.println("array elements");

	for(i=0;i<a.length;i++)
	{
		System.out.println(" "+a[i]);
		sum=a[i]+sum;	
	}
	System.out.println("addition of array element"+sum);
}
}

		
	