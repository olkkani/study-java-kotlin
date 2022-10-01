import java.util.Scanner;

public class Main {
    // 윤년인지 체크
    static boolean isLeapYear(int year){
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int year = scan.nextInt();

            if(isLeapYear(year)){
                System.out.println("1");
            }else {
                System.out.println("0");
            }
        }
}