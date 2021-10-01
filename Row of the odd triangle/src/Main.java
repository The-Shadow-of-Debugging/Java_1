import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main (String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long []mas = new long[n];

        mas[0] = 1;
        long num = 0;
        for (int i = 1; i < n; i++)
        {
            num = num + i;
        }

        mas[0] = (num * 2) + 1;
        for (int i=1;i<n;i++)
        {
            mas[i] = mas[i-1] + 2;
        }
        System.out.println(Arrays.toString(mas));

    }
}
