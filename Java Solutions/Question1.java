import java.util.*;
public class Question1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int top=in.nextInt();
        Integer[] x=new Integer[n];
        for(int i=0;i<top;i++) x[i]=in.nextInt(); 
        System.out.println(underflow(x, top));
        System.out.println(overflow(x, top));
        push(x, top);
        pop(x, top);
        in.close();
    }
    public static boolean underflow(Integer[] x, int top){
        if(top==-1) return true;
        return false;
    }
    public static boolean overflow(Integer[] x,int top){
        if(top==x.length-1) return true;
        return false;
    }
    public static void push(Integer[] x,int top){
        if(overflow(x, top)){
            System.out.println("Overflow");
            return;
        }
        Scanner temp=new Scanner(System.in);
        x[top]=temp.nextInt();
	    top++;
        temp.close();
        return;
    }
    public static void pop(Integer[] x,int top){
        if(underflow(x, top)){
            System.out.println("Underflow");
            return;
        }
        x[top]=null;
        top--;
        return;
    }
}
