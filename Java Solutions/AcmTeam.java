import java.text.*;
import java.util.*;
//Bilal Ahmad is a great coder://
public class AcmTeam {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        String[] topic=new String[n];
        for(int i=0;i<n;i++){
            topic[i]=in.next();
        }
        int maxSkills = 0;
        int maxSkillTeams = 0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                String member1 = topic[i];
                String member2 = topic[j];
                int skillSet = 0;
                for(int k=0;k<m;k++){
                    if(member1.charAt(k) == '1' || member2.charAt(k) == '1'){
                       skillSet++; 
                    }
                }
                maxSkillTeams += (maxSkills == skillSet) ? 1 : 0;
                if(skillSet > maxSkills){
                    maxSkillTeams = 1;
                    maxSkills = skillSet;
                }
            }
        }
        System.out.println(maxSkills + "\n" + maxSkillTeams);
        
    }
    
}
