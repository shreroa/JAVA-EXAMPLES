import java.util.*;
public class EvenOdd {
    //Bijay Raj Raut
    //1001562222
    
    public static int getUserInput(String message)
    {
        Scanner in=new Scanner(System.in);
        
        System.out.println(message);
        int n=in.nextInt();
        return n;
    }
    public static boolean checkIfEven(int n)
    {
        if(n%2==0)
        {
            return true;
        }
        return false;
    }
    public static boolean checkIfOdd(int n)
    {
        return n%2!=0;
    }
    
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        int userin=getUserInput("--Enter an even number:");
        while(!checkIfEven(userin))
        {
            System.out.println("This is not even. Enter an even number:");
            userin=in.nextInt();
               
        }
        System.out.printf("--Ok thanks!");
        userin=getUserInput("Now enter an odd number:");
        while(!checkIfOdd(userin))
        {
            System.out.printf("This in not odd.");
            userin=getUserInput("Enter an odd number");
        }
        System.out.println("**Thanks!Bye!**");
        
    }
    
}
