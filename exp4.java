import java.util.Scanner;

public class exp4{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        System.out.print("Enter true or false for abc: ");
        boolean abc = sc.nextBoolean();

        boolean result;

        if (abc) {
            result = (c > b);
        } else {
            result = (b > a && c > b);
        }
        System.out.println("Result: " + result);
    }
}
}