class PalindromeAvg
{
	public static void main(String args[])
	{
		int a=0,count=0,last=58;
		while(true)
		{
			sum*=10;
			sum+=n%10;
			n/=10;
		}
		if(a==sum)
			count++;
		if(count==last)
		{
			System.out.println(last+"th palindrome number is"+a);
			break;
		}
		a++;
	}
}