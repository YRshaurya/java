import java.util.Scanner;

public class exp5 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int maxCount = 0;
        char maxChar = ' ';

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                maxChar = ch;
            }
        }

        System.out.println("Maximum occurring character: " + maxChar);
        System.out.println("It appears " + maxCount + " times.");

    }
}
}
