public class BinarySearchLastOccurrence {
    public static void main(String[] args){
        int[] numbers = {1,2,3,4,4,4,4,5,6,7,8,9};
        int target = 4;
        int result = findLastOccurrenceBinarySearch(numbers,target);

        if (result != -1) {
            System.out.println("Target found at index: "+ result);
        }
        else{
            System.out.println("Target not available in the array");
        }
    }

    private static int findLastOccurrenceBinarySearch(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;
        int result = -1;

        while (start <= end) {
            int mid = start + (end-start)/2;

            if (target == numbers[mid]) {
                result = mid;
                start = mid+1;
            }
            else if (target > mid) {
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        

        return result;
    }
}
