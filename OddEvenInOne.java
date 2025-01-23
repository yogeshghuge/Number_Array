//Input=278346
//Output=372468

import java.util.Arrays;
class OddEvenInOne
{
	public static void main(String args[])
	{
		int n=278346,length=0,temp=n;
		while(temp!=0)
		{
			length++;
			temp/=10;
		}
		int a[]=new int[length];
		for(int i=a.length-1; i>=0; i--)
		{
			a[i]=n%10;
			n/=10;
		}
		Arrays.sort(a);
		for(int i=0; i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				n*=10;
				n+=a[i];
			}
		}
		for(int i=0; i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				n*=10;
				n+=a[i];
			}
		}
		System.out.println(n);
	}
}

				
