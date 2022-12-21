
import java.io.*;
import java.util.Arrays;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = 5;
        int avg = 0;
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(br.readLine());
            numbers[i] = number;
            avg += number;
        }
        avg /= n;
        Arrays.sort(numbers);
        
        bw.write(avg + "\n");
        bw.write(numbers[2]+"");
        bw.flush();
        bw.close();
    }

}
