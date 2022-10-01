import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int hour;
    static int minuate;
    // 한 시간 감소
    public static void minusOneHour(){
        hour --;
        if (hour < 0 ) { hour = 23; }
    }
    // 45분 감소
    public static void minusFortyFiveMinute(){
        minuate -= 45;
        if (minuate < 0) {
            minuate += 60;
            minusOneHour();
        }
    }
    // 시간과 분을 입력받아 45분을 감소하여 출력
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        hour = Integer.parseInt(st.nextToken());
        minuate = Integer.parseInt(st.nextToken());

        minusFortyFiveMinute();
        System.out.println(hour + " " + minuate);
    }
}