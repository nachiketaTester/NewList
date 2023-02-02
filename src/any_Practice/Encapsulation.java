package any_Practice;

public class Encapsulation {

	public static void main(String[] args) {
B b=new B();
b.setValue(100);
System.out.println(b.getValue());
	}
	

}
class B
{
	private int value;
	public void setValue(int x)
	{
		value=x;
	}
	public int getValue()
	{
		return value;
	}
}
