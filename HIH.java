class HIH


 {
  public static void main(String args[])
  {
     for(int i=6;i>=1;i--)
   {
       
		for(int k=1;k<=i;k++)
		{
			if(k == 1 || k == i || i == 6)
			System.out.print("* ");
		    
			else
			System.out.print("  ");
		
		}
		
		System.out.println();
	  }
  }
}
