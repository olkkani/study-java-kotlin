import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        int nn = n;
        do {
            int t = nn % 100 / 10;
            int o = nn % 10;

            if (t + o >= 10){
                nn = (o*10) + ((t+o) % 10);
            }else {
                nn = (o*10)+(t+o);
            }

            count++;
        }while (nn != n);

        System.out.println(count);
    }
}