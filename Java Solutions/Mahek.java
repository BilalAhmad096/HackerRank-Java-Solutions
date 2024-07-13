import java.util.*;
public class  Mahek{
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(date);
	long b=date.getTime();
	System.out.println(b);
	Calendar bilal=Calendar.getInstance();
	System.out.println(bilal.get(Calendar.HOUR));
    }
}