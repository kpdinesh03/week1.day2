package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) 
	{
		String test="I am a software tester";
		String[] t= test.split(" ");
		for(int i=1; i<t.length; i+=2)
		{
			t[i]=new StringBuilder(t[i]).reverse().toString();
		}
		System.out.println(String.join(" ", t));
	}

}
