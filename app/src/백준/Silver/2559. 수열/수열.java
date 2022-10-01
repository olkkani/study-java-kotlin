import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N,K;
    static int temp[];
    static int result = Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        temp = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++)
            temp[i] = Integer.parseInt(st.nextToken());

        for(int i=0;i<(N-K)+1;i++) {
            int sum = 0;
            for(int j=i;j<i+K;j++)
                sum += temp[j];
            if(sum>result) result = sum;
        }
        System.out.println(result);
    }

}