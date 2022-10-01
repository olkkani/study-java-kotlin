import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] room = new int[15][15];

        for (int i = 0; i < 15; i++) {
            room[i][1] = 1;
            room[0][i] = i;
        }
        for (int i = 1; i < 15; i++) {
            for (int j = 2; j < 15; j++) {
                room[i][j] = room[i][j-1] + room[i-1][j];
            }
        }

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int h = Integer.parseInt(br.readLine());
            int w = Integer.parseInt(br.readLine());
            bw.write(room[h][w] + "\n");
        }
        bw.flush();
        bw.close();
    }
}

