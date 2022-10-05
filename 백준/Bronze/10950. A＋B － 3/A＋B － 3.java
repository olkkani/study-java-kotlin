import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int tc = Integer.parseInt(br.readLine());
        List<Integer> results = new ArrayList<>();

        for(int i = 0; i < tc; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            results.add(a + b);
        }

        for(int item: results){
            System.out.println(item);
        }
    }
}

