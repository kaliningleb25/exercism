class NaturalNumber {
	private int number;
    private int sum = 0;

    public NaturalNumber(int number) {
        if (number < 1)
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        this.number = number;
    }

    Classification getClassification() {
        for (int i = 1; i < number; i++) {
            if (number % i == 0)
                sum += i;
        }

        if (sum == number)
            return Classification.PERFECT;
        if (sum > number)
            return Classification.ABUNDANT;
        else
            return Classification.DEFICIENT;
    }
}
