package any_Practice;

public class RemoveDuplicateIntegerFromAnArray {

	public static void main(String[] args) {
int[] x= {2,6,9,6,1,3,7,5,4,2};
System.out.println(x.length);
for(int i=0;i<x.length;i++)
{
	for(int j=i+1;j<x.length;j++)
	{
	if(x[i]==x[j])
	{
		System.out.print(x[i]+" ");
	}
	}
}
	}

}
