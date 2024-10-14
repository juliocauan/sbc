import java.util.Scanner;

public class L {

    public static void main(String... args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N, a, b, v[];
        N = sc.nextInt();
        v = new int[N];

        for (int i = 0; i < N; i++) {
            v[i] = sc.nextInt();
        }

        for (int i = 0; i < N - 1; i++) {
            for (int j = i+1; j < N; j++) {
                a = v[i] | v[j];
                b = v[i] & v[j];
                v[i] = a;
                v[j] = b;
            }
        }

        for (int i : v) {
            sb.append(i).append(" ");
        }
        sb.trimToSize();
        System.out.println(sb.toString());

        sc.close();
    }

}
