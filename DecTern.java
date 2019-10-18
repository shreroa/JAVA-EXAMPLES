import java.util.*;
public class DecTern {
//Bijay Raj Raut
//1001562222
    public static String getuserin(String message)
    {
        System.out.println(message);
        Scanner in=new Scanner(System.in);
        return in.nextLine();
    }
    public static String DecToTern(String s)
    {
        int num=Integer.parseInt(s);
        String ret="";
        while(num>0)
        {
            int dividened=num%3;
            String div=Integer.toString(dividened);
            ret=div+ret;
            num=num/3;
        }
        return ret;
    }
    public static int TernToDec(String s)
    {
        return Integer.parseInt(s,3);
    }
    public static void main(String[] args) 
    {
        boolean exit=true;
        while(exit)
        {
            String input=getuserin("Please enter a number following by d for \ndecimal and t for ternary or exit: ");
            if(input.equals("exit"))
            {
                System.out.println("BYE!!");
                exit=false;
            }
            else
            {
                String[]userin=input.split(" ");
                if(userin[1].equalsIgnoreCase("d"))
                {
                    String value=DecToTern(userin[0]);
                    System.out.println("Ternary value: "+value);
                }
                else if(userin[1].equalsIgnoreCase("t"))
                {
                    int value=TernToDec(userin[0]);
                    System.out.println("Decimal value: "+value);
                }
            }
        }
    }
    
}
