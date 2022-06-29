class MultipleCatch
{
	public static void main(String [] args)
	{
		try
		{
		int no1 = 42;
		int no2 = 1;
		int res = 0;
		res = no1/no2;
		System.out.println("res = "+ res);
		int c[] = {10,20,30};
		c[99] = 199;
		System.out.println("Last line of try!");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Cannot divide by zero! "+ ae);
		}
		catch(ArrayIndexOutOfBoundsException aiooe)
		{
			System.out.println("Array index not found");
		}
		catch(Exception e)
		{
			System.out.println("Exception created!");
		}
		System.out.println("Exiting programs successfully!");
	}
}