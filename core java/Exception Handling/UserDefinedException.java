class PasswordNotMatch extends Exception
{
	PasswordNotMatch(String msg)
	{
		super(msg);
	}
}
class UserDefinedException
{
	public static void main(String[] args) 
	{
		try
		{
			String pass = "USER123";
			String yourPass = args[0];
			if(! pass.equals(yourPass))
				throw new PasswordNotMatch("Password does not match!");
			else
				System.out.println("Valid password");
		}
		catch(PasswordNotMatch e)
		{
			System.out.println("Caught "+e);
		}
	}
}