class ToFindArmstrongNo
{
	public static void main(String args[])
	{

		int count=0;
		  for(long i=0; i<=1000000000;i++)
		{
			long n=i,temp=n,length=0,sum=0;
			while(temp!=0)
			{
				length++;
				temp/=10;
			}
			temp=n;
			while(temp!=0)
			{
				sum+=Math.pow(temp %10,length);
				temp/=10;
			}
			if(n==sum)
			{
				count++;
				if(count==31)
				{
					System.out.println(n+" is 31th Armstrong number");
					break;
				}
			}
		}
	}
}
//534494836 is 31th Armstrong number