
package homework2;

import java.util.ArrayList;

public class wordcount {
    
    public static int n(ArrayList<ArrayList>g,String color)
    {
        int counter=0;
        for(int i=0;i<g.size();i++)
        {
            ArrayList<String>a=g.get(i);
            for(int j=0;j<a.size();j++)
            {
                String s=a.get(j);
                if(s.equalsIgnoreCase(color))
                {
                    counter++;
                }
            }
        }
        return counter;
    }
    
    public static void main(String[]args)
    {
        ArrayList<ArrayList>arr=new ArrayList();
        ArrayList<String>s1=new ArrayList();
        s1.add("Peppa");
        s1.add("Pig");
        s1.add("Pink");
        ArrayList<String>s2=new ArrayList();
        s2.add("Danny");
        s2.add("Pig");
        s2.add("Pink");
        arr.add(s1);
        arr.add(s2);
        
        int count=n(arr,"Pink");
        System.out.print(count);

    }
}
