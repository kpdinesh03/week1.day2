package week1.day2;

public class CheckNumberSign 
{

	public static void main(String[] args) 
	{
		int num=-0;
		if (num>0)
		{
			System.out.println("The give number "+num+" is a positive number");

		}
		else if (num<0)
		{
			System.out.println("The give number "+num+" is a negative number");

		}
		else
		{
			System.out.println("The give number "+num+" is neither positive nor a negative number");
		}
	}

}
