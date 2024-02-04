import java.util.*;

public class Arithmatic
{

	public static void main(String s[])
{
	int a,b;
	Scanner sc=new Scanner(System.in);

	System.out.print("enter the a:");
	a=sc.nextInt();
	System.out.print("enter the b:");
	b=sc.nextInt();
	
	System.out.println("addition:"+(a+b));
	System.out.println("substaction:"+(a-b));
	System.out.println("multiplication:"+(a*b));
	System.out.println("division:"+(a/b));
	System.out.println("modulo:"+(a%b));
}
}
	