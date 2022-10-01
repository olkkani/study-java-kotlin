import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int hour;
    static int minuate;
    
    public static void plusOneHour(){
        hour ++;
        if (hour >= 24 ){ hour -= 24; }
    }
    public static void plusMinuate(int plusMinuate){
        minuate += plusMinuate;
        while (minuate >= 60){
            minuate -= 60;
            plusOneHour();
        }
    }

    // 시작 시작과 타이머를 입력받은 후 종료 시간을 출력
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer startTime = new StringTokenizer(br.readLine());
        int timer = Integer.parseInt(new StringTokenizer(br.readLine()).nextToken());

        hour = Integer.parseInt(startTime.nextToken());
        minuate = Integer.parseInt(startTime.nextToken());

        plusMinuate(timer);
        System.out.println(hour + " " + minuate);
    }
}