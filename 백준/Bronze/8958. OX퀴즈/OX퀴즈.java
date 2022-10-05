import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            int point = 0;
            int count = 1;
            String[] p = br.readLine().split("");

            for(String item : p){
                if("O".equals(item)){
                    point += count;
                    count++;
                }else {
                    count = 1;
                }
            }
            bw.write(point + "\n");
        }


        bw.flush();
        bw.close();
    }

}