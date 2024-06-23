import java.util.Scanner;

public class baekjoon_2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] su = new int[n];

        System.out.println(n);

        for (int i = 0; i < n; i++){
            su[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++){
            for (int j = i + 1; j < n; j++) {
                if (su[i] > su[j]) {
                    int temp = su[i];
                    su[i] = su[j];
                    su[j] = temp;
                }
            }
        }

        for (int k : su){
            System.out.println(k);
        }
    }
}

