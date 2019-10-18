import java.util.Scanner;
public class Movie {
    
    //Bijay Raj Raut
    //1001562222
    
    public static String[]enterMovies(int numOfMovies)
    {
        Scanner in=new Scanner(System.in);
        String[]movies=new String [numOfMovies];
        int i=0;
        while(i<movies.length)
        {
            System.out.printf("***Enter a movie that starts with m:");
            movies[i]=in.nextLine();
            if(!(movies[i].charAt(0)=='m'||movies[i].charAt(0)=='M'))
            {
                System.out.println("-This movie doesn't start with m.");
            }
            else
            {
                i++;
            }
        }
        return movies;   
    }
    public static void movieLength(String[]s,int n)
    {
        System.out.println("\nMovies titles with an even length less than 5:");
        for(int i=0;i<s.length;i++)
        {
            if(s[i].length()<=n)
            {
                System.out.println(s[i]);
            }
        }
    }
    //public static boolean
    public static void main(String[]args)
    {
        String []movienames=enterMovies(3);
        movieLength(movienames,5);
    }
    
}
