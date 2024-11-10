import java.util.Scanner;
import java.util.Stack;

public class loveutoo{

   public static void main(String []args){
   
      Stack<String> taskStack = new Stack<>();
      Scanner sc= new Scanner(System.in);
      
      

      while(true){

         System.out.println("1.Add task ");
         System.out.println("2.Complete task ");
         System.out.println("3.Undo task ");
         System.out.println("4.View all task ");
         System.out.println("5.Exit ");
         System.out.println("");
         System.out.print("Choose an option: ");

         int choice = sc.nextInt();
         sc.nextLine();

         switch(choice){

            case 1:
            System.out.println("Enter a task to do: ");
            String task = sc.nextLine();
            if(taskStack.contains(task)){
               System.out.println(task + " already in the stack.");
            }else{
               taskStack.push(task);
               System.out.println("Task added.");
            }
            break;

            case 2:
            if(taskStack.empty()){
               System.out.println("Stack is empty no task to complete.");
            }else{
               String complete = taskStack.pop();
               System.out.println(complete + " is completed " );
            }
            break;

            case 3:
            if(taskStack.empty()){
               System.out.println("Stack is empty no task to undo.");
            }else{
               System.out.println(taskStack.peek() + " is undo from the task");
            }
            break;

            case 4:
            if(taskStack.empty()){
               System.out.println("Task stack is empty");
            }else{
               System.out.println("Task list " + taskStack);
            }
            break;
            case 5:        
            System.out.println("Exiting..");
            System.exit(0);
            break;

            default:
            System.out.println("Invalid choice.");
            break;


         }
        

      }
    



}
}