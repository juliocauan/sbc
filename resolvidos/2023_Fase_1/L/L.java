import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String... args) throws IOException{
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        int K = Integer.parseInt(sc.nextLine()), strLength = sb.length();
        boolean isMinimal;
        while (true) {
            isMinimal = true;
            for(int i = 0; i + K < strLength; i++) {
                char ch1 = sb.charAt(i), ch2 = sb.charAt(i+K);
                if(ch1 > ch2) {
                    sb.setCharAt(i, ch2);
                    sb.setCharAt(i+K, ch1);
                    isMinimal = false;
                }
            }
            if(isMinimal) break;
        }
        System.out.println(sb.toString());
        sc.close();
    }
}
