package ArrayPractice;

import java.util.Arrays;

public class CopyOfMethodInArray {

	public static void main(String[] args) {
int []a= {1,2,3,4,5};
int[] b=Arrays.copyOf(a, 6);
b[5]=90;
for(int i=0;i<b.length;i++)
{
	System.out.print(b[i]+" ");
}
}

}
