import java.util.Scanner;
class P14
{public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.println("Enter Number");
int n1=sc.nextInt();
int n2=sc.nextInt();
int gcd=1;

	for(int i=1;i<=n1;i++){
		if(n1%1==0 && n2%1==0 )
	    gcd=i;
	}
	System.out.println("GCD is = "+gcd);

}
}