
package filestuff;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
//Bijay Raj Raut
//1001562222
public class FileHandle {
    public static Integer getUserinput(String message)
    {
        Scanner in=new Scanner(System.in);
        System.out.println(message);
        int n=0;
        boolean check=true;
        while(check)
        {
            try
            {
                n=in.nextInt();
                check=false;
            }
            catch(Exception e)
            {
                System.out.println("Invalid Entry,Please Enter a number:");
                in.nextLine();
            }
        }
        return n;
    }
    
    public static String [][] gFile()
    {
        Scanner in=new Scanner(System.in);
        ArrayList<String>lines=null;
        while(lines==null)
        {
            System.out.println("Enter a file name:");
            lines=readFile(in.nextLine());
        }
        String[][]result=new String[lines.size()][];
        for (int i=0;i<lines.size();i++) 
        {
            String line=lines.get(i);
            result[i]=line.split(",");
        }
        return result;
        
    }
    public static ArrayList<String>readFile(String fileName)
    {
        File temp=new File(fileName);
        Scanner inputFile;
        try
        {
            inputFile=new Scanner(temp);
        }
        catch(Exception e)
        {
            System.out.printf("Failed to oped file %s\n\n",fileName);
            return null;
        }
        ArrayList<String>result=new ArrayList();
        while(inputFile.hasNextLine())
        {
            result.add(inputFile.nextLine());
        }
        inputFile.close();
        return result;
    }
    /*public static String [][] gFile(String s)
    {
        Scanner in=new Scanner(System.in);
        ArrayList<String>lines;
        System.out.println("File read in: "+s);
        lines=readFile(s);
        
        String[][]result=new String[lines.size()][];
        for (int i=0;i<lines.size();i++) 
        {
            result[i]=lines.get(i).split(",");
        }
        return result;
    }*/
    public static void printStudentInfo(String [][]g,String s)
    {
        boolean check=false;
        
        for(int i=0;i<g.length;i++)
        {
            if(g[i][0].equals(s))
            {
                    System.out.println(s+" is in "+g[i][1].trim()+","+g[i][2].trim()+" with grade:"+g[i][3]+".");
                    check=true;
            }
        }
        if(check==false)
        {
            System.out.println("No Student name "+s+" found.");
        } 
    }
    public static void printName(String[][]g,String s)
    {
        boolean check=false;
        for(int i=0;i<g.length;i++)
        {
        if(g[i][2].trim().equals(s))
            {
                System.out.println(g[i][0]);
                check=true;
            }
        }
        if(check==false)
        {
           System.out.println("\nNo class "+s+" found.");
        }
        }
    public static void printAvg(String [][]g,String s)
    {
        boolean check=false;
        ArrayList <Integer> counter =new ArrayList();
        for(int i=0;i<g.length;i++)
        {
            if(g[i][1].trim().equals(s)||g[i][2].trim().equals(s))
            {
                String c=g[i][3].trim();
                int num=Integer.parseInt(c);
                counter.add(num);
                check=true; 
            }
        }
            
            if(check==false)
            {
                System.out.println("No Class Name or Class Number found");
            }
            else
            {
                double n=0;
                for(int j=0;j<counter.size();j++)
                {
                    n+=counter.get(j);
                }
                double n2=n/counter.size();
                System.out.println("The Average Grade is: "+n2);
            }
    }
}
    

