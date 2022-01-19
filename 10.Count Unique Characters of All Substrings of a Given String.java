class Solution {
    public int uniqueLetterString(String s) {
        int i=0; int j=0; int count=0;
        while(j<s.length()){
            HashMap<Character,Integer> map=new HashMap<>();
            int prevCount=0;
            for(int i=j;i<s.length();i++){
                int res=map.containsKey(s.charAt(i));
                if(res==1){
                    prevCount-=1;
                }
                else{
                    map.put(s.charAt(i),1);
                    prevCount+=1;
                }
                count+=prevCount;
            }
            j++;
        }
        return count;
    }

}