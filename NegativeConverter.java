package week1.day2;

public class NegativeConverter {

	public static void main(String[] args) 
	{
		int num=-37;
		if(num<0)
		{
			num=num*-1;
			System.out.println("The number "+num+" is converted to a positive number");
		}
		else
		{
			System.out.println("The number "+num+" is already a positive number");
		}
	}

}
