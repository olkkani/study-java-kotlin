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
        int[] a = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i =0; i<n;i++){
            a[i] = Integer.parseInt(st.nextToken());
        }

        int min = Arrays.stream(a).min().getAsInt();
        int max = Arrays.stream(a).max().getAsInt();

        bw.write(min + " " + max + "\n");
        bw.flush();
        bw.close();
    }
}

