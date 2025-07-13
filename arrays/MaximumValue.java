public class MaximumValue{
    public static void main(String[] args){
        int[] numbers = {2,5,1,9,7};

        int max = numbers[0];
        for(int i = 1; i< numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
        }

        System.out.println("The maximum value is: " + max);
    }
}