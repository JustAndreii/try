import java.util.Scanner;

public class try1{
    public static void main (String []args){
    
        Scanner sc = new Scanner(System.in);

        String [] guest = new String [5];
        int guestcount = 0;
        int choice;
        do { 
        System.out.println("");
        System.out.println("1.Add Guest\n2.Cancel Reservation\n3.View Guest List\n4.Exit");
        System.out.println("");
        System.out.print("Choose an option: ");
        choice = sc.nextInt();
        sc.nextLine();   
        
        switch (choice){

            case 1:
            if (guestcount < 5){
                System.out.print("Enter a guest name: ");
                guest[guestcount] = sc.nextLine();
                guestcount++;
                System.out.println("Guest added. ");
            }else{
                System.out.println("The reservation is full. ");
            }
            break;
        
            case 2:
             if (guestcount > 0){
                System.out.print("Enter the guest position to cancel (1 to " + guestcount + "): ");
                int position = sc.nextInt();
                if (position >= 1 && position <= guestcount){
                    for (int i = position - 1; i < guestcount - 1; i++){
                        guest[i] = guest[i + 1];
                    } 
                    guest[guestcount - 1] = null; //clear last position
                    guestcount--;
                    System.out.println("Guest removed. ");
                }else{
                    System.out.println("Invalid position");
                }
                break;
            }
                case 3:
               for(int i = 0; i < guestcount; i++){
                System.out.println("");
                System.out.println("Guests List: " + guest[i]);
               }
               break;
               case 4: 
               System.out.println("Exiting.....");
               break;

               default:
               System.out.println("Invalid choice");
        }               
        
          } while (choice != 4);

         
    
    }
}