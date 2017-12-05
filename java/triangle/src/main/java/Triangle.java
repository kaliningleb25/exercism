class Triangle {
    double side1, side2, side3;

    Triangle(double side1, double side2, double side3) throws TriangleException, DegenerateException {
        if ((side1 <= 0 || side2 <= 0 || side3 <= 0 || (side1+side2 < side3)) ||
                ((side2+side3 < side1) || (side1+side3 < side2)))
            throw new TriangleException();
        if ((side1+side2 == side3) || (side1+side3 == side2 || (side2+side3 == side1)))
            throw new DegenerateException();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // An _equilateral_ triangle has all three sides the same length
    boolean isEquilateral() {
        return side1 == side2 && side2 == side3;
    }

    // An _isosceles_ triangle has at least two sides the same length.
    boolean isIsosceles() {
        return side1 == side2 || side1 == side3 || side2 == side3;
    }

    // A _scalene_ triangle has all sides of different lengths.
    boolean isScalene() {
        return side1 != side2 && side2 != side3;
    }
}
