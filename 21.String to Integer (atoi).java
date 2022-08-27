class Solution {
    public int myAtoi(String s) {
        if(s.length()==0) return 0;
        long res=0;
        int idx=0;
        int sign=1;
        s=s.trim();
        if(s.length()==0) return 0;
        if(s.charAt(idx)=='-') {
            sign=-1;
            idx++;
        }
        else if(s.charAt(idx)=='+') {
            sign=+1;
            idx++;
        }
        s=s.substring(idx);

        for(int i=0;i<s.length();i++){
            int num=s.charAt(i)-'0';
            if(num>=0 && num<=9){
                res=res*10+num;

                if(sign==-1 && sign*res<=Integer.MIN_VALUE) return Integer.MIN_VALUE;
                if(sign==1 && sign*res>=Integer.MAX_VALUE) return Integer.MAX_VALUE;
            }
            else{
                break;
            }
        }
        
        return (int)res*sign;
    }
}