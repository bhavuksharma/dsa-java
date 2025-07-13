public class ReverseArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        // reverseArrayTwoPointer(arr);
        // reverseArrayForLoop(arr);
        reverseArrayWithSpecificRange(arr);

        for(int value: arr){
            System.out.println(value);
        }
    }

    private static void reverseArrayWithSpecificRange(int[] arr){
        int i = 2;
        int j = 5;

        while (i< j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }

    private static void reverseArrayTwoPointer(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }

    private static void reverseArrayForLoop(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n/2; i++){
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
    }
}
