class MethodOverloading
{
	public static void main(String args[])
	{
		 dingi(10);
		 dingi("babu");
	}
public static void dingi(int a)
{
	System.out.println("first call is "+a);
}
public static void dingi(String a)
{
	System.out.println("after method overloading is "+a);
}
}
