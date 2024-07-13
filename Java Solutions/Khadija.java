import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;

public class Khadija{
    public static void main(String[]args){
        Scanner Imran=new Scanner(System.in);
        String Zidane=Imran.nextLine();
        System.out.println("The Entered String is: "+Zidane);
	int a =Zidane.length();
	System.out.println(Zidane.length());
	int b = Integer.parseInt(Zidane);
	int c=a+b;
	System.out.println(c);
	String[] Bano=Zidane.split(":");
	for (String q:Bano){
	  
	  System.out.println(q);
        }
    }

}