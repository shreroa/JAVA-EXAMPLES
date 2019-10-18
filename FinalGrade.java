import java.util.*;
public class FinalGrade {
//Bijay Raj Raut
//1001562222
public static int[]enterInput(String message,int size)
{
    Scanner in=new Scanner(System.in);
    System.out.println("Please enter "+message+" grades:");
    int[]inputs=new int[size];
    for(int i=0;i<inputs.length;i++)
    {
        System.out.println("Enter grade "+(i+1)+":");
        inputs[i]=in.nextInt();
    }
    return inputs;
}
public static double getAvg(int[]a)
{
    double avg=0;
    double sum=0;
    for(int i=0;i<a.length;i++)
    {
        sum+=a[i];
    }
    avg=sum/(a.length);
    return avg;
}
public static double getWeightedGrade(int percent,double avg)
{
    double pgrad=(percent*avg)/100;
    return pgrad;
    
}
public static void letterGrade(double g)
{
    System.out.printf("Total grade is:%.2f\n",g);
    if(g>=90&&g<100)
    {
        System.out.println("You made an A!");
    }
    if(g>=80&&g<90)
    {
        System.out.println("You made a B!");
    }
    if(g>=70&&g<80)
    {
        System.out.println("You made a C!");
    }
    if(g>=60&&g<70)
    {
        System.out.println("You made a D!");
    }
    if(g<60)
    {
        System.out.println("You made an F!!");
    }
        
}

public static void main(String[] args)
{
    Scanner in=new Scanner(System.in);
    System.out.println("***CSE 1310 grade calculator!***\n");
    //get input from the user
    int[]testgrades=enterInput("test",3);
    int[]hwgrades=enterInput("HW",8);
    int[]quizgrades=enterInput("quiz",5);
    
    System.out.println("Please enter final exam grade:\nEnter grade 1:");
    double finalgrade=in.nextDouble();
    
    double hwaverage=getAvg(hwgrades);
    double quizaverage=getAvg(quizgrades);
    
    //weighted grade for test
    double grade1=new Double(testgrades[0]);
    double grade2=new Double(testgrades[1]);
    double grade3=new Double(testgrades[2]);
    
    double test1=getWeightedGrade(10,grade1);
    double test2=getWeightedGrade(12,grade2);
    double test3=getWeightedGrade(13,grade3);
    
    double finalWg=getWeightedGrade(30,finalgrade);

    //Weighted grade 
    double hwWg=getWeightedGrade(15,hwaverage);
    double quizWg=getWeightedGrade(20,quizaverage);
    
    double finalScore=(test1+test2+test3+hwWg+quizWg+finalWg);
    

    letterGrade(finalScore);
    
}
}