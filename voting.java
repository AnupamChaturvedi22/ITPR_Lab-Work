
import java.util.Scanner;  // Importing the Scanner class for taking user input

public class voting{
    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner var = new Scanner(System.in);
        //Asking user to enter their age
        int age = var.nextInt();
        // Checking eligibility criteria of age
        if(age>=18){
            System.out.println("You are eligible to vote");
        }
        else{
            System.out.println("You are not eligible to vote");
        }
    }
}
