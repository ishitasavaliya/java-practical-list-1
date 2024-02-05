import java.util.*;

public class Armstrong
{

	public static void main(String args[])
{
	int n,arm=0,rem,c;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the n number:");
	n=sc.nextInt();
	
	c=n;
	while(n>0)
	{
		rem=n%10;
		arm=(rem*rem*rem)+arm;
		n=n/10;
	}
	if(c==arm)
	{
		System.out.print("Armstrong number");
	}
	else
	{
		System.out.print("not Armstrong number");
	}
}
}	
	