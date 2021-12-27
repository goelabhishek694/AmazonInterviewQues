import java.util.Scanner;
import java.util.*;
import java.io.*;

class ThirdLargestElement
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n =sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			Solution g = new Solution();
			System.out.println(g.thirdLargest(arr,n));
		t--;
		}
	}
}


class Solution
{
    int thirdLargest(int a[], int n)
    {
	    int l1=0,l2=0,l3=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>l1){
                l3=l2;
                l2=l1;
                l1=a[i];
            }
            else if(a[i]>l2){
                l3=l2;
                l2=a[i];
            }
            else if(a[i]>l3){
                l3=a[i];
            }
        }
        return l3;
    }
}
