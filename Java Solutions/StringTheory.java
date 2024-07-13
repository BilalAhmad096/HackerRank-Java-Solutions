import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class StringTheory{
 public static void main(String args[]){
	System.out.println("Enter the String:");
	Scanner Imran=new Scanner(System.in);
	String Sudais=Imran.nextLine();
	String[] ab = Sudais.split(" ");
	int x=0;
	for(int i=0;i<ab.length;i++){
	 if(ab[i]==ab[i]){
	 x+=1;	
	 }else{
	 continue;
	 }
	}

	System.out.println("The Entered String is: "+Sudais);
	System.out.println("The Splitted String is:");
	for(int i=0;i<x;i++){
	System.out.println(ab[i]);
	}
	
 }
}
	
	