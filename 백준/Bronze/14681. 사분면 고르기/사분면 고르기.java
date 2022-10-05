import java.util.Scanner;

public class Main {
    static int quadrant (int x, int y){
        int quadrant;
        if (x > 0 && y > 0){
            quadrant = 1;
        } else if (x > 0 && y < 0 ) {
            quadrant = 4;
        } else if (x < 0 && y > 0) {
            quadrant = 2;
        } else {
            quadrant = 3;
        }
        return quadrant;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();

        System.out.println(quadrant(x, y));
    }
}