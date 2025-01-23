class AnyArmstrong
{
	public static void main(String args[])
	{
		int a=0, count=0, last=16;
		while(true)
		{
			int temp=a, length=0, sum=0;
			while(temp!=0)
			{
				length++;
				temp/=10;
			}
			temp=a;
			while(temp!=0)
			{
				sum+=Math.pow(temp%10,length);
				temp/=10;
			}
			if(a==sum)
				count++;
			if(count==last)
			{
				System.out.println(last+" th armstrong number is " +a);
				break;
			}
			a++;
		}
	}
}
			