package StudyBuddy;
/*  
 *The main class for the application.  
*/
import java.lang.Math;
import java.util.Scanner;

public class StudyBuddy {
    
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of problems available: ");
        int problemsAvailable = input.nextInt();

        System.out.print("Enter the number of problems you want to study: ");
        int numberOfProblems = input.nextInt();
        
        printProblems(problemsAvailable, numberOfProblems);

        input.close();
    }

    public static void printProblems(int problemsAvailable, int numberOfProblems) {
        //helper method to print the problems
        int[] problems = getProblems(problemsAvailable, numberOfProblems);

        for(int i = 0; i < problems.length; i++){
            System.out.println(problems[i]);
        }
    }

    public static int[] getProblems(int problemsAvailable, int numberOfProblems){
        //helper method that prints random problems to study based on user input
        int[] result = new int[numberOfProblems];

        for(int i = 0; i < numberOfProblems; i++){
            int num = getRandom(problemsAvailable);
            if(!linearSearch(result, num)){
                result[i] = num;
            }
        }

        return result;
    }

    public static int getRandom(int problemsAvailable) {
        //helper method to return a random number based on user input
        return (int)(Math.random() * problemsAvailable + 1);
    }

    public static boolean linearSearch(int[] list, int key){
        //linear search because we're working with a small array and I don't 
        //think it's worth sorting to use binary search
        boolean result = false;

		for(int i = 0; i < list.length; i++){
			if(list[i] == key){
				result = true;
			}
		}
		return result;
	}
}