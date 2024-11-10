import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class myapplet {
    public static void main(String[] args) {
        Queue<String> carQueue = new ArrayDeque<>(); 
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Add new car");
            System.out.println("2. Remove first car");
            System.out.println("3. Search for car");
            System.out.println("4. Empty car queue");
            System.out.println("5. Display all cars");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            
            int choice = sc.nextInt();
            sc.nextLine();  

            switch (choice) {
                case 1: { 
                    System.out.print("Enter car plate number: ");
                    String plate = sc.nextLine();
                    if (carQueue.contains(plate)) {
                        System.out.println(plate + " already in the queue.");
                    } else {
                        carQueue.offer(plate);
                        System.out.println("Car added.");
                    }
                    break;
                }
                case 2: { 
                    if (carQueue.isEmpty()) {
                        System.out.println("Queue is empty.");
                    } else {    
                        System.out.print("Remove first car? (1-Yes / 2-No): ");
                        int confirmation = sc.nextInt();
                        sc.nextLine(); 
                        if (confirmation == 1) {
                            System.out.println("Removed car: " + carQueue.poll());
                        } else {
                            System.out.println("Remove action canceled.");
                        }
                    }
                    break;
                }
                case 3: { 
                    System.out.print("Enter car plate number to search: ");
                    String plate = sc.nextLine();
                    System.out.println(carQueue.contains(plate) ? "Car is in the queue." : "Car not found.");
                    break;
                }
                case 4: { 
                    if (carQueue.isEmpty()) {
                        System.out.println("Queue is already empty.");
                    } else {
                        System.out.print("Clear all cars from queue? (1-Yes / 2-No): ");
                        int confirmation = sc.nextInt();
                        sc.nextLine(); 
                        if (confirmation == 1) {
                            carQueue.clear();
                            System.out.println("Queue cleared.");
                        } else {
                            System.out.println("Clear action canceled.");
                        }
                    }
                    break;
                }
                case 5: { 
                    if (carQueue.isEmpty()) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.println("Cars in the queue: " + carQueue);
                    }
                    break;
                }
                case 6: { 
                    exit = true;
                    System.out.println("Exiting.");
                    break;
                }
                default: {
                    System.out.println("Invalid choice.");
                    break;
                }
            }
        }

        sc.close();
    }
}
