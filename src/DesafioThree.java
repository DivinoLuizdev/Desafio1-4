import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DesafioThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int num = arr[i];

            if (set.contains(num - k)) {
                count++;
            }
            if (set.contains(num + k)) {
                count++;
            }
            set.add(num);
        }

        System.out.println(count);

        sc.close();
    }
}
