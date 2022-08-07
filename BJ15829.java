import java.util.Scanner;
/* 알파벳 소문자로 이뤄진 문자열이 주어질 때
										 a는 1b는 2c는 3... z는 26으로 숫자를 부여하고
											 r = 31, M = 1234567891으로 치환해서
													 각 소문자를 순서대로 공식처럼 곱해서 더해줍니다 */

public class BJ_Q15829 { // 백준 15829 해싱 자바
                            // 속도 : 210 ~ 2
    static int r = 31;
    static int M = 1234567891;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int strcount = sc.nextInt();
        String strAlphabet = sc.next();

        Long hashValue = 0L;
        int count = 0;
        for (char ch : strAlphabet.toCharArray()) { // 문자열을 char형 배열로 바꿔준다. 반환되는 배열의 길이는 문자열의 길이와 같다.
            hashValue = (hashValue +(ch - 'a' + 1) * foo(count)) % M;
            count++; /* 예를 들어 abc가 주어지면
											 (1 * 31^0 + 2 * 31^1 _ 3 * 31^2)% 1234567891
												= 2946입니다. */
        }

        System.out.print(hashValue);
    }

    private static long foo(int count) {
        long value = 1;
        while (count > 0) {
            value = (value * r) % M;
            count--;
        }
        return value;
    }
}