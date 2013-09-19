
public class Clase {
	
	public boolean multiplo3(int num){
		if(num%3 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean multiplo5(int num){
		if(num%5 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public String resultado(int num){
		if(multiplo3(num) == true && multiplo5(num) == true)
		{
			return "FizzBuzz";
		}
		else
		{
			if(multiplo3(num) == true)
			{
				return "Fizz";
			}
			else
			{
				if(multiplo5(num) == true)
				{
					return "Buzz";
				}
				else
				{
					return Integer.toString(num);
				}
			}
		}
	}
	
}
