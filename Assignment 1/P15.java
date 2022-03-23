import java.util.Scanner;
class P15
{public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.println("Enter Number");
int n1=sc.nextInt();
int n2=sc.nextInt();
int lcm=(n1>n2)?n1:n2;

while (true){
	if(lcm%n1==0 && lcm%n2==0){
	System.out.println("The LCM OF "+n1+" & "+n2+" = "+lcm);
	break;
	}

	else{
	++lcm;}
}
}
}