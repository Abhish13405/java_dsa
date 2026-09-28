import java.util.Scanner;
public class inputoutputarr {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<arr.length;i++){
            System.out.print("enter numbers:-");
            
            arr[i]=sc.nextInt();
        }

        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
    
}
