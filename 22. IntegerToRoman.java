class Solution {
    public String intToRoman(int num) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"I");
        map.put(2,"II");
        map.put(3,"III");
        map.put(4,"IV");
        map.put(5,"V");
        map.put(6,"VI");
        map.put(7,"VII");
        map.put(8,"VIII");
        map.put(9,"IX");
        map.put(10,"X");
        map.put(20,"XX");
        map.put(30,"XXX");
        map.put(40,"XL");
        map.put(50,"L");
        map.put(60,"LX");
        map.put(70,"LXX");
        map.put(80,"LXXX");
        map.put(90,"XC");
        map.put(100,"C");
        map.put(200,"CC");
        map.put(300,"CCC");
        map.put(400,"CD");
        map.put(500,"D");
        map.put(600,"DC");
        map.put(700,"DCC");
        map.put(800,"DCCC");
        map.put(900,"CM");
        map.put(1000,"M");
        map.put(2000,"MM");
        map.put(3000,"MMM");

        StringBuilder res=new StringBuilder();
        int mul=1;
        while(num>0){
            int rem=num%10;
            num=num/10;
            rem=rem*mul;
            mul=mul*10;
            if(rem==0) continue;
            res.insert(0,map.get(rem));
        }

        return res.toString();

    }
}

//optimized approach
class Solution {
    public String intToRoman(int num) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"I");
        map.put(4,"IV");
        map.put(5,"V");
        map.put(9,"IX");
        map.put(10,"X");
        map.put(40,"XL");
        map.put(50,"L");
        map.put(90,"XC");
        map.put(100,"C");
        map.put(400,"CD");
        map.put(500,"D");
        map.put(900,"CM");
        map.put(1000,"M");

        int[] arr={1,4,5,9,10,40,50,90,100,400,500,900,1000};

        StringBuilder res=new StringBuilder();
        
        for(int i=arr.length-1;i>=0;i--){
            while(num>=arr[i]){
                res.append(map.get(arr[i]));
                num=num-arr[i];

                if(num==0) break;
            }
        }
        return res.toString();

    }
}