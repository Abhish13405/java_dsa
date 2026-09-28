public class missingarray {
    public static void main(String[]args){
        int arr[]={1,2,3,5};
        int n=arr.length+1;
        int actualsum=0;
        int sum=n*(n+1)/2;
        for(int ele:arr){
            actualsum=actualsum+ele;


        }
        int missing_number=sum-actualsum;
        System.out.println(missing_number);

    }
    
}
