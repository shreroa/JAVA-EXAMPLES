import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
public class FilePractice {
    
    public static String[][]genFile()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter file name:");
        String fileName=in.nextLine();
        
        ArrayList<String>allLines=readFile(fileName);
        
        String [][]result=new String[allLines.size()][];
        
        int i=0;
        while(i<allLines.size())
        {
            result[i]=allLines.get(i).split(",");
            i++;
        }
        return result;          
    }
    public static ArrayList<String>readFile(String filename)
    {
        File temp=new File(filename);
        
        Scanner iFile = null;
        try
        {
            iFile=new Scanner(temp);
        }
        catch(Exception e)
        {
            System.out.printf("Failed to open file %s \n\n",filename);
            System.exit(0);
        }
        ArrayList<String>result=new ArrayList();
        int i=0;
        while(iFile.hasNextLine())
        {
            result.add(iFile.nextLine());
        }
        
        iFile.close();
        return result;
    }

    public static void main(String[] args) {
        
        String[][]g=genFile();
        System.out.println("\nSecond row:");
        for(int i=0;i<g[1].length;i++)
        {
            System.out.printf("%s ",g[2][i]);
        }
        System.out.println("\n\nDate: "+g[9][0]);
        
       
    }
    
}
