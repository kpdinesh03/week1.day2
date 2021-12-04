package week1.day2;

public class ChrOccurrence {

	public static void main(String[] args) 
	{
		String str = "welcome to chennai";
		char search = 'e';
		int count =0;
		for (int i = 0; i < str.length()-1; i++) 
		{
			if(str.charAt(i)==search)
			{
				count++;
			}
		}
		System.out.println("Th character "+search+" appears "+count+" times");
		
	}

}
