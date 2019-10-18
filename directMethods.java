import java.util.*;
public class directMethods {
//Bijay Raj Raut
//1001562222
    public static String time(int num)
    {
        String con="";
        if(num>86400)
        {
            con="-1";
        }
        else
        {
            int hr=num/3600;
            String hrs=Integer.toString(hr);
            int min=(num%3600)/60;
            String mins=Integer.toString(min);
            int sec=((num%3600)%60);
            String secs=Integer.toString(sec);
            con=hrs+":"+mins+":"+secs;
        }
        return con;
    }
    
    public static boolean prime(int n)
    {
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static ArrayList <Integer> allFactors(int n)
    {
        ArrayList<Integer> factors=new ArrayList<Integer>(); 
        for(int i=1;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                if(n/i==i)
                {
                    factors.add(i);
                }
                else
                {
                    factors.add(i);
                    factors.add(n/i);
                }
                Collections.sort(factors);
            }

        }
        return factors;
    }
    public static void main(String[] args) 
    {
        System.out.println(time(18000));
        System.out.println(prime(13));
        System.out.println(allFactors(100));
    }
    
}
