public class Yusuf{
public static void main(String[] args){
  String a="abc";
  String b="abc";
  String c= new String("abc");
  System.out.println(a.equals(b));
  System.out.println(a==b);
  System.out.println("Now the new string is defined explicitly:");
  System.out.println(a.equals(c));
  System.out.println(a==c);
  }
}