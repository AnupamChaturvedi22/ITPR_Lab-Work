import java.util.*; // Importing the Scanner class for taking user input
public class Array1 {
    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in); 
        int[] arr = new int[20];  // Declaring an integer array of size 20
        System.out.print("Enter the elements of the array: "); // Asking user to input 20 numbers
        // Loop to read 20 elements from the user and store them in the array
        for (int i = 0; i < 20; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Even Numbers in the array are: ");   // DIsplay messege for even numbers
       // loop for check the elements
        for (int i = 0; i < 20; i++) {
             // Check if the element is even
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }

    }
    
}
