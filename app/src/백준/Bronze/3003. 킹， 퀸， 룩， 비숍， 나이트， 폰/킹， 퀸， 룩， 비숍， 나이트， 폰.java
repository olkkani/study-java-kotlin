import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        List<Integer> list = new ArrayList<>();

        for(int i = 0;i < 6; i++){
            list.add(Integer.parseInt(st.nextToken()));
        }

        int[] results = new int[6];

        for (int i = 0; i < 6; i++ ){
            int result = 0;

            switch (i){
                case 0:
                case 1:
                    result = 1 - list.get(i);
                    break;
                case 2 :
                case 3:
                case 4:
                    result = 2 - list.get(i);
                    break;
                default:
                    result = 8 - list.get(i);
                    break;
            };
            results[i] = result;
        }

        for(int i : results){
            System.out.print(i + " ");
        }

    }
}

