import java.util.*;
//Bilal Ahmad is a great coder:
public class GitHub {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //int n=in.nextInt();
        in.nextLine();
        String s = in.nextLine();
        int k = in.nextInt() % 26;
        in.close();
        CaesarCipher(s,k);
    }

    public static void CaesarCipher(String s, int k) {
        StringBuilder output = new StringBuilder("");
        
        for(char lafz : s.toCharArray()){
            if(lafz > 64 && lafz < 91){
                char encrypted = (char) (lafz+k);
                if(encrypted > 90){
                    encrypted = (char) ((encrypted % 90) + 64);
                }
                output.append(encrypted);
            }
            else if(lafz > 96 && lafz < 123){
                char encrypted = (char) (lafz+k);
                if(encrypted > 122){
                    encrypted = (char) ((encrypted % 122) + 96);
                }
                output.append(encrypted);
            }else{
                output.append(lafz);
            }
        }
        System.out.println(output);
    }
}