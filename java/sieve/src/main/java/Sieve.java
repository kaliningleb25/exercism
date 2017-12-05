import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Sieve {
    int limit;
    Sieve(int maxPrime) {
        limit = maxPrime;
    }

    List<Integer> getList() {
        List<Integer> list = new ArrayList<>();

        // Adding all elements from 2 to limit
        for (int i = 2; i <= limit; i++)
            if (i+1 % 2 != 0)
                list.add(i);
        return list;
    }

    List<Integer> getPrimes() {
        List<Integer> list = getList();
        Map<Integer, Boolean> map = new HashMap<>();
        for (Integer aList : list) map.put(aList, true);

        for (Map.Entry entry: map.entrySet()) {
            int key = (int) entry.getKey();
            boolean value = (boolean) entry.getValue();

            if (value) {
                int kk = key * key;

                if (kk <= limit)
                    for (int i = kk; i <= limit; i += key)
                        if (i % key == 0)
                            map.put(i, false);
            }
        }

        list = new ArrayList<>();
        for (Map.Entry entry : map.entrySet())
            if (entry.getValue().equals(true))
                list.add((Integer) entry.getKey());

        return list;
    }
}
