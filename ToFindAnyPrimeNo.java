class ToFindAnyPrimeNo
{
	public static void main(String args[])
	{
		int count=0;
		for(int j=0; j<=1000;j++)
		{
			int n=j;
			boolean b=false;
			if(n==0 || n==1)
				b=true;
			else
				for(int i=2; i<=n/2;i++)
					if(n%i==0)
					{
						b=true;
						break;
					}
			if(!b)
				count++;
				if(count==72)
				{
					System.out.println(n+" is prime no");
					break;
				}
		}
	}
}

//359 is prime no