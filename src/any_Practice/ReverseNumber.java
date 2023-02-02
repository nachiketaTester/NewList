package any_Practice;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
int n,r;
System.out.println("Enter any Number : ");
Scanner s=new Scanner(System.in);
n=s.nextInt();
while(n>0)
{
	r=n%10;
	System.out.print(r);
	n=n/10;
	
}
	}

}
