import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){

            StringTokenizer st = new StringTokenizer(br.readLine());
            double l = Integer.parseInt(st.nextToken());
            double[] score = new double[(int) l];

            for(int j = 0; j < l; j++){
                score[j] = Integer.parseInt(st.nextToken());
            }

            double avg = Arrays.stream(score).average().orElse(0);
            double avgStudent = Arrays.stream(score).filter(item -> item > avg).count();

            bw.write(String.format("%.3f", avgStudent / l * 100) + "%\n");
        }
        bw.flush();
        bw.close();
    }

}