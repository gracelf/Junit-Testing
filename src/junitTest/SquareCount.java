package junitTest;

public class SquareCount {
	public int square(int x)
	{
		return x*x;
	}
	
	public int count(String word)
	{
		int count=0;
		for(int i=0; i<word.length(); i++)
		{
			if (word.charAt(i)=='a'||word.charAt(i)=='A')
			{
				count+=1;
			}
		}
		return count;
		
	}

}
