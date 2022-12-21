
import java.io.*;

class Main {

    static int countA = 0;
    static int dpCnt = 0;

    static int[] memo;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        memo = new int[n];

        fib(n);
        fibonacci(n);

        System.out.println(countA + " " + dpCnt);
    }


    static int fib (int n) {
        if (n == 1 || n == 2){
            countA++;
            return 1;
        } else {
            return (fib(n-1) + fib(n - 2));
        }
    }

     static int fibonacci(int n) {
        memo[0] = 1;
        memo[1] = 1;

        for (int i = 2; i < n; i++) {
            dpCnt++;
            memo[i] = memo[i-2] + memo[i-1];
        }
        return memo[n-1];
    }

}
