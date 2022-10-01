import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 1; i < n; i++) {
            result = i;
            int number = i;
            while (number > 0){
                result += number % 10;
                number /= 10;
            }

            if (result == n){
                bw.write(i + "\n");
                break;
            }
        }

        if(result != n){
            bw.write("0" + "\n");
        }
        bw.flush();
        bw.close();
    }
}

