class P13
{
	public static void main(String args [])
	{	
	    char i,j;
	
	     for (i='A';i<='E';i++)
	    {
			for (j='E';j>=i;j--)		
		   {
	      System.out.print(" ");
			 
	       }
			for (j='A';j<=i;j++)		
		   {
	      System.out.print(i+" ");
			 
	       }
	      System.out.println();
		}
    }
}