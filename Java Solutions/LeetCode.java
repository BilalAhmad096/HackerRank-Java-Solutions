public class LeetCode {
    public int reverseBits(int n) {
        String p=Integer.toBinaryString(n);
        while(p.length()<32) p="0"+p;
        StringBuilder junaid=new StringBuilder();
        junaid.append(p);
        junaid.reverse();
        String a=junaid.toString();
        if(a.length()>31){
            a=a.substring(a.length()-31);
        }
        int calc=Integer.parseInt(a,2);
        return (calc);
    }
}