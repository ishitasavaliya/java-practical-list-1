import java.util.*;

public class Palindrom
{

	public static void main(String args[])
{
	int n,s=0,c,r;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the n number:");
	n=sc.nextInt();
	
	c=n;
	while(n>0)
	{
		r=n%10;
		s=(s*10)+r;
		n=n/10;
	}
	if(c==s)
	{
		System.out.print("palidrom number");
	}
	else
	{
		System.out.print("not palidrom number");
	}
}
}	
	