// { Driver Code Starts
import java.util.*;
import java.util.Scanner;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n; i++)
            {
                arr[i] = sc.nextInt();
            }
            Solution g = new Solution();
            ArrayList<Integer> result = new ArrayList<Integer>();
            result = g.removeDuplicate(arr,n);
            
            for(int i=0;i<result.size();i++)
                System.out.print(result.get(i) + " ");
            System.out.println();
        t--;
        }
    }
}

class Solution
{
    ArrayList<Integer> removeDuplicate(int arr[], int n)
    {
        // code here 
        // works only for array size whose product is less than 10^18
        // ArrayList<Integer> list=new ArrayList<Integer>();
        // long prod=1;
        // for(int i=0;i<arr.length;i++){
        //     if(prod%arr[i]!=0){
        //         prod=prod*arr[i];
        //         list.add(arr[i]);
        //     }
        // }
        // return list;

        //using hashmap
        ArrayList<Integer> ans=new ArrayList<Integer>();
        Set<Integer> set=new HashSet<>();  
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                continue;
            }
            ans.add(arr[i]);
            set.add(arr[i]);
        }
        

        return ans;
    }
}