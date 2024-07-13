import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HelloWorld{
    public static void main(String[] args){
        Scanner bilal=new Scanner(System.in);
	int n = bilal.nextInt();
        int a[] = new int[4];
	for(int i=0;i<n;i++){
	 a[i] = bilal.nextInt();
        }
	System.out.println("The array is " + a);
    }
}    