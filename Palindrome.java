package week1.day2;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		String word = "madam";
		String rev= "";
		for(int i=word.length()-1; i>=0; i--)
		{
			rev=rev+word.charAt(i);
		}
		if(word.equals(rev))
		{
			System.out.println("The string "+word+" is a palindrome");
		}
		else
		{
			System.out.println(word+" is Not a palindrome");
		}
	}

}
