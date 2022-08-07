import java.util.Scanner;

public class BJ_Q23853{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1 % 3 == num2 % 3) {
            System.out.print((num1/3) + " " + (num1%3) + " " + (num2/3));
        } else {
            System.out.println(-1);
        }
    }
}
