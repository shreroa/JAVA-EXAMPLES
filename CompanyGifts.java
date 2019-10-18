import java.util.*;
public class CompanyGifts {

    public static void main(String[] args) {
        
        //Bijay Raj Raut
        //1001562222
        Scanner in=new Scanner(System.in);
        String []customers=new String[7];
        int counter=0;
        boolean exit=true;
        
        while(exit)
        {
        System.out.println("***\nEnter the word \"customer\" if you are a customer\nor your ID if you are the manager.");
        String username=in.nextLine();
            if(username.equals("customer"))
            {
                if(counter>=customers.length)
                {
                System.out.println("Sorry, no more customers.");
                }
                else
                {
                System.out.println("***\nHello customer, Please enter your name(first and last)\nfollowed by yout birthday(MM/DD/YY)");
                customers[counter]=in.nextLine();
                
                 String []info=customers[counter].split(" ");
                System.out.println("Thank you "+info[0]+".");
                
                }
                counter++;
            }
            if(username.equals("ABC 132"))
            {
                Boolean check=true;
                while(check)
                {
                System.out.println("***\nHello manager. What would you like to do?\nPrint to screen or exit?");
                String managerin=in.nextLine();
                if(managerin.equalsIgnoreCase("print to screen"))
                {
                     if(customers[0]==null)
                     {
                        System.out.println(" Sorry,no customers have entered any information yet.");
                     } 
                    
                     else
                     {
                         System.out.println("\nCUSTOMERS\n");
                         for(int i=0;i<customers.length;i++)
                         {
                             if (customers[i]!= null)
                             {
                                 String []info=customers[i].split(" ");
                                 System.out.println("BIRTHDAY:" +info[2]+"  NAME: "+info[1]+","+info[0]);
                                 
                             }
                             
                         }
                     }

                }
                    
                else if(managerin.equals("exit"))
                {
                    check=false;
                }
                }
            }
            
            else if(username.equals("exit"))
            {
                exit=false;
                System.out.println("Bye!");
            }
            
        }
        
    }
    
}
