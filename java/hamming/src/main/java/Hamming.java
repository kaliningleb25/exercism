public class Hamming {

    String leftStrand, rightStrand;

    Hamming(String leftStrand, String rightStrand) {
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
        if (leftStrand.length() != rightStrand.length())
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
    }

    int getHammingDistance() {
        int countDiffer = 0;
        char leftStrandChars[] = leftStrand.toUpperCase().toCharArray(),
                rightStrandChars[] = rightStrand.toUpperCase().toCharArray();

        for (int i = 0; i < leftStrandChars.length; i++) {
            if (leftStrandChars[i] != rightStrandChars[i])
                countDiffer++;
        }

        return countDiffer;
    }
}
