package leap;

public class LeapBoolean {
	public static void main(String[] args) {
		int year= 2012;
		boolean print= false;
		if(year%4==0)
		{
			print =true;
			if(year% 400==0)
			{
				if(year%100!=0)
				{
			print=true;
			System.out.println("sgf");
		}
		else
			System.out.println("not a prime no");
			}}
			
			if(print==false)
			{
				System.out.println("its a prime not");
			}
			else {
				System.out.println(" a prime no");
			}

}}
