import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    static String[][] arr;

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static void loop (int x, int y, int n, boolean isBlank) throws IOException {

        if(isBlank){
            for (int i = x; i < x+n; i++) {
                for (int j = y; j < y+n; j++) {
                    arr[i][j] = " ";
                }
            }
            return;
        }else if (n == 1){
            arr[x][y] = "*";
            return;
        }

        int size = n / 3;
        int count = 0;
        for (int i = x; i < x + n; i += size) {
            for (int j = y; j < y + n; j += size) {
                count++;
                if (count == 5) {
                    loop(i, j, size, true);
                } else {
                    loop(i, j, size, false);
                }
            }
        }

    }

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new String[n][n];

        loop(0,0, n, false);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                bw.write(arr[i][j]);
            }
            bw.write("\n");
        }
        
        bw.flush();
        bw.close();
    }
}

