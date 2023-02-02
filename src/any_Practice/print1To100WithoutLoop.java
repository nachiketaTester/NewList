package any_Practice;

import javax.xml.crypto.dsig.spec.XPathType;

public class print1To100WithoutLoop {

	public static void main(String[] args) {
//print1To100WithoutLoop a=new print1To100WithoutLoop();
print100(1);
//System.out.print(b);
	}
	public static void print100(int num)
	{
		if(num<=100)
		System.out.print(num+" ");
		num++;
		print100(num);
		
		
	}

}
