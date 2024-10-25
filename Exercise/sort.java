import java.util.Arrays;
import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
     
        int[] numbers = new int[9];
        Scanner sc = new Scanner(System.in);

        System.out.println("Input 9 integers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);

       
        System.out.println("Sorted array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

       
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double mean = sum / numbers.length;
        System.out.println("Mean: " + mean);

       
        int median = numbers [4];
        System.out.println("median: "+ median);
       
   
        System.out.println("Lowest number: " + numbers[0]);

        System.out.println("Highest number: " + numbers[8]);
    }
}