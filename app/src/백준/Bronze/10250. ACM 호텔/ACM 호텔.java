import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for(int i =0;i<t;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int h = Integer.parseInt(st.nextToken());
            st.nextToken();
            int n = Integer.parseInt(st.nextToken());

            int floor = 0;
            int number = 0;

            if (n % h == 0){
                floor = h * 100;
                number = n/h;
            }else {
                floor =  (n % h)* 100;
                number = (n / h)+1;
            }
            bw.write((floor+number) + "\n");
        }

        bw.flush();
        bw.close();
    }
}
