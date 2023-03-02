/**
 * @Author Willard
 * 3/1/2023
 */
import java.util.Scanner;

public class Lab06 {
    private int n;  // Declare an instance variable n of type int
    private int m;  // Declare an instance variable m of type int

    public Lab06(int n, int m){
        this.n = n;  // Assign the value of n to the instance variable n
        this.m = m;  // Assign the value of m to the instance variable m
    }

    public boolean isDivisible() {
        return n % m == 0;  // Check if n is evenly divisible by m
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");  // Prompt the user to enter the value of n
        int n = scanner.nextInt();

        System.out.print("Enter the value of m: ");  // Prompt the user to enter the value of m
        int m = scanner.nextInt();  // Read the user input and store it in a local variable m
        Lab06 lab = new Lab06(n, m);
        boolean isDivisible = lab.isDivisible();  // Call the isDivisible method

        if (isDivisible) {  // Check if the value returned by isDivisible is true
            System.out.println(n + " is evenly divisible by " + m);  // Print a message indicating that n is evenly divisible by m
        } else {
            System.out.println(n + " is not evenly divisible by " + m);  // Print a message indicating that n is not evenly divisible by m
        }
        scanner.close();
    }
}