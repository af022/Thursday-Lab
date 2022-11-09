// Sum of Natural number
package basicprogram;

import java.util.Scanner;

public class SumNatural 
{
	public static void main(String args[])
	{
		int i,n,sum=0;
		System.out.println("Enter value of numbers");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			sum=sum+i;
			
		}
		System.out.println("sum of natural numbers from 1 to"+n+" is:" +sum);
	}
	

}
