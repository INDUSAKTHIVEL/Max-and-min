package Minmax;

import java.util.Scanner;

public class Closest_minmax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int value=Minmax(arr);
		System.out.println(value);
	}
		public static int Minmax(int arr[]) {
		int arr_size=arr.length;
		int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minIndex = -1;
        int maxIndex = -1;
		
        for (int i = 0; i < arr_size; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        int latestmin=-1;
        int latestmax=-1;
        int result=arr_size;
        for(int i=0;i<arr_size;i++)
        {
        	if(arr[i]==max)
        	{
        		latestmax=i;
        		if(latestmax>=0)
        		{
        			result=Math.min(result, i-latestmin+1);
        		}
        	}
        }
        return result;
            }
            
        }
        