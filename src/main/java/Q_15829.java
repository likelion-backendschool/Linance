import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_15829 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int L = Integer.parseInt(br.readLine());
        String alphabet = br.readLine();
        long r = 1;
        long value = 0;

        for (int i = 0; i < L; i++) {
            value += (alphabet.charAt(i) - 96) * r;
            r = (r * 31) % 1234567891;
        }
        System.out.println(value % 1234567891);
        // long M = 123456789L
        // value % M 안됨?
        //long으로 나누면 범위넘어서는 듯. 따라서 숫자로 그냥 나눠주기  }
    }
}

