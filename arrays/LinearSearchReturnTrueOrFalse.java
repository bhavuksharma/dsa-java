public class LinearSearchReturnTrueOrFalse {
    public static void main(String[] args){
        int[] numbers = {1,4,6,3,7,8};
        int target = 9;

        boolean found = linearSearch(numbers, target);

        if(!found){
            System.out.println("number found: "+ found);
        }
        else{
            System.out.println("number found: "+ found);
        }
        
    }

    private static boolean linearSearch(int[] numbers, int target) {
        for(int i = 0; i < numbers.length; i++){
            if(target == numbers[i]){
               return true; 
            }
        }
        return false;
    }
}


// time complexity: O(n)
// space complexity: O(1)