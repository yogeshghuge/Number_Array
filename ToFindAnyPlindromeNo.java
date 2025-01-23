class ToFindAnyPlindromeNo
{
	public static void main(String args[])
	{
		int count=0;
		for(int i=0; i<=1000;i++)
		{
			int n=i,temp=n,sum=0;
			while(temp!=0)
			{
				sum*=10;
				sum+=temp%10;
				temp/=10;
			}
			if(n==sum)
			{
				count++;
				if(count==58)
				{
					System.out.println(n+ " is 58th palindrome no");
					break;
				}
			}
		}
	}
}
//484 is 58th palindrome no
	