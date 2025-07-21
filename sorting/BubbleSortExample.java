public class BubbleSortExample {
    public static void main(String[] args){
        int[] numbers = {5,3,7,2,6,8,2};
        bubblesort(numbers);

        for(int num : numbers){
            System.out.println(num);
        }
    }

    private static void bubblesort(int[] numbers) {
        int length = numbers.length;
        
        for(int i = 0; i < length-1 ; i++ ){
            for(int j = 0; j < length-1-i ; j++){
                if (numbers[j] > numbers[j+1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
    }
}
