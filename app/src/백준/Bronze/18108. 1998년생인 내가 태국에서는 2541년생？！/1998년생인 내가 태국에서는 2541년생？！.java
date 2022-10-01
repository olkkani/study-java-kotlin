
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int year;
        // 입력할 수 있는 불멸기원 범위를 제한
        do {
            year = scan.nextInt();
        }while (year < 1000 || year > 3000);
        
        System.out.println(convertBuddhistYearToAnnoDominiYear(year));
    }

    // 불멸기원을 서력기원으로 변환
    static int convertBuddhistYearToAnnoDominiYear (int buddhistYear){
        return buddhistYear - 543;
    }

}
