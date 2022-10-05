import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int maxDigit = 10001;

        boolean[] resultArray = new boolean[maxDigit];

        for(int i =1; i<maxDigit;i++){
            int n = d(i);

            if(n < maxDigit){
                resultArray[n] = true;
            }
        }

        for(int i =1; i <maxDigit; i++){
            if(!resultArray[i]) {
                bw.write(i + "\n");
            }
        }
        bw.flush();
        bw.close();
    }

    public static int d (int number){
            int result = number;
            while (number != 0){
                result += number%10;
                number /= 10;
            }
            return result;
    }

}