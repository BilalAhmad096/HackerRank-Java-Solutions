import java.util.*;
public class BinarySearchMethod{
    public static void main(String args[]){
        int a[]=new int[5];
        a[0]=1;
        a[1]=2;
        a[2]=4;
        a[3]=9;
        a[4]=16;
        System.out.println(Arrays.binarySearch(a,9));
	System.out.println("Integer array: "+Arrays.spliterator(a));
    }
}

