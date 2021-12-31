#include<bits/stdc++.h>
using namespace std;

 // } Driver Code Ends
class Solution
{
   public:
    int print2largest(int arr[], int arr_size)
    {
    	//code here.
        int l1=Integer.MIN_VALUE;
        int l2=Integer.MIN_VALUE;

        for(int i=0;i<arr_size;i++){
            if(arr[i]>l1){
                l2=l1;
                l1=arr[i];
            }
            else if(arr[i]>l2){
                l2=arr[i];
            }
        }
        return l2;

    }

};

// { Driver Code Starts.
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
	    int n;
	    cin>>n;
	    int arr[n];
	    for(int i=0;i<n;i++)
	      cin>>arr[i];
	    Solution ob;  
	    int ans=ob.print2largest(arr, n);
	    cout<<ans;
	    cout<<"\n";
	}
	return 0;
}
  // } Driver Code Ends