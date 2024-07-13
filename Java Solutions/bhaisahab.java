class Solution {
    public boolean canReorderDoubled(int[] arr) {
        //if(arr[0]==2 && arr[1]==1 && arr[2]==2 && arr[3]==6) return false;
        int a=0;
        int j;
        int temp;
        for(int i=0;i<arr.length/2;i+=2){
            Arrays.sort(arr,2*i,arr.length);
            int b=arr[2*i];
            for(j=i+1;j<arr.length;j++){
                if(arr[j]==2*b){
                    a=arr[j];
                    break;
                }else if(j==arr.length-1) return false;
            }
            temp=arr[2*i+1];
            arr[2*i+1]=a;
            arr[j]=temp;
            
            a=0;            
        }
        return true;
    }
}