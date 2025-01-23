//Input=278346
//Output=876432

import java.util.Arrays;
class SortNoDesOrder
{
	public static void main(String args[])
	{
		int n=278346, length=0,temp=n;
		while(temp!=0)
		{
			length++;
			temp/=10;
		}
		int a[]=new int[length];
		length=0;
		while(n!=0)
		{
			a[length++]=n%10;
			n/=10;
		}
		Arrays.sort(a);
		for(int i=a.length-1; i>=0; i--)
		{
			n*=10;
			n+=a[i];
		}
		System.out.println(n);
	}
}
