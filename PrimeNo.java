class PrimeNo
{
	public static void main(String args[])
	{
		
		int n=7;
		boolean b=false;
		if(n==0 || n==0)
			b=true;
		else
			for(int i=2; i<=n/2;i++)
				if(n%i==0)
				{
					b=true;
					break;
				}
		if(!b)
			System.out.println(n+" is prime no");
	}
}
		
		