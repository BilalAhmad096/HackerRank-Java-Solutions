import java.util.*;
public class Zidane {
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the base number:");
    int n=in.nextInt();
    System.out.println("Enter the power you want to calculate:");
    int p=in.nextInt();
    double result = Math.pow(n,p);
    int bahar=(int) result;
    System.out.println("Answer = " + bahar);
  }
}