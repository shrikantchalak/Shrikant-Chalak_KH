class Pyramid5

{
 public static void main(String args[])
 { 
  for(int i=9;i>=1;i--)
   {
	   for(j=9;j>=i;j--)
	    { 
	        System.out.print(" ");
		}	
        for(int k=9;k>=i;k--)
        {
	        System.out.print(                                                        i+" ");
        }
	  System.out.println();
   }
 }
}