import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    // int 값을 reverse List<int> 로 변환
    static List<Integer> reverseInt ( int number){
        List<Integer> reverseInt = new ArrayList<>();
        while (number > 0) {
            reverseInt.add(number % 10);
            number /= 10;
        }
        return reverseInt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 숫자 값 입력
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        // 중간 연산 과장 출력
        List<Integer> reverseB = reverseInt(b);
        for (Integer integer : reverseB) {
            System.out.println(a * integer);
        }
        // 최종 연산 과정을 출력
        System.out.println(a * b);
    }
}