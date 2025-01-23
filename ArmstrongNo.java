class ArmstrongNo
{
	public static void main(String args[])
	{
		int  n=153,temp=n,length=0,sum=0;
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
				System.out.println(n+" is Armstrong number");
	}
}
