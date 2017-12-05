// It works fine with tests, but I know that if, for example, Input text will not contains all letters, but contains special symbols,
// like '_' or '[' it will work still. But if you'll read the definition of Pangram you will see it means that Text must contains all or
// almost all letters. So,that's it.

public class PangramChecker {

     public boolean isPangram(String input) {
        int i = 0;
        int count = 0;

        // Char array for 'a-z' and symbols
        char[] cArray = new char[33];
        // Filling the array
        for (char c = '['; c <= 'z'; c++) {
            cArray[i++] = c;
        }
        // Add special symbol - space
        cArray[cArray.length-1] = ' ';

        char[] stringToChar = input.toLowerCase().toCharArray();

        // Check if letter contains in Input text - increment count
        for (int j = 0; j < cArray.length; j++) {
            for (int k = 0; k < stringToChar.length; k++) {
                if (cArray[j] == stringToChar[k]) {
                    count++;
                    break;
                }
            }
        }

        // Check if Input text includes all letters - return true; else - return false
        if (count <= 26)
            return false;
        else
            return true;
    }

}
