import java.util.*;
class Replace{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            Solution g=new Solution();
            g.convertFive(n);
        }
    }
}

class Solution{
	public static void convertFive(int n){
        int newNum=0;
        int mul=1;

        while(n>0){
            int rem=n%10;
            newNum+=(rem==0?5:rem)*mul;
            mul=mul*10;
            n=n/10;
        }
        System.out.println(newNum);
    }
}