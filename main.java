//cyril bayot
import java.util.Scanner;

public class main{
 
    public static void main(String []args){
      atminterface op = new atmimplement();
        int atmnumber = 12345;
        int atmpin = 1234;

        Scanner sc = new Scanner (System.in);
        
        System.out.println();

        System.out.println("Welcome to SCAMMER ATM MACHINE");

        System.out.println();

        System.out.print("Enter your ATM number: ");
        int atmNumber = sc.nextInt();

        System.out.print("Enter your pin: ");
        int pin = sc.nextInt();

        if ((atmnumber == atmNumber) && (atmpin == pin)) {

            while (true) { 
                System.out.println();
                System.out.println("1.Check Balance \n2.Withdraw Cash\n3.Deposit Amout\n4.View Mini Statement\n5.Exit");
                System.out.println();
                System.out.print("Enter Choice: ");
                int ch = sc.nextInt();
                System.out.println();
              

                switch (ch) {
                    case 1:
                        op.viewBalance();
                        break;
                    case 2:
                        System.out.print("Enter amount to Withdraw : ");
                        double withdrawAmount = sc.nextDouble();
                        op.withdrawAmount(withdrawAmount);
                        break;
                    case 3:
                        System.out.print("Enter Amount to Deposit : ");
                        double depositAmount = sc.nextDouble();
                        op.depositAmount(depositAmount);
                        break;
                    case 4:
                        op.viewMiniStatement();
                        break;
                    case 5:
                        System.out.println("Collect your atm card! \nThank you for using this machine! ");
                        System.exit(0);
                    default:
                        System.out.println("Please enter correct choice");
                        break;
                } 
            }
            
        }else{
            System.out.println("Wrong ATM number or pin");
            System.exit(0);
        }




    }
}