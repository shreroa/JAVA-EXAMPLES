import java.util.ArrayList;
import java.util.Scanner;

public class ArrFix {
    //Bijay Raj Raut
    //1001562222
    public static Integer getUserInput()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number or -1 to quit.");
        boolean done=true;
        int n=0;
        while(done)
        {
            try
            {
                n=in.nextInt();
                done=false;
            }
            catch(Exception e)
            {
                System.out.println("This is not a number. Please enter a number.");
                in.nextLine();
            }
        }
        return n;
    }
    public static void printOutList(ArrayList<Integer> a)
    {
        System.out.println("Currently in the list:");
        for(int i=0;i<a.size();i++)
        {
            System.out.printf("%d ",a.get(i));
        }
        System.out.println("\n");
    }
    
    public static void main(String[] args) 
    {
        //ArrayList<Integer>numbers=new ArrayList<Integer>();
        ArrayList numbers=new ArrayList();
        int n;
        do
        {
            n=getUserInput();
            
            if(n==-1)
            {
                System.out.println("Bye!");
                return;
            }
            else if(numbers.contains(n))
            {
                System.out.println("Already have this number.");
            }
            else
            {
                numbers.add(n);
            }
            printOutList(numbers);
        }
        while(n!=-1);    
    }
    
}
