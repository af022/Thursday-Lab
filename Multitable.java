package basicprogram;

import java.util.Scanner;

public class Multitable {
	public static void main(String args[])
	{
		int n,i,m;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
        n=sc.nextInt();
		for(i=1;i<=10;i++)
		{
			m=n*i;
			System.out.println(""+m);
		}
	}

}
