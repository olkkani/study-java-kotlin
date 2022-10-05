import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = 9;
        int[] a = new int[n];

        for(int i =0; i<n;i++){
            a[i] = Integer.parseInt(br.readLine());
        }

        int max = Arrays.stream(a).max().getAsInt();

        int index =  IntStream.range(0, a.length)
            .filter(i -> max == a[i])
            .findFirst()
            .orElse(-1);


        bw.write( max + "\n");
        bw.write((index + 1) + "\n");
        bw.flush();
        bw.close();
    }
}

