import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] n = br.readLine().toCharArray();
        int[] array = new int[26];
        Arrays.fill(array, -1);

        for (int i =0; i < n.length; i++){
            if(array[n[i] - 'a'] == -1){
                array[n[i] - 'a'] = i;
            }
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}

