
import java.util.Scanner;


public class GuessingGame {
    
    //Bijay Raj Raut
    //1001562222
    public static Integer getUserInput(String message)
    {
        Scanner in=new Scanner(System.in);
        System.out.println(message);
        return in.nextInt();
    }
    public static Integer numGenerate(int num)
    {
        return num-1;
    }
    public static boolean compareGuess(int n1,int n2)
    {
        boolean ret=true;
        if(n1==n2)
        {
            ret=false;
        }
        return ret;
    }
    public static void finalMessage(boolean b,int n)
    {
        if(b!=true)
        {
            System.out.println("Yes,the number is "+n+"! You win!");
        }
        else
        {
            System.out.println("No,the number is "+n+"! You lost!!");
        }
    }
    
    public static void main(String[] args) 
    {
        System.out.println("Welcome to the guessing game!");
        System.out.println("You have 3 guesses!");
        int n=getUserInput("Enter the largest number possible to guess(remember,if you want 5 \nto be the largest enter one larger-6)");
        
        int numToGuess=numGenerate(n);
        int i=0;
        
        boolean choice=true;
        while(i<3&&choice)
        {
            int userNumber=getUserInput("Enter your guess:");
            choice=compareGuess(userNumber,numToGuess);
            i++;
        }
        finalMessage(choice,numToGuess);
        
    }   
}
