import java.util.*;

public class Fibonacci{
	public static void main(String[] s)
{
	int i,n,a=0,b=1,c;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the n number:");
	n=sc.nextInt();
	
	for(i=1;i<=n;i++){
		System.out.print(" "+a);
		c=a+b;
		a=b;
		b=c;
	}
}
}
