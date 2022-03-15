class P9
{
	public static void main(String args [])
	{	
	    char i,j,k;
	
	     for (i='A';i<='E';i++)
	    {
			for (j='E';j>=i;j--)		
		     {
	           System.out.print(" ");
	         }
			 for (k='A';k<=i;k++)		
		     {
	           System.out.print(k" ");
	         }
	      System.out.println();
		}
    }
}