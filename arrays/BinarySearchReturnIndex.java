public class BinarySearchReturnIndex {
    public static void main(String[] args){
        int[] numbers = {1,2,3,4,5,5,6,7,8,9};
        int target = -7;
        int index = binarySearch(numbers, target);

        if (index == -1) {
            System.out.println("Target does not exist in the given array");
        }
        else{
            System.out.println("Target found at index: "+ index);
        }
    }

    public static int binarySearch(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;
        
        while(start <= end){
            int mid = (start+end)/2;

            if(target == arr[mid]){
                return mid;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }

        return -1;
    }
}
