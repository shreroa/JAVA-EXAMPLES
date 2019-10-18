import java.util.Scanner;
public class SubmitNumberLength {

    public static void main(String[] args) {
    
        Scanner in=new Scanner(System.in);
        
        System.out.printf("Please enter a number between 4-6: ");
        int num=in.nextInt();
        
        if(num<4||num>6)
        {
            System.out.println("Number out of range!");
            return;
        }
        System.out.printf("Enter a word with at least "+num+" letters and less than 10 letters: ");
        String word=in.next();
        
        int n=word.length();
        if(n>10)
        {
            System.out.println("Too many letters!");
        }
        else if(n<num)
        {
            System.out.println("Too few letters!");
        }
        else
        {
            System.out.printf("Please enter another number between 1-3: ");
            int num2=in.nextInt();
            
            String abbv=word.substring(0,num2);
            
            if(num2<1||num2>3)
            {
                System.out.println(" ");
            }
            else
            {
                System.out.println(abbv);
            }
            
            
        }
    }
    
}
