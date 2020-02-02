package nepe;
import java.util.*;
public class prog2 
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int n;
		System.out.println("Enter the number of levels");
		n=in.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print("  ");
			}
			for(int k=i;k<=2*i-1;k++)
			{
				System.out.print(k+" ");
			}
			for(int l=2*i-2;l>=i;l--)
			{
				System.out.print(l+" ");
			}
			System.out.println();
		}
	}
	
}
