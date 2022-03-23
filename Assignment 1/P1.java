import java.util.Scanner;
class P1
{
	public static void main(String[] args){
	System.out.print("Enter Number");
	Scanner sc= new Scanner(System.in);
	int n= sc.nextInt();
	
	if (n%2==0)
	{ System.out.println("Even Number");
	}
	else
	{
		System.out.println("Odd Number");
	}
	}
}