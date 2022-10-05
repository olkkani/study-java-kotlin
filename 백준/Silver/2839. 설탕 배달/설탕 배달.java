import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int k = Integer.parseInt(br.readLine());
        int n = 0;
        
            if (k > 0 && (k%5)%3 == 0){
                n = (k/5) + ((k%5)/3);
            }else{
                while (true){
                    if(k%5 == 0){
                        n += k /5;
                        break;
                    }else {
                        k -= 3;
                        n ++;
                    }

                    if (k < 0 ){
                        n = -1;
                        break;
                    }
                }
            }

        bw.write(n + "\n");
        bw.flush();
        bw.close();
    }
}