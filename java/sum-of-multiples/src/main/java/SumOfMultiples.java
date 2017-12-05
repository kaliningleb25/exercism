class SumOfMultiples {
    private int number;
    private int[] set;
    
    SumOfMultiples(int number, int[] set) {
        this.number = number;
        this.set = set;
    }

    int getSum() {
        int sum = 0;

        for (int i = 0; i < number; i++) {
            for (int aSet : set) {
                if (i % aSet == 0) {
                    sum += i;
                    break;
                }
            }
        }
        return sum;
    }
}
