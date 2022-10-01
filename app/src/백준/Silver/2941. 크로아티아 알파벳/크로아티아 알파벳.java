import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] word = "c=,c-,dz=,d-,lj,nj,s=,z=".split(",");

        String s = br.readLine();

        for (int i = 0; i < word.length; i++) {
            s = s.replace(word[i], "!");
        }

        System.out.println(s.length());


    }
}
