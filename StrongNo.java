class StrongNo
{
	public static void main(String args[])
	{
		int n=145,temp=n,sum=0;
		while(temp!=0)	
		{
			int fact=1;
			for(int i=1; i<=temp%10;i++)
				fact*=i;
			sum+=fact;
			temp/=10;
		}
		if(n==sum)
			System.out.println(n+" is a Strong no");
	}
}