class LargestSeriesProductCalculator {
    private String inputNumber;
    private int[] numbers;

    LargestSeriesProductCalculator(String inputNumber) {
        if (inputNumber == null)
            throw new IllegalArgumentException("String to search must be non-null.");
        if (Pattern.compile("\\D").matcher(inputNumber).find())
            throw new IllegalArgumentException("String to search may only contain digits.");

        this.inputNumber = inputNumber;
        numbers = new int[inputNumber.length()];
        String[] s = inputNumber.split("");

        for (int i = 0; i < inputNumber.length(); i++)
            numbers[i] = Integer.parseInt(s[i]);
    }

    long calculateLargestProductForSeriesLength(int numberOfDigits) {
        if (numberOfDigits < 0)
            throw new IllegalArgumentException("Series length must be non-negative.");
        if (numberOfDigits > numbers.length)
            throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
        if (numbers.length == 0 || numberOfDigits == 0)
            return 1;

        long mult = 1;
        long max = 0;
        int counter = 0;

        for (int i = 0; i < numbers.length;) {
            counter++;
            if (i != 0)
                while (i != counter)
                    i--;
            mult = 1;
                for (int k = 0; k < numberOfDigits; k++) {
                    mult *= numbers[i++];

                    if (k == numberOfDigits-1)
                        if (mult > max)
                            max = mult;
                }
            }

        return max;
    }
}
