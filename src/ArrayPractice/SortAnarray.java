package ArrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class SortAnarray {

	public static void main(String[] args) {
int size,i;
System.out.println("Enter the size of an Array : ");
Scanner sc=new Scanner(System.in);
size=sc.nextInt();
int a[]=new int[size];
for(i=0;i<a.length;i++)
{
	a[i]=sc.nextInt();
	
}
Arrays.sort(a);
for(i=0;i<a.length;i++)
{
	System.out.print(a[i]+" ");
}
	}

}
