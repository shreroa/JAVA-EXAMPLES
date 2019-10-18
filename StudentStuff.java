
package studentstuff;

import static filestuff.FileHandle.printName;
import static filestuff.FileHandle.gFile;
import static filestuff.FileHandle.getUserinput;
import static filestuff.FileHandle.printAvg;
import static filestuff.FileHandle.printStudentInfo;
import java.util.Scanner;
//Bijay Raj Raut
//1001562222
public class StudentStuff {

    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);
        String[][]file=gFile();
        
        Integer input=getUserinput("Hello Professor,press\n1-To see student's info\n2-To see the name of the students who took the class\n3-To see the overall average grade of all students that took that class");
        switch (input) {
            case 1:
                System.out.println("Enter the student's name:");
                printStudentInfo(file,in.nextLine());
                break;
            case 2:
                System.out.println("Enter the name of the class:");
                printName(file,in.nextLine());
                break;
            case 3:
                System.out.println("Enter the name or the number of the class:");
                printAvg(file,in.nextLine());
                break;
            default:
                System.out.println("Invalid Entry,Bye!!");
                break;
        }
    }
    
}
