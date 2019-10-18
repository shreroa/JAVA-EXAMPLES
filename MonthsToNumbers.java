import java.util.Scanner;
public class MonthsToNumbers {

    public static void main(String[] args) {
    
        Scanner in=new Scanner(System.in);
        
        System.out.printf("Please enter a name of the month: ");
        String givenname=in.nextLine();
        
        String name=givenname.toLowerCase();
        String a=name.substring(0,1).toUpperCase();
        String b=name.substring(1);
        
        String n1=(a+b);
        
        if(name.equals("january"))
        {
            System.out.println(n1+" is the first month.");    
        }
        else if(name.equals("february"))
        {
            System.out.println(n1+" is the second month.");
        }
        else if(name.equals("march"))
        {
            System.out.print(n1+" is the third month.");
        }
        else if(name.equals("april"))
        {
            System.out.println(n1+" is the fourth month.");
        }
        else if(name.equals("may"))
        {
            System.out.println(n1+" is the fifth month.");
        }   
        else if(name.equals("june"))
        {
            System.out.println(n1+" is the sixth month.");
        }   
        else if(name.equals("july"))
        {
            System.out.println(n1+" is the seventh month.");
        }   
        else if(name.equals("august"))
        {
            System.out.println(n1+" is the eighth month.");
        }   
        else if(name.equals("september"))
        {
            System.out.println(n1+" is the ninth month.");
        }   
        else if(name.equals("october"))
        {
            System.out.println(n1+" is the tenth month.");
        }   
        else if(name.equals("november"))
        {
            System.out.println(n1+" is the eleventh month.");
        }    
        else if(name.equals("december"))
        {
            System.out.println(n1+" is the twelveth month.");
        }
        else
        {
            System.out.println("Unknown month: "+givenname);
        }
    }
    
}
