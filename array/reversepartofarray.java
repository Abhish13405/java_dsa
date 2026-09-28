public class reversepartofarray {
    public static void main (String[]args){
        int arr[]={1,2,3,4,5,6,7,8};
        int n=arr.length;
        int i=2,j=5;

        while(i<j){
       int temp=arr[i];
       arr[i]=arr[j];
       arr[j]=temp;
       i++;
       j--;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }

    }
    
}
