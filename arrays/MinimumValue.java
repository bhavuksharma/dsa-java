public class MinimumValue {
    public static void main(String[] args){
        int[] numbers = {2, 5, 1, 9, 7};

        int min = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] < min){
                min = numbers[i];
            }
        }

        System.out.println("The minimum number is: "+ min);
        
    }
}
