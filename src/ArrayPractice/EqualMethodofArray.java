package ArrayPractice;

import java.util.Arrays;

public class EqualMethodofArray {

	public static void main(String[] args) {
int a[]= {1,2,3,4,5};
int[] b= {1,2,3,5,4};
Arrays.sort(b);
boolean c=Arrays.equals(a, b);
System.out.println("Two array are equal : "+c);
	}

}
