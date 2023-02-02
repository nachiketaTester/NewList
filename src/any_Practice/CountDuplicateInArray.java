package any_Practice;

import java.util.Arrays;

public class CountDuplicateInArray {

	public static void main(String[] args) {
int d[]= {2,4,7,1,9,6,4,8,3,9,1,9,2,0,2,7,3,2};
countDuplicate(d);
	}
	public static void countDuplicate(int[] d)
	{
		Arrays.sort(d);
		System.out.println("sort"+d[1]);
		for(int i=0;i<d.length;i++)
		{
			int count=1;
			for(int j=i+1;j<d.length;j++)
			{
				if(d[i]==d[j])
				{
					count++;
				}else
					break;
			}
			if(count>1)
			{
				System.out.println(d[i]+"-->"+count);
			}
		}
	}
	}

