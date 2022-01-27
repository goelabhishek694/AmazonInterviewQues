class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        List<Integer> res=new ArrayList<>();
        int[] visited=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.get(ch)==null?1:map.get(ch)+1);
        }
        int count=0; int partition=0; int lastidx=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(visited[ch-'a']==0) {
                visited[ch-'a']=1;
                count++;
            }
            map.put(ch,map.get(ch)-1);
            if(map.get(ch)==0) count--;
            if(count==0){
                partition++;
                res.add((i-lastidx)+1);
                lastidx=i+1;
            }
        }
        return res;
    }
}