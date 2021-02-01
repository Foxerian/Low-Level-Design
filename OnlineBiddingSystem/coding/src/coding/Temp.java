package coding;

import java.util.Arrays;

public class Temp {
	public static void solution(int n,int start,int index ,int diff,char arr[])
	{
		int number_digits=n;
		char array[]=arr; 
		if(index==n)
		{
			System.out.println(Arrays.toString(array));
			return;
		}
		for(int i=index;i<number_digits;i++)
		{
			if(i==2)
			{
				//System.out.println("add "+i+" "+array[i-1]);
			}
			if(i==0)
			{
				array[i]=(char)(start+48);
				continue;
			}
			else
			{
				
				
				int cur=array[i-1]-48;
				if(cur+diff<10)
				{
					array[i]=(char)(cur+diff +48);
					
					if(i==2)
					{
						//System.out.println("add "+i+" "+array[i-1]+" "+array[i]);
					}
					solution(n,start,i+1,diff,arr);
				}
				if(cur-diff>=0)
				{
					array[i]=(char)(cur-diff +48);
					if(i==2)
					//System.out.println("sub "+i+" "+array[i-1]+" "+array[i]);
					solution(n,start,i+1,diff,arr);
				}
				else
				{
				return;
				}
			}
			
			
		}
		System.out.println("result" +array[0]+" "+array[1]+" "+array[2]);
		//System.out.println(Arrays.toString(array));
	}
	
	public static void main(String args[])
	{
		System.out.println("Start");
		char array[]=new char[3];
		for(int i=1;i<=9;i++)
		{
			solution(3,i,0,7,array);
		}
		System.out.println("end");
	}

}
