class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        
        Arrays.sort(products);
        // System.out.println(products);
        String s="";
        List<List<String>> list=new ArrayList<>();
        for(int i=0;i<searchWord.length();i++){
            s=s+searchWord.charAt(i);
            // System.out.println(s);
            List<String> l=new ArrayList<>(); 
            int low=0; int high=products.length-1;
            int mid=0;
            while(low<high){
                mid=(low+high)/2;
                int cmp=s.compareTo(products[mid]);
                if(cmp<=0){
                    high=mid;
                }
                else{
                    low=mid+1;
                }
            }
            for(int m=low;m<Math.min(low+3,products.length);m++){
                if(products[m].length()<s.length() || !products[m].substring(0,s.length()).equals(s)){
                    break;
                }
                l.add(products[m]);
            }
            list.add(l);
        }
        return list;
    }
}


// class Solution {
//     // Equivalent code for lower_bound in Java
//     int lower_bound(String[] products, int start, String word) {
//         int i = start, j = products.length, mid;
//         while (i < j) {
//             mid = (i + j) / 2;
//             if (products[mid].compareTo(word) >= 0)
//                 j = mid;
//             else
//                 i = mid + 1;
//         }
//         return i;
//     }
// public
//     List<List<String>> suggestedProducts(String[] products, String searchWord) {
//         Arrays.sort(products);
//         List<List<String>> result = new ArrayList<>();
//         int start = 0, bsStart = 0, n = products.length;
//         String prefix = new String();
//         for (char c : searchWord.toCharArray()) {
//             prefix += c;

//             // Get the starting index of word starting with `prefix`.
//             start = lower_bound(products, bsStart, prefix);

//             // Add empty vector to result.
//             result.add(new ArrayList<>());

//             // Add the words with the same prefix to the result.
//             // Loop runs until `i` reaches the end of input or 3 times or till the
//             // prefix is same for `products[i]` Whichever comes first.
//             for (int i = start; i < Math.min(start + 3, n); i++) {
//                 if (products[i].length() < prefix.length() || !products[i].substring(0, prefix.length()).equals(prefix))
//                     break;
//                 result.get(result.size() - 1).add(products[i]);
//             }

//             // Reduce the size of elements to binary search on since we know
//             System.out.println(start);
//             bsStart = Math.abs(start);
//         }
//         return result;
//     }
// }