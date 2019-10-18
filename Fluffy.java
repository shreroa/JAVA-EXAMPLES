import java.util.Scanner;
public class Fluffy {
    //Bijay Raj Raut
    //1001562222
    public static void main(String[] args) 
    {
     String s="The big fluffy dog likes kibbles and bits";
     
     // turning the String s into an array of words
     String[]splitS=s.split(" ");
     // checking the last word of array
     boolean check=splitS[splitS.length-1].equals("bits");
     //checking the length of splitS array
     int len=splitS.length;
     //print out variable len
     System.out.printf("Length: %d \n",len);
     //output the third word in the splitS array
     System.out.println(splitS[2]);
     //print out the array splitS
     for(int i=0;i<splitS.length;i++)
     {
         System.out.println(splitS[i]);
     }
     
    }
    
}
