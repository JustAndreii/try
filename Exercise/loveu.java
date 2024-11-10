import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class loveu {

    public static void main(String []args){
    
        Queue<String> plateQueue = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while(!exit){
    
            System.out.println("1.Add new car:");            
            System.out.println("2.Remove first car:");           
            System.out.println("3.Search for a car:");          
            System.out.println("4.Empty car queue:");
            System.out.println("5.Display all car:");          
            System.out.println("5.Exit:");
            System.out.println("");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
              
                case 1:
                System.out.println("Enter car plate number:");   
                String plate = sc.nextLine();
                if(plateQueue.contains(plate)){
                    System.out.println(plate + " already in the queue.");   
                }else{
                    plateQueue.offer(plate);
                    System.out.println(plate + " added to the queue.");   
                    break;
                }

                case 2:  
                          
                if(plateQueue.isEmpty()){
                    System.out.println("Car queue is empty.");                   
                }else{
                    System.out.println("Are you sure you want to delete? " + plateQueue.peek() +  "(1-Yes / 2-No)");
                    int confirmation = sc.nextInt();
                    sc.nextLine();
                    if(confirmation == 1){
                        System.out.println(plateQueue.poll() + " is removed from the queue");
                    }else{
                        System.out.println("Remove action canceled. ");   
                    }
                }
                break;               
            
               case 3:
               System.out.println("Enter a car to search: ");
               String search = sc.nextLine();
               if(plateQueue.contains(search)){
                   System.out.println( search + " is found in the queue");
               }else{
                System.out.println("Car not found.");
               }
               break;

               case 4:
                 
               if(plateQueue.isEmpty()){
                System.out.println("Car queue is empty.");                
               }else{
                System.out.println("Are you sure to remove all cars? (1-Yes / 2-No)");
                int confirmation = sc.nextInt();
                sc.nextLine();
                if(confirmation == 1){
                    plateQueue.clear();
                    System.out.println("All cars removed from the queue");   
                }else{
                    System.out.println("Clear action canceled");
                }
               }
               break;

               case 5:

               if(plateQueue.isEmpty()){
                System.out.println("There are no cars in queue");   
               }else{
                System.out.println("Cars in the queue " + plateQueue);
               }
               break;

               case 6:
               exit = true;
               System.out.println("Exiting.");
               break;

               default: 
               System.out.println("Invalid choice.");





        }
    sc.close();

    }
    
}
}