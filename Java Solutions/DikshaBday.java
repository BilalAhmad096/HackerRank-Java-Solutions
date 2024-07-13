import java.text.*;
import java.util.*;

public class DikshaBday {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int b=in.nextInt();
            int w=in.nextInt();
            int bc=in.nextInt();
            int wc=in.nextInt();
            int z=in.nextInt();
            
            long out=0;
            if(bc==wc){
                out=b*bc+w*wc;
            }if((b*bc)>(b*(wc+z))){
                out=(b*(wc+z))+w*wc;
		
            }if((w*wc)>(w*(bc+z))){
                out=(b*bc)+w*(bc+z);
		System.out.println(out);
            }if(z>bc && z>wc){
                out=b*bc+w*wc;
            }if(bc+z==wc || wc+z==bc){
                out=b*bc+w*wc;
            }if(z+bc>wc && z+wc>bc){
                out=b*bc+w*wc;
            }
            
            
        }
    }
}
