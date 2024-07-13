import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
public class Abd{
    public static void main(String[] args){
        Scanner hifzu=new Scanner(System.in);
        int n=hifzu.nextInt();
        int[] billa=new int[n];
        for(int i=0;i<n;i++){
            billa[i]=hifzu.nextInt();
        }
        int a=0;
        int one=0;
        int two=0;
        int three=0;
        int four=0;
        int five=0;
        int[] fatto=new int[5];
        for(int i=0;i<n;i++){
            a=billa[i];
            
            if(a==1){
                one+=1;
                continue;
            }if(a==2){
                two+=1;
                continue;
            }if(a==3){
                three+=1;
                continue;
            }if(a==4){
                four+=1;
                continue;
            }if(a==5){
                five+=1;
                continue;
            }
        }
        fatto[0]=one;
        fatto[1]=two;
        fatto[2]=three;
        fatto[3]=four;
        fatto[4]=five;
        Arrays.sort(fatto);
        for(int i=0;i<5;i++){
            System.out.println(fatto[i]);
        }
        
        int max=fatto[4];
        for(int i=0;i<6;i++){
            if(fatto[i]==max){
                System.out.println(i);
                break;
                
            }else{
                continue;
            }
        }
        
    }
    
}
