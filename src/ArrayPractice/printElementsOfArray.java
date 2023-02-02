package ArrayPractice;

import java.util.Arrays;

public class printElementsOfArray {
	static int[] a=new int[6];
	public static void main(String[] args) {
		a[0]=3;
		a[1]=34;
		a[2]=7;
		a[3]=9;
		a[4]=29;
        a[5]=11;
        //Arrays.sort(a);	
for(int i=0;i<a.length;i++)
{
	System.out.print(a[i]+" ");
}
System.out.println();
maxmin();
	}
	public static void maxmin()
	{
		int temp;
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]<a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
	System.out.println();
	System.out.println("max : "+a[1]);
	System.out.println("min : "+a[a.length-2]);
	}
}

	
	


