class ThrowDemo
{
	static int divide(int no1,int no2)
	{
		try
		{
			System.out.println("Inside divide");
			int ans;
			ans=no1/no2;
			System.out.println("Returning value from divide!");
			return ans;
		}
		catch(ArithmeticException ae)
		{
			System.out.println("AE caught!");
			throw ae;
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("In main!");
		int num1=10;
		int num2=0;
		int res;
		System.out.println("Calling divide Function!");
		try
		{
			res=divide(num1,num2);
			System.out.println("Answer from Function: "+res);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Recaught in main");
		}
		System.out.println("Exiting main");
	}
}