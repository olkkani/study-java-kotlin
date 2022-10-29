import java.io.*;
import java.util.StringTokenizer;

class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int value = Integer.parseInt(br.readLine());

        int answer = 0;
        for (int i = 0; i < n; i ++){
            int j = Integer.parseInt(st.nextToken());
            if (j == value ){
                answer++;
            }
        }

        System.out.println(answer);
    }

}