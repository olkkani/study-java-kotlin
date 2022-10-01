import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String title = "";

            int count = 1;
            int tempTitle = 666;

            while (count != n){
                tempTitle++;
                if (String.valueOf(tempTitle).contains("666")){
                    count++;
                }
            }
            title = String.valueOf(tempTitle);


        bw.write(title + "");
        bw.flush();
        bw.close();
    }
}

