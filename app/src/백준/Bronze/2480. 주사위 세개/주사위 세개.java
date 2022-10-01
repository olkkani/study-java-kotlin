import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    // 시작 시작과 타이머를 입력받은 후 종료 시간을 출력
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 입력값을 변수로 할당
        int diceNumOne = Integer.parseInt(st.nextToken());
        int diceNumTwo = Integer.parseInt(st.nextToken());
        int diceNumThree = Integer.parseInt(st.nextToken());
        // 중복 개수에 따라 reward 결정
        int reward = 0;
        if (diceNumOne == diceNumTwo && diceNumTwo == diceNumThree){
            reward = 10000 + diceNumOne * 1000;
        } else if (diceNumOne == diceNumTwo || diceNumOne == diceNumThree){
            reward = diceNumOne * 100 + 1000;
        }else if (diceNumTwo == diceNumThree){
            reward = diceNumTwo * 100 + 1000;
        } else {
            reward = Math.max(Math.max(diceNumOne, diceNumTwo), diceNumThree) * 100;
        }
        // reward 값 출력
        System.out.println(reward);
    }
}

