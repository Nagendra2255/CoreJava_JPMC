package com.ariba;

public class Finally1 {
	
	public int xxx()
	{
		try
		{
			int x=10/0;
			System.out.println("super try");
		}
		catch(Exception e)
		{
			System.out.println("SUPER CATCH000");
			try
			{
				int y=10/0;
				System.out.println("SUB TRY");
			}
			catch(Exception e1)
			{
				System.out.println("SUB CATCH");
			}
			finally
			{
				System.out.println("SUB FINALLY");
				return 10;
			}
			
		}
		finally
		{
			System.out.println("super finally");
			return 20;
		}
	}

	public static void main(String[] args) {
		Finally1 f = new Finally1();
		int s =f.xxx();
		System.out.println(s);
	}

}
