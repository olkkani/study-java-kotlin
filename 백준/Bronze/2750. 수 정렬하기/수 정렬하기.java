
import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 1; i < n; i++) {
            int number = numbers[i];
            int j = i -1 ;

            while (j >=0 && number < numbers[j]){
                numbers[j+1] = numbers[j];
                j--;
            }
            numbers[j+1] = number;
        }

        for (int number : numbers) {
            bw.write(number + "\n");
        }

        bw.flush();
        bw.close();
    }

}
