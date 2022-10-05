import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {


    public static void main(String[] args) throws IOException {

        List<Integer> hList = new ArrayList<>();
        List<Integer> list = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int result = 0;

        for(int i = 0; i < 9; i++){
            hList.add(Integer.parseInt(br.readLine()));
        }

        for (int i = 0; i < hList.size(); i++) {
            for(int j = 0; j < hList.size() - 1; j++){
                list = new ArrayList<>(hList);
                result = 0;

                list.remove(i);
                if(i == j){
                    j ++;
                }

                list.remove(j);
                for (int k : list ){
                    result += k;

                }
                if (result == 100){
                    break;
                }
            }

            if (result == 100){
                break;
            }
        }

        if (result == 100) {
            Collections.sort(list);
            for(long h : list){
                System.out.println(h);
            }
        }


    }
}

