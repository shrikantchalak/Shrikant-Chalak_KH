import java.util.Scanner;
class P20
{
	public static void main(String[] args){
	System.out.print("Enter Number");
	Scanner sc= new Scanner(System.in);
	int n= sc.nextInt();
	
	for (int i=1;i<=n;i=i+2)
	{ System.out.println("Odd Number Series"+i);
	}
	}
}