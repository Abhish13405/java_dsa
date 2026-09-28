public class Max{
    public static void main(String[]args){
        int arr[]={5,6,7,8,90};
        int max=arr[0];
        int n=arr.length;
        for(int i=0;i<=n-1;i++){
            if(arr[i] > max){
                max=arr[i];
            }
            
        }

        System.err.println(max);
    }
}