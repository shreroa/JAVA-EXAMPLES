
package AvgMain;

import static AvgMain.filemethod.checkIf;
import static AvgMain.filemethod.gFile;
import static AvgMain.filemethod.getAvg;
import static AvgMain.filemethod.newarr;
import static AvgMain.filemethod.printToFile;
import java.util.ArrayList;
//Bijay Raj Raut
//1001562222

public class AvgMain {

    public static void main(String[] args) {
       
        String [][]input=gFile();
        
        String s1=checkIf(input,"Please Enter first column to find.");
        String s2=checkIf(input,"Please Enter Second Column to find");
        
        ArrayList<Double>avg=getAvg(input,s1,s2);
        System.out.println("\n**Avg of:"+s1+" and "+s2+":**\n");
        ArrayList<String>tofile=newarr(input,avg);
        printToFile(tofile);
        
    }
    
}
