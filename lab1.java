import java.util.Scanner;
class MyProg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int m = Math.min(num1, num2);
        int n = Math.min(m, num3);
        System.out.println(Math.min(n, num4));
    }
}
