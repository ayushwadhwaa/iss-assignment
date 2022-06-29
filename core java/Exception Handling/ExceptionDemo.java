class ExceptionDemo
{
	public static void main(String [] args)
	{
		int num1 = 42;
		int num2 = 0;
		int result = 0;
		try
		{
			System.out.println("First line of try!");
			result = num1/num2;
			System.out.println("result = "+ result);
			System.out.println("Last line of try!");
		}
		catch (ArithmeticException ae)
		{
			System.out.println("Cannot divide by zero! "+ ae);
		}
		System.out.println("Exiting programs successfully!");
	}
}
