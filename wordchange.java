
package homework2;

public class wordchange {
    
    
public static String[] change(String[] s)
{
    
    for(int i=0;i<s.length;i++)
    {
        if(s[i].equalsIgnoreCase("the"))
        {
            s[i]="any";
       
        }
        
    }
    return s;

}

public static void main(String[] args)
{
    String []word={"the","Cat","and","the","dog"};
    String []newword=change(word);
    for(int i=0;i<newword.length;i++)
    {
        System.out.print(newword[i]+" ");
    }
}
}
