import java.util.*;

public class Inputarr {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[6];
        int n = arr.length;

        // Input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            arr[i] = sc.nextInt();
        }

        // Output
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}