import java.util.Scanner;
class P11
{public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.println("Enter Number");
int a= sc.nextInt();
int b= sc.nextInt();
int c= sc.nextInt();

if (a>b && a>c)
    {System.out.print("A is Gigger");
	}
else if(b>a && b>c)
    {System.out.print("B is Grater");
	}
else
    {System.out.print("C is Grater");
	}
}
}

