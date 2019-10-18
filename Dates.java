import java.util.Scanner;
public class Dates {
    
    //Bijay Raj Raut
    //1001562222
    
    public static String userIn(String prompt)
    {
        Scanner in=new Scanner(System.in);
        System.out.println(prompt);
        String input=in.nextLine().toLowerCase();
        return input;
            
    }
    public static String buildNum(int num)
    {
        if(num%2==0)
        {
            return "0";
        }
        else
        {
            return "1";
        }
        
    }
    public static String DecToBinary(int userinput)
    {
        String binNum="";
        int dividend=userinput;
        while(dividend!=0)
        {
            binNum=buildNum(dividend)+binNum;
            dividend=dividend/2;
        }
        return binNum;
    }
    public static int valueToAdd(char c,int exp)
    {
        int digit=Character.getNumericValue(c);
        double power=(double)exp;
        double value=digit*Math.pow(2, power);
        return (int)value;
    }
    public static int BinaryToDec(int userInput)
    {
        String binNum=Integer.toString(userInput);
        int numOfDigits=binNum.length();
        int answer=0;
        for(int i=0;i<numOfDigits;i++)
        {
            char curNum=binNum.charAt((numOfDigits-1)-i);
            answer+=valueToAdd(curNum,i);
        }
        return answer;
        
    } 
    public static void main(String[] args)
    {
        boolean quit=true;
        while(quit)
        {
            String date=userIn("***Enter today's date, month followed by day:(b=binary d=decimal)");
        
            if(date.equals("quit"))
            {
                System.out.println("Bye :)");
                quit=false;
            }
            else
            {
                String []datearr=date.split(" ");
                if(datearr.length!=2)
                {
                    System.out.println("Wrong Format. Enter again.");
                }
                else
                {
                    String []info=datearr[0].split("\\W+");
                    int day=Integer.parseInt(info[0]);
                    int month=Integer.parseInt(info[1]);
                    if(datearr[1].equals("b"))
                    {
                        int decimalday=BinaryToDec(day);
                        int decimalmonth=BinaryToDec(month);
                        System.out.println("Date in decimal: "+decimalday+"/"+decimalmonth);
                    }
                    else if(datearr[1].equals("d"))
                    {
                        String binaryday=DecToBinary(day);
                        String binarymonth=DecToBinary(month);
                        System.out.println("Date in binary: "+binaryday+"/"+binarymonth);
                    }
                }
            }
            
        }
    }
}
