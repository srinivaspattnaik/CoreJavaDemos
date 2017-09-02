import java.util.*;
public class ReverseNumberDemo 
{
	public static void main(String arg[])
	{
		
		int number,reminder,reverseValue=0;
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the Number:");
		number=scanner.nextInt();
		
		while(number>0)
		{
			reminder=number%10;
			reverseValue=(reverseValue*10)+reminder;
			number/=10;
		}
		
		System.out.println("Reverse Number:"+reverseValue);
		
	}
}
