import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 0;
        int n = Integer.parseInt(br.readLine());

        for(int j = 1; j <= n; j++){
            if(j < 100){
                count++;
            }else {
                int between = 0;
                String[] x = String.valueOf(j).split("");
                for (int i = 0; i < x.length - 1; i++) {
                    int tempBetween = Integer.parseInt(x[i]) - Integer.parseInt(x[i + 1]);
                    if (tempBetween == between || i == 0) {
                        between = tempBetween;
                        if (i == x.length - 2) {
                            count++;
                        }
                    }
                }
            }
        }

        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
}