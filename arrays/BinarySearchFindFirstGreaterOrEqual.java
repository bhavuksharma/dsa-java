public class BinarySearchFindFirstGreaterOrEqual {
    public static void main(String[] args){
        int[] numbers = {1,2,3,6,7,8,8,8,8,8,9};
        int target = 3;
        int result = getIndexForGreaterThanOrEqualToTarget(numbers,target);

        if (result != -1) {
            System.out.println("found first number greater or equal to target at index: "+ result);
        }
        else{
            System.out.println("Number not found in the array");
        }
    }

    private static int getIndexForGreaterThanOrEqualToTarget(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;
        int result = -1;

        while (start <= end) {
            int mid = start + (end-start)/2;

            if (numbers[mid] >= target) {
                result = mid;
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }

        return result;
        
    }
}
