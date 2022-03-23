import java.util.Scanner;
class P3
{public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.println("Enter Number");
int r=sc.nextInt();
int n=r;
int fact=1;

for(int i=1;i<=n;i++){
	fact=fact*i;
    System.out.print("Factorial on "+n+" ="+fact);
    }
}
}