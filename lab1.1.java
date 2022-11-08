import java.util.Scanner;
class MyProg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if ((n == 12) || (n == 1) || (n == 2)) { System.out.println("Зима");
        } else if
        ((n == 4) || (n == 5) || (n == 3)) { System.out.println("Весна");
        } else if
        ((n == 6) || (n == 7) || (n == 8)) { System.out.println("Лето");
        } else if
        ((n == 9) || (n == 10) || (n == 11)) { System.out.println("Осень");
        } else if
        (( n <= 0) || (n >= 13)) { System.out.println("error");
        }
    }
}
