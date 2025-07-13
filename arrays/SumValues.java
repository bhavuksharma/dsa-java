public class SumValues {
    public static void main(String[] args){
        int[] numbers = {2,5,1,9,7};
        int sum = 0;

        for(int i = 0; i < numbers.length ; i++){
            sum += numbers[i];
        }

        System.out.println("Total sum of numbers is: "+ sum);
    }
}

// time complexity O(n)
// space complexity O(1)