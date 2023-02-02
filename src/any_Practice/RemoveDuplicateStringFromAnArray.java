package any_Practice;

public class RemoveDuplicateStringFromAnArray {

	public static void main(String[] args) {
String[] s= {"Pupun","Nachiketa","Smita","Nachiketa","Pupun"};
System.out.println(s.length);
for(int i=0;i<s.length;i++)
{
	for(int j=i+1;j<s.length;j++)
		{
		if(s[i].equals(s[j]))
		{
			System.out.print(s[i]+" ");
		}
	}
}
	}

}
