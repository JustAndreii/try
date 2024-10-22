import java.util.Arrays;
import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
     
        int[] numbers = new int[9];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 9 integers:");
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
            sum = numbers[i];
        }
        double mean = sum / numbers.length;
        System.out.println("Mean: " + mean);

       
        double median;
        int middle = numbers.length / 2;
        if (numbers.length % 2 == 0) {
            median = (numbers[middle - 1] + numbers[middle]) / 2.0;
        } else {
            median = numbers[middle];
        }
        System.out.println("Median: " + median);

       
        int lowest = numbers[0];
        System.out.println("Lowest number: " + lowest);

       
        int highest = numbers[numbers.length - 1];
        System.out.println("Highest number: " + highest);
    }
}
