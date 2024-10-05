
import java.util.HashMap;
import java.util.Map;

public class atmimplement implements atminterface {
    atm atm = new atm();
    Map<Double,String> ministate = new HashMap<>();     

    @Override   
    public void viewBalance() {
        System.out.println();
        System.out.print("Available Balance is : " + atm.getBalance());
        System.out.println();

    } 

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if(withdrawAmount % 500 == 0 )
        if(withdrawAmount <= atm.getBalance()){
         ministate.put(withdrawAmount, " Amount Withdrawn ");
        System.out.println();
        System.out.print( "Collect the Cash " + withdrawAmount);
        atm.setBalance(atm.getBalance() - withdrawAmount);
        viewBalance();
        }else{
            System.out.print("Insufficient Balance! ");
        }else System.out.println("Please enter the amount minimum of 500");
    }
       

    @Override
    public void depositAmount(double depositAmount) {
        ministate.put(depositAmount, " Amount Deposited ");
      System.out.print(depositAmount + " Deposited Successfully");
      atm.setBalance(atm.getBalance() + depositAmount);
      viewBalance();
    }

    @Override
    public void viewMiniStatement() {
        for(Map.Entry<Double,String> m:ministate.entrySet()){
            System.out.println(m.getKey()+ " " + m.getValue());

        }
       
    }
    
}
