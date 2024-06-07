import java.util.Random;
import java.util.Scanner;

public class Subtraction {

    public static void main(String[] args) {
       
        Random randomNo = new Random();
        
        int number1 = randomNo.nextInt(10);
        int number2 = randomNo.nextInt(10);
        
       
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
 
        System.out.println("What is " + number1 + " - " + number2 + "?");
        
        
        Scanner scanner = new Scanner(System.in);
        
     
        int studentAnswer = scanner.nextInt();
        
   
        int correctAnswer = number1 - number2;
        
     
        if (studentAnswer == correctAnswer) {
            System.out.println("Correct! Great job!");
        } else {
            System.out.println("Incorrect. The correct answer is " + correctAnswer + ".");
        }
        
      
        scanner.close();
    }
}
