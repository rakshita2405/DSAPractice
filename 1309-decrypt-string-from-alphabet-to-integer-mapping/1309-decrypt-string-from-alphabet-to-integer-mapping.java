class Solution {
    public String freqAlphabets(String s) {
        int n=s.length();
        char[] alpha={' ','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        StringBuilder sb=new StringBuilder();
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)!='#'){
               int num= s.charAt(i)-'0';
               sb.append(alpha[num]);
            }
            else{
               int num = (s.charAt(i-2) - '0') * 10 + (s.charAt(i-1) - '0');
               sb.append(alpha[num]);
               i-=2;
            }
            // sb=sb.reverse();
        }
        return sb.reverse().toString();

    }
}