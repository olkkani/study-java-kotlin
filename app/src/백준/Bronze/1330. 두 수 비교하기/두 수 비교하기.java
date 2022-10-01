import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    // 한 줄에 띄어쓰기로 구분된 정수 값을 받는다.
    static List<Integer> inputVariablesOneLine() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        List<Integer> inputVariables = new ArrayList<>();
            try {
                st= new StringTokenizer(br.readLine());
            } catch (IOException e){
                st = new StringTokenizer("");
            }
            while (st.hasMoreTokens()){
                inputVariables.add(Integer.parseInt(st.nextToken()));
            }
        return inputVariables;
    }

    // 두 값을 비교하여 더 큰 숫자를 기호로 반환
    static String comparisonAWithB(int a, int b) {
        return (a > b ? ">" : a < b ? "<" : "==");
    }

    public static void main(String[] args) {
        List<Integer> inputTwoVariables;
        do {
            inputTwoVariables = inputVariablesOneLine();
        } while (inputTwoVariables.size() != 2);
        System.out.println(comparisonAWithB(inputTwoVariables.get(0), inputTwoVariables.get(1)));
    }
}