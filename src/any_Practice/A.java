package any_Practice;

import java.util.Arrays;

public class A {

	public static void main(String[] args) {
		int arr[]= {6,1,2,1,9,9,3,1,2,6,8,5};
		countDuplicate(arr);
		System.out.println("Sort : "+arr[3]   );
			}
			public static void countDuplicate(int arr[])
			{
				Arrays.sort(arr);
				for(int i=0;i<arr.length;i++)
				{
					int count =1;
					for(int j=i+1;j<arr.length; j++)
					{
						if(arr[i]==arr[j])
						
							count++;	
					else
							break;
					}
					if(count>1)
					{
						System.out.println(arr[i]+"->"+count);
						//i+=(count-1);
					}
				}
			}
}
				
