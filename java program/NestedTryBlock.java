import java.io.*;
class NestedTryBlock{
	public static String str1 = "23.78"
	public static void main(String[] args)
	{
		try
		{
			try
			{
				int a = Integer.parseInt(str1);
			}
			catch(NumberFormatException ex))
				{
					System.out.println(ex)
				}

		}
	}
}