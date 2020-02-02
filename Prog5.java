package nepe;
import java.util.*;
public class Prog5 
{
	public static void main(String[] argv)
	{
		Scanner in = new Scanner(System.in);
		int n,m,sum=0,n1,count=0;
		System.out.println("Enter a positive number");
		n = in.nextInt();
		m=n;
		if(n>=0)
			{
				do 
				{
					while(n>0)
					{
						n1=n%10;
						sum=sum+(n1*n1);
						n=n/10;
					}
					System.out.println(sum);
					if(sum==1) 
					{
						System.out.println("It is a happy number");
						System.exit(0);
					}
					n=sum;
					sum=0;
					count++;
					if(n==m || count>15)
						break;
				}while(sum!=1);
					System.out.println("It is a not a happy number");
			}
		else
			System.out.println("Enter a positive number");
		}
	}
