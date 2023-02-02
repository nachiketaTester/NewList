package any_Practice;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
int n,r,c,s=0;
System.out.println("Enter number to check : ");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
c=n;
while(n>0)
{
	r=n%10;
	s=(s*10)+r;
	n=n/10; 
}
if(c==s)
{
	System.out.println(c+" is a Palindrom Number .");
}
else
{
	System.out.println(c+" is not a palindrom Number .");
}
	}

}
