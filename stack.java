
import java.util.Scanner;

class Stack {

    private int maxSize;
    private String[] stackArray;
    private int top;

    public Stack(int size){
       maxSize = size;
       stackArray = new String[maxSize];
       top = -1;
    }
    public void push(String name){
      
        if(top == maxSize - 1){
            System.out.println("Cannot push " + name);

        }else{
            stackArray[++top] = name;
            System.out.println(name + " push to stack");

        }
    }
    
    public String pop(){
      if(isEmpty()){
         System.out.println("No name to pop. ");
         return null;
      }else{
        String name = stackArray[top--];
        System.out.println("Pooped: " + name );    
        return name;
      }
    }

    public String list(){
        for(int i = 0; i < stackArray.length; i++){
            System.out.println("List of stack: " + stackArray[i] );  
                 
        }
        return stackArray[top];
        
    }

    public String peek(){
     if(isEmpty()){
        System.out.println("Stack is empty.");
        return null;
     }else{
        return stackArray[top];
     }
    }
    public boolean isEmpty(){
         return (top == -1);   

    }

    public class stack{
        public static void main (String [] args){
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the size of stack: ");
            int size = sc.nextInt();
            sc.nextLine();

            boolean exit = false;

            Stack stack = new Stack(size);

            while(!exit){

                System.out.println("\nChoose an option ");
                System.out.println("1. Push a name ");
                System.out.println("2. Pop a name ");
                System.out.println("3. Peek at the top name ");
                System.out.println("4. Check the list of the stack");
                System.out.println("5. Check if the stack is empty ");
                System.out.println("6. Exit ");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();
                sc.nextLine();
                

                switch(choice){
                         
                    case 1:
                    System.out.println("Enter a name to push: ");
                    String name = sc.nextLine();
                    stack.push(name);
                    break;

                    case 2:
                    stack.pop();
                    break;

                    case 3:
                    System.out.println("Top name is: " + stack.peek());
                    break;

                    case 4:
                
                   stack.list();
                     break;
                    case 5:
                    System.out.println("Is the stack empty? " + stack.isEmpty());
                    break;

                    case 6:
                    exit = true;

                    System.out.println("Exiting.. " );
                    break;

                    default:
                    System.out.println("Invalid choice. ");



                }

            }
            sc.close();
        }
    }

}