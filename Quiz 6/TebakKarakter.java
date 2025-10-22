import java.util.Scanner;

public class TebakKarakter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;

        for (int i = 0; i < input.length(); i += 3) {
            if (i + 2 >= input.length()) break;

            char a = input.charAt(i);
            char b = input.charAt(i + 1);
            char c = input.charAt(i + 2);

            if (a == '.' && b == '.' && c == '.') {
                break;
            }

            if (a != b && b == c) {
                p1++; 
            } else if (b != a && a == c) {
                p2++; 
            } else if (c != a && a == b) {
                p3++; 
            }
        }

        System.out.println(p1 + " " + p2 + " " + p3);
    }
}
