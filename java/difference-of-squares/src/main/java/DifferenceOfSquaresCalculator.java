/*
Find the difference between the square of the sum and the sum of the squares of the first N natural numbers.

The square of the sum of the first ten natural numbers is
(1 + 2 + ... + 10)² = 55² = 3025.

The sum of the squares of the first ten natural numbers is
1² + 2² + ... + 10² = 385.
 */

import java.util.Arrays;

public class DifferenceOfSquaresCalculator {
    private int[] numbers;
    private int squareOfsum;
    private int sumOfSquare;
    
    int computeSquareOfSumTo(int n) {
        numbers = new int[n];
        squareOfsum = 0;

        for (int i = 0; i < n; i++)
            numbers[i] = i+1;
        for (int i : numbers)
            squareOfsum += i;

        return squareOfsum*squareOfsum;
    }

    int computeSumOfSquaresTo(int n) {
        numbers = new int[n];
        sumOfSquare = 0;

        for (int i = 0; i < n; i++)
            numbers[i] = i+1;
        for (int i : numbers)
            sumOfSquare += i*i;

        return sumOfSquare;
    }

    int computeDifferenceOfSquares(int n) {
        squareOfsum = 0;
        sumOfSquare = 0;

        return computeSquareOfSumTo(n) - computeSumOfSquaresTo(n);
    }

    public static void main(String[] args) {
        DifferenceOfSquaresCalculator difference = new DifferenceOfSquaresCalculator();
        System.out.println(difference.computeSquareOfSumTo(5));
        System.out.println(difference.computeSumOfSquaresTo(5));
        System.out.println(difference.computeDifferenceOfSquares(5));
    }
}
