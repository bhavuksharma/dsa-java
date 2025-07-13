public class BinarySearchFindLastSmallerElement {
    public static void main(String[] args){
        int[] numbers = {1,2,3,3,3,4,4,5,5,6,7,7,8};
        int target = 0;
        int result = binarySearchFindLastSmallerElement(numbers,target);

        if (result != -1) {
            System.out.println("Last smaller number to target is at index: "+ result);
        }
        else{
            System.out.println("not found");
        }
        
    }

    private static int binarySearchFindLastSmallerElement(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        int result = -1;

        while (start <= end) {
            int mid = start + (end-start)/2;
            if (numbers[mid] <= target) {
                result = mid;
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }

        return result;
    }
}
