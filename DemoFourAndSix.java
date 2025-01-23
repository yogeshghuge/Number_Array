/*
Input={14,16,21,34,36,20,22,18,9,15}
consider black number,which is divisible by 4,
consider white number, which is divisile by 6,
consider grey number, which is both black and white,
Replace black number with -1,
Replace white number with -2,
Replace grey number as a -3.
Output=[14, -1, 21, 34, -3, -1, 22, -2, 9, 15]
*/


import java.util.Arrays;
class DemoFourAndSix
{
	public static void main(String args[])
	{
		int a[]={14,16,21,34,36,20,22,18,9,15};
		for(int i=0; i<a.length;i++)
			if(a[i]%4==0)
				if(a[i]%6==0)
					a[i]=-3;
				else
					a[i]=-1;
			else
				if(a[i]%6==0)
					a[i]=-2;
			
		System.out.println(Arrays.toString(a));
	}
}
//[14, -1, 21, 34, -3, -1, 22, -2, 9, 15]