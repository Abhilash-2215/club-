class ExceptionHandling
{
	public static void main(String args[])
	{
		try
		{
			int result=2/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("denominator shouldn't be 0");
		}
	}
}