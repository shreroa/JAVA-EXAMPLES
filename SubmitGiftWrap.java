import java.util.Scanner;
public class SubmitGiftWrap {

    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);
        int Swrap=1,Ewrap=2;
    
        System.out.println("***Hello! Please pick from the foloowing options.*** \n1) Buy standard wrapping paper-press 1\n2) Buy holiday edition wrapping paper-press 2");
        int n=in.nextInt();
    
        if(n==1)
        {
        System.out.println("You have selected standard wrapping paper.");
        
        System.out.printf("Please enter the size of your gift(in inches)\nLength: ");
        int l=in.nextInt();
        System.out.printf("Height: ");
        int h=in.nextInt();
        System.out.printf("Width: ");
        int w=in.nextInt();
    
        int A=2*((w*l)+(h*l)+(h*w));
        
        int Swrapprice=A*Swrap;
        System.out.println("You will pay $"+Swrapprice+" at the counter. Thank you for shopping with us!");
        
        }
        if(n==2)
        {
        System.out.println("You have selected holiday edition wrapping paper");
        System.out.printf("Please enter the size of your gift(in inches)\nLength: ");
        int l=in.nextInt();
        System.out.printf("Height: ");
        int h=in.nextInt();
        System.out.printf("Width: ");
        int w=in.nextInt();
    
        int A=2*((w*l)+(h*l)+(h*w));
        
        int Ewrapprice=A*Ewrap;
        System.out.println("You will pay $"+Ewrapprice+" at the counter. Thank you for shopping with us!");
        }
    
    
    }
    
}
