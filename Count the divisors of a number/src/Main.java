import java.util.Scanner;

public class Main {
    public static void main (String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int count = 0;
        int num = n;
        for (int i = 1; i <= n; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
