public class LinearSearchReturnIndex {
    public static void main(String[] args){
        int[] numbers = {2,4,5,7,9};
        int target = 7;

        int index = linearSearch(numbers, target);

        if(index != -1){
            System.out.println("number found at index: "+ index);
        }
        else{
            System.out.println("number not found");
        }
    }

    private static int linearSearch(int[] numbers, int target) {
       
        for(int i = 0; i < numbers.length ; i++){
            if (target == numbers[i]) {
                return i;
            }
        }
        return -1;
    }
}
