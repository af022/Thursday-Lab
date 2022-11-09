package basicprogram;
import java.util.Scanner;
public class Firstlast {
	public static void main(String args[])
	{
		int fd=0,ld=0,n,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		n=sc.nextInt();
		temp=n;
		ld=n%10;
		//run loop till n is greater than 0
		while(n>0)
		{
			fd=n%10;
			n=n/10;
		}
		//Display the first and lastdigit
		System.out.println("first digit of :"+temp+" is :"+fd+" lastdigit is:"+ld);
	}

}
