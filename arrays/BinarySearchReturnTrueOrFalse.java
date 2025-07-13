public class BinarySearchReturnTrueOrFalse {
    public static void main(String[] args){
        int[] numbers = {1,2,3,4,5,6,7,8,9};
        int target = 129;
        boolean found = binarySearch(numbers, target);

        if (!found) {
            System.out.println("Number does not exist in the given array");
        }
        else{
            System.out.println("Number is available in the given array");
        }
    }

    public static boolean binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start+(end-start)/2;

            if(target == arr[mid]) {
                return true;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return false;
    }
}
