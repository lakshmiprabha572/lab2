package com.greatlearning.currency;

public class currency {
	
public void currencycount(int[] denominations,int payvalue)
	{
		//Object denominations;
		int[] countdenominations=new int[denominations.length];
		
		for(int i=0;i<denominations.length;i++) 
		{
			
		if (payvalue>=denominations[i])
		{
			//if(payvalue>=denominations[i])
			//{
			int countcurr=payvalue/denominations[i];
			payvalue=payvalue-(denominations[i]*countcurr);
			countdenominations[i]=countcurr;
			if(payvalue==0)
			{
				break;
			}
			}
			}
				if(payvalue == 0)
				{
					System.out.println("ur payment approach in order to give min no of notes will be");					
				  for(int i=0;i<denominations.length;i++)
				  {
					  if(countdenominations[i]!=0)
					  {
						  System.out.println(denominations[i]+":"+countdenominations[i]);
						  
					  }
					  
					  
					  }
				  }
	
	
else
{
	System.out.println("exact pay value cannot be paid with higest possible denominations");
}

}
}
