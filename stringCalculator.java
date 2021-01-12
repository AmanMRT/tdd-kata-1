
public class stringCalculator {
	
	public void add(String str)
	{
		int sum = 0;	//member variable
		str = str.replaceAll("[^\\d]", ""); //accepting only integer values
		
		char[] arr = str.toCharArray(); 	
		
		if(arr.length>0)	//check if String is NULL or not 
		{
			for(int i=0; i<arr.length;i++) 
			{
				sum += (arr[i] - 48);	//add integer value
			}
		}
		else
		{
			sum = 0; 	//if size of String is zero
		}
		
		System.out.println("Sum is " +sum);	//output
	}
	public static void main(String[] args)
	{
		String str = "//[*][%]\\n1iu*2%3";	//input
		
		stringCalculator cal = new stringCalculator();		//object creation
		
		//add method called
		cal.add(str);
		
	}
}
