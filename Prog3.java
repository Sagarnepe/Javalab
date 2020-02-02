package nepe;
import java.util.*;
public class Prog3 
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		String[] str=new String[5];
		System.out.println("Enter 5 Strings");
		for(int i=0;i<5;i++)
		{
			System.out.print((i+1)+": ");
			str[i]=in.next();
		}
		Arrays.sort(str);
		for(int i=0;i<5;i++)
			System.out.println(str[i]);
	}
}
