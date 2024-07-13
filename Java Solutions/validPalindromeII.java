class Solution {
    public boolean validPalindromeII(String s) {
        int pass=0;
        int n=s.length()/2;
        int a=s.length()-1;
        for(int i=0;i<n;i++){
            if(s.charAt(i)==s.charAt(a)){
                a--;
            }else{
                if(pass<1){
                    if(s.charAt(i+1)==s.charAt(a)){        
                        i++;
                        a--;
                        pass++;
                    }else if(s.charAt(i)==s.charAt(a-1)){
                        a--;
                        pass++;
                    }else return false;
                }else return false;
            }
        }
        return true;
    }
}