import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(String.valueOf(new StringBuilder(st.nextToken()).reverse()));
        int b = Integer.parseInt(String.valueOf(new StringBuilder(st.nextToken()).reverse()));

        int result = a < b ? b : a;

        System.out.println(result);
    }
}
