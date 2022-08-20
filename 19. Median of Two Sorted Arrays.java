// class Solution {
//     public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//         int[] arr=new int[nums1.length+nums2.length];
//         int i=0;
//         int j=0;
//         int k=0;
//         while(i<nums1.length && j<nums2.length){
//             if(nums1[i]<nums2[j]){
//                 arr[k]=nums1[i];
//                 i++;
//             }
//             else if(nums2[j]<nums1[i]){
//                 arr[k]=nums2[j];
//                 j++;
//             }

//             k++;
//         }

//         while(i<nums1.length){
//             arr[k]=nums1[i];
//             i++;
//             k++;
//         }

//         while(j<nums2.length){
//             arr[k]=nums1[j];
//             j++;
//             k++;
//         }

//         if(arr.length%2==0){
//             int idx1=arr.length/2;
//             int idx2=idx1-1;
//             return (arr[idx1]+arr[idx2])/2.0;
//         }
//         else return arr[(arr.length/2)];
//         return -1;
//     }
// }

class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        if(b.length<a.length){
            int[]c=a;
            a=b;
            b=c;
        }
        int lo=0; //0
        int hi=a.length; //4
        int tne=a.length+b.length; //5

        while(lo<=hi){
            int aIdx=(lo+hi)/2; //2
            int bIdx=(tne/2)-aIdx; //1

            int aVal=(aIdx>=a.length)? Integer.MAX_VALUE:a[aIdx]; //4
            int am1=(aIdx-1<0)?Integer.MIN_VALUE:a[aIdx-1]; //3
            int bVal=(bIdx>=b.length)? Integer.MAX_VALUE:b[bIdx];//+inf
            int bm1=(bIdx-1<0)?Integer.MIN_VALUE:b[bIdx-1]; //1,

            if(am1>bVal){
                hi=aIdx-1;
            }
            else if(bm1>aVal){
                lo=aIdx+1;
            }
            else{
                double median=0.0;
                if(tne%2==0){
                    median=(Math.max(am1,bm1) + Math.min(aVal,bVal))/2.0;
                }
                else{
                    median=Math.min(aVal,bVal);
                }

                return median;
            }
        }
        return 0;
    }
}