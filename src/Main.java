import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number;
        System.out.println("Enter the number : " );
        number = scanner.nextInt();
        scanner.close();
        long fact = 1;
        for(int i = 1; i <= number; i++){
            fact = fact * i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}
