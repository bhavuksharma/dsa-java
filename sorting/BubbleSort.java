public class BubbleSort{
    public static void main(String[] args) {
        int[] arr = {5,4,2,1};
        bubbleSort(arr);

        for(int num : arr){
            System.out.println(num);
        }

    }

    public static void bubbleSort(int[] arr){
        int length = arr.length;
        // Outer loop: how many passes
        for(int i = 0; i < length - 1; i++){
            // Inner loop: compare pairs in unsorted parts
            for(int j = 0; j < length - i - 1 ; j++){
                // If left is bigger than right -> swap them
                if (arr[j] > arr[j+1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}