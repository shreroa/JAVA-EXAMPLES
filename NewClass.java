
package homework2;

public class NewClass {
    
    public static void results(int[][]data)
    {
        System.out.println("More of candy "+checkrow(data)+".");
        System.out.println("More candy in jar "+checkcol(data)+".");
        
    }
    public static int checkrow(int[][]g)
    {
        int []sum=new int[g.length];
        for(int i=0;i<g.length;i++)
        {
            int n=0;
            for(int j=0;j<g[i].length;j++)
            {
                n=n+g[i][j];
            }
            sum[i]=n;
        }
        int maxIndex=0;
        for(int i=0;i<sum.length;i++)
        {
            if(sum[i]>sum[maxIndex])
            {
                maxIndex=i;
            }
        }
        return maxIndex;
    }
    public static int checkcol(int[][]g)
    {
        int []sum=new int[g.length];
        for(int i=0;i<g.length;i++)
        {
            int n=0;
            for(int j=0;j<g.length;j++)
            {
                n=n+g[j][i];
            }
            sum[i]=n;
        }
        int maxIndex=0;
        for(int i=0;i<sum.length;i++)
        {
            if(sum[i]>sum[maxIndex])
            {
                maxIndex=i;
            }
        }
        return maxIndex;
    }
    public static void main(String[]args)
    {
        int [][]candy={{1,3,2,0,0},{0,0,5,1,2},{0,0,2,1,1},{2,2,2,2,2}};
        results(candy);
    }
    
}
