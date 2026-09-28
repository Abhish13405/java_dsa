public class secondlargestmax {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 5 };

        int max = arr[0];
        int smax = arr[0];

        // largest
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // second largest
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > smax && arr[j] != max) {
                smax = arr[j];
            }
        }

        System.out.print(smax);
    }
}