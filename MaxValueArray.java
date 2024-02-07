public class MaxValueArray {
    public static void main(String[] args) {
       
        int[] numbers = {5, 10, 3, 8, 20};

        
        int max = numbers[0];

       
        int i = 1;

        
        do {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            i++;
        } while (i < numbers.length);

        
        System.out.println("Maximum value in the array: " + max);
    }
}
