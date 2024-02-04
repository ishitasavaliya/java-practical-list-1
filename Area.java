import java.util.*;
public class Area
{
	public static void main(String s[])
{
	double r,area;
	final double pi=3.14;
	
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the radius to find area of circle");
	r=sc.nextInt();
	area=pi*r*r;
	
	System.out.println("area:"+area);
}
}