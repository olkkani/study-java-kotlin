import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        // 더하기
        System.out.println(a+b);
        // 빼기
        System.out.println(a-b);
        // 곱하기
        System.out.println(a*b);
        // 나누기
        System.out.println(a/b);
        // 나머지
        System.out.println(a%b);
        
    }
}