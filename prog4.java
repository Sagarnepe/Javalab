package nepe;
import java.util.*;
public class prog4 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n,rem,sum=0,n1;
		System.out.println("Enter the number");
		n=in.nextInt();
		n1=n;
		while(n1!=0)
		{
			rem=n1%10;
			sum=sum+rem;
			n1=n1/10;
		}
		System.out.println("First sum is "+sum);
		if(sum>9)
			n1=sum;
		sum=0;
		while(n1!=0)
		{
			rem=n1%10;
			sum=sum+rem;
			n1=n1/10;
		}
		System.out.println("Final sum is "+sum);
	}
}
