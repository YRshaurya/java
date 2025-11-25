import java.util.Scanner;

public class exp3{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            if(number %2 == 0){
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
}
}