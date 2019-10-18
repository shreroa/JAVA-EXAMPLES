package homework2;


import java.util.*;

public class homework2 {
    
    public static int[][] transpose(int[][] mytable)
    {
        int m=mytable.length; //number of rows
        int n=mytable[0].length; //number of columns
        
        int[][]trans=new int[n][m];
        for(int i=0;i<mytable.length;i++)
        {
            for(int j=0;j<mytable[i].length;j++)
            {
                trans[i][j]=mytable[j][i];
            }
        }
        return trans;
    }
    public static void printmatrix(int [][]table)
    {
        for(int i=0;i<table.length;i++)
        {
            for(int j=0;j<table[i].length;j++)
            {
                System.out.print(table[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args)  {
        
        int [][]mytable={{1,2,3},{5,6,4},{7,8,9}};
        int [][]transpose=transpose(mytable);
        printmatrix(transpose);
        
        
    
    
  }
    
}
