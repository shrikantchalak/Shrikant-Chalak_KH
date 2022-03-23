import java.util.Scanner;
class Scan1
{
	public static void main(String args [])
	{	
		Scanner sc = new Scanner(System.in);//Declaration of Scanner class object
		System.out.println("First number1:");//Msg
		int n1 = sc.nextInt();//Getting the input from user
		
		System.out.println("Second number2:");//Msg
		int n2 = sc.nextInt();//Getting the input from user
		
		int k = n1*n2;
		System.out.println(n2+" x "+n2" = "+k);
	}
}
