import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
public class SortStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }

        Arrays.sort(names);

        for (int i = 0; i < n; i++) {
            System.out.println(names[i]);
        }
    }
}
