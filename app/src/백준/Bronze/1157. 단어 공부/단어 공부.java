import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] word = br.readLine().toLowerCase().toCharArray();
        int[] a = new int[26];


        for (char item : word){
            a[item - 'a']++;
        }

        int max = -1;
        String result = "";

        for(int i=0; i<a.length;i++){
            if(a[i]>max){
                max = a[i];
                result = String.valueOf((char) (i + 65));
            }else if(a[i] == max ) {
                result = "?";
            }
        }

        System.out.println(result);

    }
}

