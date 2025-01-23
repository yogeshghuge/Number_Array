class PalindromeNo
{
	public static void main(String args[])	
	{
		int n=611226,temp=n,sum=0;
		while(temp!=0)
		{
			sum*=10;
			sum+=temp%10;
			temp/=10;
		}
		if(n==sum)
		{
			System.out.println(n+" is a palindrome no");
		}
	}
}