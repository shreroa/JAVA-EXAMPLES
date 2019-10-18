import java.util.Scanner;
public class SubmitWordStart {

    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);
        
        System.out.printf("Enter a word: ");
        String word=in.next();
        
        String word1=word.toLowerCase();
        char a=word1.charAt(0);
        
        if(a>='a' && a<='z')
        {
            if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
            {
            System.out.println(word+" starts with a vowel.");  
            }
            else
            {
                System.out.println(word+" starts with a consonant.");
            } 
        }  
        else
        {
                System.out.println(word+" starts with neither a vowel nor a consonant.");
        }
    }
}