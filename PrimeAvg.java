class PrimeAvg
{
	public static void main(String args[])
	{
		int a=0, count=0, last=38,sum=0;
		double avg=0;
		while(count < last )
		{
			boolean b=false;
			if(a==0 || a==1)
				b=true;
			else
				for(int i=2; i<=a/2;i++)
					if(a%i==0)
					{
						b=true;
						break;
					}
			 
            		if(!b)
           		 {
               			 count++;
               			 sum += a;
           		 }
            
           		 a++;
		}
       		 
        
       		 avg = sum / last;
        	System.out.println("The average of the first " + last + " prime numbers is: " + avg);
    } 
}	
		
// The average of the first 38 prime numbers is: 72.0		