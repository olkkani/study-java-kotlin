import java.io.*;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];

        int loop=0;
        while (loop < 2) {
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < m; j++) {
                    arr[i][j] += Integer.parseInt(st.nextToken());
                }
            }
            loop++;
        }

        for (int i = 0; i < n; i++) {
                bw.write(""+arr[i][0]);
            for (int j = 1; j < m; j++) {
                bw.write(" " + arr[i][j]);
            }
                bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

}