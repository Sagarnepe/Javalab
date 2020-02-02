package nepe;
import java.util.Scanner;
public class prog1a {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(true)
		{
			System.out.print("Enter the value of n-sqare matrix :");
			int n=in.nextInt();
			if(n<=0)
				System.out.println("Invalid input");
			else
			{
				int sum=0;
				while(n!=0)
				{
					sum=sum+n*n;
					n--;
				}
				System.out.println("The number square matrices are : "+sum);
			}
		}
	}
}
