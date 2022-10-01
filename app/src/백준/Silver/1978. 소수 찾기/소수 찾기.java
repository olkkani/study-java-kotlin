import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int primeNumberCount = 0;

            int maxNum = 1000;
            boolean[] primeNumbers = new boolean[maxNum+1];
            primeNumbers[0] = primeNumbers[1] = true;

            for(int i=2; i*i<=maxNum; i++){
                if(!primeNumbers[i]){
                    for(int j=i*i; j<=maxNum; j+=i) primeNumbers[j]=true;
                }
            }


            int t = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < t; i++) {
                int number = Integer.parseInt(st.nextToken());

                if(!primeNumbers[number]) {
                    primeNumberCount++;
                }
            }
        bw.write(primeNumberCount + "\n");
        bw.flush();
        bw.close();
    }
}

