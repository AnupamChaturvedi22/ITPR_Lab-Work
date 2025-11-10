import java.util.*; // Importing the Scanner class for taking user input

public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating a Scanner object to read input from the user
        int[] arr = new int[10];
        System.out.print("Enter the elements of the array: ");  // Askig user to enter the number(elements)
        // loop to check the elements
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();     // input the elemnts in aaray
        }
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += arr[i];
        }
        double average = sum / 10.0;
        System.out.println("Average: " + average);

    }
}
