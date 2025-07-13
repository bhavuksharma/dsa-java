public class BinarySearchFindFirstStrictGreaterElement {
    public static void main(String[] args){
        int[] numbers = {1,2,4,4,4,5,6};
        int target = 6;
        int result = findFirstStrictGreaterElement(numbers , target);
        
        if (result != -1) {
            System.out.println("found first greater element in array: " + result);
        }
        else{
            System.out.println("Number not found");
        }
    }

    private static int findFirstStrictGreaterElement(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;
        int result = -1;

        while (start <= end) {
            int mid = start + (end - start)/2;
            if (numbers[mid] > target) {
                result = mid;
                end = mid -1;
            }
            else{
                start = mid + 1;
            }
        }
        
        return result;
    }

    
}
