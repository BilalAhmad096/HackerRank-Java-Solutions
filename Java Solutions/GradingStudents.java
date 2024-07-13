import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
public class GradingStudents{
    public static void main (String[]args){
        Scanner sudais=new Scanner(System.in);
        int n=sudais.nextInt();
        int a[]= new int[n];
        for(int i=0;i<n;i++){
            a[i]=sudais.nextInt();
        }
        int b[]=new int[n];
        int z=0;
        int temp=0;
        for(i=0;i<n;i++){
            temp=a[i];
            if(a[i]<38){
                
                b[i]=a[i];
                continue;
                
            }else if((a[i]%3==0)){                
                b[i]=a[i];
                continue;
            }else if((a[i]%3)<3){
                z=a[i]%5;
                b[i]=a[i]+(5-z);
                continue;
            }
        }
        
        for(int i=0;i<n;i++){
            System.out.println(b[i]);
        }
        
    }
}
