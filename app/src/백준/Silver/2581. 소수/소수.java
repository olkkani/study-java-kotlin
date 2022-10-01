import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int minNum = Integer.parseInt(br.readLine());
        int maxNum = Integer.parseInt(br.readLine());

        boolean[] primeNumbers = new boolean[maxNum+1];
        List<Integer> primeNumbersArray = new ArrayList<>();

        primeNumbers[0] = primeNumbers[1] = true;

        for(int i=2; i*i<=maxNum; i++){
            if(!primeNumbers[i]){
                for(int j=i*i; j<=maxNum; j+=i) primeNumbers[j]=true;
            }
        }

        for (int i = minNum; i <= maxNum; i++) {
            if(!primeNumbers[i]) {
                primeNumbersArray.add(i);
            }
        }



        int sumPrime = primeNumbersArray.stream().mapToInt(x->x).sum();
        int minPrime = primeNumbersArray.stream().mapToInt(x->x).min().orElse(0);

        if(primeNumbersArray.isEmpty()){
            bw.write("-1" + "\n");
        }else {
            bw.write(sumPrime + "\n");
            bw.write(minPrime + "\n");
        }

        bw.flush();
        bw.close();
    }
}

