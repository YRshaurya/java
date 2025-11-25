
import java.util.Scanner;
public class exp6{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int[] freq = new int[256];  
        for (char c : str.toCharArray()) {
            freq[c]++;
        }
        char maxChar = ' ';
        int max = -1;
        for (char c : str.toCharArray()) {
            if (freq[c] > max) {
                max = freq[c];
                maxChar = c;
            }
        }

        System.out.println("Maximum occurring character: " + maxChar + " occurs " + max + " times");
    }
}
}
