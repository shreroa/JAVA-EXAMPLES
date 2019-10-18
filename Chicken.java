import java.util.Scanner;
public class Chicken {
    //Bijay Raj Raut
    //1001562222
    
    public static String[]getInput(String message)
    {
        int i=0;
        String[]words=new String[3];
        Scanner in=new Scanner(System.in);
        System.out.println(message);
        while(i<words.length)
        {
        System.out.printf("Day"+(i+1)+":");
        words[i]=in.nextLine();
        i++;
        }
        return words;
    }
    public static int totalEggs(String[]s)
    {
        int i=0;
        int sum=0;
        String []Egg=s[i].split("-");
        int numEgg=Integer.parseInt(Egg[1]);
        sum+=numEgg;
        return sum;
    }

    public static void main(String[] args) 
    {
        String[]farmerOne=getInput("-Info for first farmer:");
        String[]farmerTwo=getInput("-Info for second farmer:");
        
        int numOne=totalEggs(farmerOne);
        int numTwo=totalEggs(farmerTwo);
        
        if(numOne<numTwo)
        {
            System.out.println("Farmer 2 has more eggs.");
        }
        else if(numTwo<numOne)
        {
            System.out.println("Farmer 1 has more eggs.");
        }
        else
        {
            System.out.println("They have the same number of eggs.");
        }
    }
    
}
