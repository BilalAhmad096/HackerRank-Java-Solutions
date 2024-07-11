public class doli {
    public static int getUmbrellas(int requirement, int[] sizes){
        int min = 1000;  // we give the max value to it for comparison
        int flag=0;
        int req=0;

        for(int i=0;i<sizes.length;i++){
            if(requirement % sizes[i] == 0){   // condition to check if exact umbrellas present
                req = requirement/sizes[i];
                flag=1;  // sets value to 1 for later checking
            }
            if(req<min){  // if more than 1 umbrellas completely fill the requirement, the min is taken
                min=req;
            }
        }
        if(flag == 1){  // checks if there is result present, if not, returns -1
            return min;
        }else{
            return -1;
        }
    }
}
