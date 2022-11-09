package basicprogram;
import java.util.Scanner;
public class Factorial 
{
	public static void main(String args[])
	{
		int n,i,fact=1,temp;
		//take i/p from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number find factorial");
		n=sc.nextInt();
		temp=n;
		//loop for creating table
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
			
		}
		System.out.println("Factorial of: "+temp+" is:" +fact); 
	}
}	


