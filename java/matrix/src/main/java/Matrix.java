
class Matrix {
    String matrixAsString;

    Matrix(String matrixAsString) {
        this.matrixAsString = matrixAsString;
    }

    int[] getRow(int rowNumber) {
        if (rowNumber >= getRowsCount() || rowNumber < 0)
            throw new RuntimeException("Wrong row number!");

        String[] s = matrixAsString.split("\n");
        String[] ss = s[rowNumber].split(" ");
        int[] row = new int[ss.length];
        
        for (int i = 0; i < row.length; i++) {
            row[i] = Integer.parseInt(ss[i]);
        }

        return row;
    }

    int[] getColumn(int columnNumber) {
        if (columnNumber >= getColumnsCount() || columnNumber < 0)
            throw new RuntimeException("Wrong column number!");

        int[] column = new int[getRowsCount()];
        int t;

        for (int i = 0; i < getRowsCount(); i++) {
            t = getRow(i)[columnNumber];
            column[i] = t;
        }

        return column;
    }

    int getRowsCount() {
        return matrixAsString.split("\n").length;
    }

    int getColumnsCount() {
        String[] s = matrixAsString.split("\n");
        String [] ss = s[0].split(" ");
        return ss.length;
    }
}
