public class segregate0sand1s {
    public static void main(String[]args){
        int arr[]={0,0,0,1,1,0};
        int n=arr.length;
        // this two pass solution
        int numberofzeros=0;
        int numberofones=0;
        for(int ele:arr){
            if(ele==0) numberofzeros++;
            else numberofones++;
        }
        for(int i=numberofzeros;i<n;i++){
            arr[i]=0;
        }
        for(int i=numberofones;i<n;i++){
            arr[i]=1;
        }
        for(int ele:arr){
            System.err.print(ele+" ");

        }
    }
    
}
