public class BinarySearchFirstOccurrence {
    public static void main(String[] args){
        int[] numbers = {1,2,4,4,4,5,6,7,8};
        int target = 4;
        int result = findFirstOccurrenceBinarySearch(numbers, target);

        if (result != -1) {
            System.out.println("First occurrence of the target found at index: "+ result);
        }
        else{
            System.out.println("Target not found in the array");
        }
    }

    private static int findFirstOccurrenceBinarySearch(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;
        int result = -1;

        while (start <= end) {
            int mid = start + (end - start)/2;
            if (target == numbers[mid]) {
                result = mid;
                end = mid-1;
            }
            else if(target < numbers[mid]){
                end = mid-1;    
            }
            else{
                start = mid + 1;
            }
        }

        return result;
    }
    
}
