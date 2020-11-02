import java.util.Scanner;
/**
 *This program gives a grade for a five question multiple choice test
 * @author Khazina Qureshi
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //Create the scanner for user input
    Scanner input = new Scanner(System.in);

    //Create the array for 5 test answers to be stored
    String[] tAnswers = new String[5];  

    //Ask the user to enter the answers to the test
    System.out.println("please enter the answers to the test:");

    //Initialize and ensure the user enters an answer that is greater than 0 
    for(int i = 0; i< tAnswers.length; i++){
      tAnswers[i] = input.nextLine();
    }

    //Create another array for 5 student test answers to be stored
    String[] sAnswers = new String[5];

    //Ask the user to enter the students answers
    System.out.println("Please enter the student answers:");

    //Initialize and ensure the user enters an answer that is greater than 0
   for(int i = 0; i< sAnswers.length; i++){
     sAnswers[i] = input.nextLine();
   }

    //Declare a variable for the students final score
    int score = 0;

    //Compare the two arrays and add one to score for each right answer
    for(int i=0; i< tAnswers.length; i++){
      if(tAnswers[i].equals(sAnswers[i])){
        score +=1;
      }
    }

    //Display the score to user
    System.out.println("Score:" + score);

  }
}
