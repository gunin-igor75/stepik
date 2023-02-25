import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Divide {

    int divide(long n) {
        List<Long> list = new ArrayList<>();
        long d = 2;
        while (d * d <= n) {
            if (n % d == 0) {
                list.add(d);
                n /= d;
            } else {
                d += 1;
            }
        }
        if (n > 1) {
            list.add(n);
        }
        if (n < 4 & n > 0) {
            return 1;
        }
        return list.size();
    }

    int divideNew(Long n) {
        Set<Long> set = new HashSet<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                set.add(n / i + i);
            }
        }
        if (n < 4 & n > 0) {
            return 1;
        }
        return set.size();
    }


    public static void main(String[] args) {
        Divide divide = new Divide();
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            long n = Long.parseLong(in.readLine());
            System.out.println(divide.divideNew(n));
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
