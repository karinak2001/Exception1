import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a whole number to divide: ");
            int num1 = scanner.nextInt();

            System.out.println("Enter a whole number to divide by: ");
            int num2 = scanner.nextInt();
            int sum = num1 / num2;
            System.out.println("The result is: " + sum);

        } catch(ArithmeticException e) {
            System.out.println("You cant divide by 0!");

        } catch (InputMismatchException e){
            System.out.println("Please enter numbers only!");

        } catch (Exception e){
            System.out.println("Something went wrong, try again.");
        }


        }

    }
