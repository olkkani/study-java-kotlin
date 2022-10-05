import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        List<int[]> p = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int[] people = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
            p.add(people);
        }

        for (int i = 0; i < n; i++) {

            int count = 0;
            for (int j = 0; j < n; j++) {
                if(i != j){
                    if (p.get(i)[0] < p.get(j)[0] && p.get(i)[1] < p.get(j)[1]) count++;
                }
            }
            bw.write(++count + " ");
        }

        bw.flush();
        bw.close();
    }
}

