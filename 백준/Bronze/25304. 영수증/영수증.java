import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int result = 0;

        for(int i = 0; i < n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int value = Integer.parseInt(st.nextToken());
            int count = Integer.parseInt(st.nextToken());

            result += (value * count);
        }

        if(x == result){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}

