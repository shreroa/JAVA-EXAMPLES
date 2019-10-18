import java.util.*;
public class ChangeTense {

    public static void main(String[] args) {
        
        //Bijay Raj Raut
        //1001562222
        Scanner in=new Scanner(System.in);
        
        String []presentverb={"eat","dances","flies","speak","shakes","leaves"};
        String []pastverb={"ate","danced","flew","spoke","shook","left"};    
        
        Boolean q=true;
        
        while(q)
        {
        System.out.println("Please enter a sentence or q to quit: ");
        String input=in.nextLine();
        
        if(input.equals("q"))
        {
            q=false;
            System.out.println("BYE!");
        }
        
        else
            {
             input=input.substring(0,(input.length()-1));
             
             String []words=input.split(" ");
             String replace=null;
             
             if(words[2].equals("today"))
             {
                 for(int i=0; i<presentverb.length;i++)
                 {
                    if(presentverb[i].equals(words[1]))
                    {
                    replace=pastverb[i];
                    break;
                    }
                 }
             
                    if(replace==null)
                    {
                     System.out.println("Past tense is: "+words[0]+" "+words[1]+"ed yesterday.");
                    }
                    else
                    {
                     System.out.println("Past tense is: "+words[0]+" "+replace+" yesterday.");
                    }
             }
             else
             {
                 if(words[2].equals("yesterday"))
                 {
                     for(int i=0;i<pastverb.length;i++)
                    {
                     if(words[1].equals(pastverb[i]))
                     {
                         replace=presentverb[i];
                         break;
                     }
                    }
                 }
                 if(replace==null)
                 {
                     System.out.println("Present tense is: "+words[0]+" "+words[1].substring(0,(words[1].length()-2 ))+" today.");
                 }
                 else
                 {
                     System.out.println("Present tense is: "+words[0]+" "+replace+" today.");
                 }
             }
            }
        }
    }
    
}
