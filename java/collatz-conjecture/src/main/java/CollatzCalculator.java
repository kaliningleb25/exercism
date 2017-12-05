public class CollatzCalculator {
    int computeStepCount(int n) {
        if(n <= 0)
            throw new IllegalArgumentException("Only natural numbers are allowed");
        int count = 0;

        while (n != 1) {
            count++;
            if (n % 2 == 0)
                n /= 2;
            else
                n = n * 3 + 1;
        }
        return count;
    }
}