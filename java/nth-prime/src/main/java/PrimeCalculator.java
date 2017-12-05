import java.util.ArrayList;
import java.util.List;

public class PrimeCalculator {
List<Integer> list = new ArrayList<>();
int num = 1;

public PrimeCalculator() {}


    List<Integer> getPrimeList(int n) {
    boolean fl;
        for (int i = 0; i < n;) {
            num++;
            fl = true;
            for (int listNum : list) {
                if (!fl)
                    break;
                if (num % listNum == 0)
                    fl = false;
            }
            if (fl) {
                list.add(num);
                i++;
            }
        }

        System.out.println(list);
        return list;
    }


    int nth(int n) {
    if (n < 1)
        throw new IllegalArgumentException();
        return getPrimeList(n).get(n-1);
    }
}