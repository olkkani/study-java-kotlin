import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int loopCount = Integer.parseInt(st.nextToken());
            String[] loopText = st.nextToken().split("");

            for(String item: loopText){
                for(int j=0;j<loopCount;j++){
                    bw.write(item);
                }
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }
}

