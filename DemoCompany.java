/*
Input={14,24,16,22,30,26,34,61,36,19}
consider black number,which is divisible by 6,
consider white number, which is contains digit as 6,
consider grey number, which is both black and white,
Replace black number with -1,
Replace white number with -2,
Replace grey number as a -3.
Output=[14, -1, -2, 22, -1, -2, 34, -2, -3, 19]
*/

import java.util.Arrays;
class DemoCompany
{
	public static void main(String args[])
	{
		int a[]={14,24,16,22,30,26,34,61,36,19};
		for(int i=0; i<a.length;i++)
		{
			int temp=a[i];
			boolean b=false;
			while(temp!=0)
			{
				if(temp%10==6)
				{
					b=true;
					break;
				}
				temp/=10;
			}
			if(b)
				if(a[i]%6==0)
					a[i]=-3;
				else
					a[i]=-2;
			else
				if(a[i]%6==0)
					a[i]=-1;
		
		}
		System.out.println(Arrays.toString(a));
	}

}
		
		
	
