import java.util.*; 
public class Sumavg{
    public static void main(String s[])
{
	 int a,b,c;
	 
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the value of a:");
	a=sc.nextInt();
	System.out.print("enter the value of b:");
	b=sc.nextInt();
	System.out.print("enter the value of c:");
	c=sc.nextInt();
        

        System.out.println("sum:"+(a+b+c));
        System.out.println("average:"+(a+b+c/3));
    }
}