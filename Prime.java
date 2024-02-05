import java.util.*;

public class Prime
{

	public static void main(String s[])
{
	int n,count=0,i;
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the number:");
	n=sc.nextInt();
	
	for(i=1;i<=n;i++)
	{
		if(n%1==0)
		{
			count++;
		}
	}
	if(count==2)
	{
		System.out.println("prime number");
	}
	else
	{
		System.out.println("not prime number");
	}
}
}


	
