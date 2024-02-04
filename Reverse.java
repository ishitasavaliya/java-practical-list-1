import java.util.*;

public class Reverse
{

	public static void main(String s[])
{
	
	int n,r;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the n number:");
	n=sc.nextInt();

	while(n>0)
	{
		r=n%10;
		n=n/10;
		System.out.println("Reverse order:"+r);
	
	}
}
}	