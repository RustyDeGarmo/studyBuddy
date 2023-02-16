package StudyOn;
/*  
 *The main class for the application.  
*/
import java.lang.Math;
import java.util.Scanner;

public class StudyOn {
    
    public static void main(String [] args){

        String userIn = "Enter the number of problems available: ";
        Scanner input = new Scanner(System.in);
        System.out.print(userIn);
        int numberOfProblems = input.nextInt();
        
        for(int i = 0; i < 4; i++){
            System.out.println(getRandom(numberOfProblems));
        }

        input.close();
    }

    public static int getRandom(int numberOfProblems) {
        return (int)(Math.random() * numberOfProblems + 1);
    }
}