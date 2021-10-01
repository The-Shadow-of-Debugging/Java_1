import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }

        public static void main (String[] arg)
    {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        boolean fl = true;
        while (fl) {
            int k = 0;
            for (int i = 0; i < str.length(); i++) {
                for (int j = i + 1; j < str.length(); j++) {
                    if (str.charAt(i) > str.charAt(j)) {
                        char temp = str.charAt(i);
                        str = str.substring(0, i) + str.charAt(j) + str.substring(i + 1);
                        str =  str.substring(0, j) + temp + str.substring(j + 1);
                    }
                }
            }
            for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i) == str.charAt(i + 1)) {
                    str = removeCharAt(str, i);
                    k++;
                    if (str.charAt(i) == 'z') {
                        str = str.substring(0, i) + 'a' + str.substring(i + 1);
                    }
                    else {
                        str = str.substring(0, i) + (Character.toString((char)(str.charAt(i) + 1))) + str.substring(i + 1);
                    }
                }
            }
            if ((k == 0) || (str.length() == 1)) {
                fl = false;
            }
            else
            {
                System.out.println(str);
                for (int i = 0; i < str.length(); i++) {
                    for (int j = i + 1; j < str.length(); j++) {
                        if (str.charAt(i) > str.charAt(j)) {
                            char temp = str.charAt(i);
                            str = str.substring(0, i) + str.charAt(j) + str.substring(i + 1);
                            str =  str.substring(0, j) + temp + str.substring(j + 1);
                        }
                    }
                }
            }
        }

        System.out.println(str.toString());
    }
}
